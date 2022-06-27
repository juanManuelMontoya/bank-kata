public class StatementDetail {
    private final StatementData statementData;
    private final Transaction transaction;

    public StatementDetail(StatementData statementData, Transaction transaction) {
        this.statementData = statementData;
        this.transaction = transaction;
    }

    public String statementDate() {
        return statementData.getStatementDate();
    }

    public String statementBalance() {
        return statementData.getCurrentBalance();
    }

    public String statementCredit() {
        return transaction.getCredit();
    }

    public String statementDebit() {
        return transaction.getDebit();
    }
}
