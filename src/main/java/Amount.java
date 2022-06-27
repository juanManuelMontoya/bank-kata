import java.util.Objects;

public class Amount {

    private final Double amount;
    private final Currency currency;
    private static final int MINIMUM_AMOUNT = 0;


    private Amount(Double amount, Currency currency) {
        this.amount = validateAmount(amount);
        this.currency = Objects.requireNonNull(currency);
    }

    private Double validateAmount(Double amount) {
        Objects.requireNonNull(amount);
        if (amount < MINIMUM_AMOUNT) {
            throw new IllegalArgumentException();
        }
        return amount;
    }

    public static Amount amountOf(Double amount) {
        return new Amount(amount, Currency.COP);
    }

    public String amount() {
        return this.amount + "";
    }

    public Amount add(Amount object) {
        return new Amount((this.amount + object.amount), object.currency);
    }

    public Amount withdraw(Amount other) {
        return new Amount((this.amount - other.amount), other.currency);
    }
}
