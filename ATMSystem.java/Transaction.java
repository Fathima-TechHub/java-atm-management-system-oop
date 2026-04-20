public class Transaction {
    protected int transactionId;
    protected String date;
    protected double amount;

    public Transaction(int transactionId, String date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
    }
    public void execute() {
System.out.println("Transaction Executed");
    }
    public void showTransaction() {
        System.out.println("TransactionId:" + transactionId);
        System.out.println("Date:" + date);
        System.out.println("Amount:" + amount);
    }
    public static void main(String[] args) {
        Transaction t1 = new Transaction(1, "25.01.2026", 5000);
        t1.showTransaction();
        t1.execute();
    }

}
