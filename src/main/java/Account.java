import java.time.LocalDate;

public class Account {
    private static final Amount INITIAL_BALANCE = Amount.amountOf(0.0);
    private Amount balance;
    private Statement statement;

    public Account(Statement statement) {
        this.balance = INITIAL_BALANCE;
        this.statement = statement;
    }

    void deposit(Amount amount, LocalDate fecha) {
        var balanceOperation = balance.add(amount);
        var transaction = new Transaction(amount, INITIAL_BALANCE);
        addStatement(fecha, balanceOperation, transaction);
    }

    void withdraw(Amount amount, LocalDate fecha) {
        var balanceOperation = balance.withdraw(amount);
        var transaction = new Transaction(INITIAL_BALANCE, amount);
        addStatement(fecha, balanceOperation, transaction);
    }

    void printStatement() {
        System.out.println(statement.statements());
    }

    private void addStatement(LocalDate fecha, Amount balanceOperation, Transaction transaction) {
        var currentStatement = new StatementData(fecha, balanceOperation);
        statement.addStatement(new StatementDetail(currentStatement, transaction));
        updateBalance(balanceOperation);
    }

    private void updateBalance(Amount balance) {
        this.balance = balance;
    }

}
