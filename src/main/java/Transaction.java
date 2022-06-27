import java.util.Objects;

public class Transaction {
    private final Amount credit;
    private final Amount debit;

    public Transaction(Amount credit, Amount debit) {
        this.credit = Objects.requireNonNull(credit);
        this.debit = Objects.requireNonNull(debit);
    }

    public String getCredit() {
        return credit.amount();
    }

    public String getDebit() {
        return debit.amount();
    }
}
