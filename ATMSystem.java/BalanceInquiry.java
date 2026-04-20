public class BalanceInquiry extends Transaction {
    public BalanceInquiry(int transactionId, String date, double amount) {
        super(transactionId, date, amount);
    }

    public void execute() {
        System.out.println("Balance Inquiry Transaction Processing");
        System.out.println("Current Balance:" + amount);
    }
    public static void main(String[] args) {
        BalanceInquiry b1 = new BalanceInquiry(202, "25.01.2026", 10000);
        b1.showTransaction();
        b1.execute();

    }
}
