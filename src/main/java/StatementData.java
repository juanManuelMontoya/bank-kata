import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StatementData {

    private final LocalDate date;
    private final Amount currentBalance;

    public StatementData(LocalDate date, Amount currentBalance) {
        this.date = date;
        this.currentBalance = currentBalance;
    }

    public String getStatementDate() {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getCurrentBalance() {
        return currentBalance.amount();
    }
}
