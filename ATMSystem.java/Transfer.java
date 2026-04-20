public class Transfer extends Transaction {
    public Transfer(int transactionId, String date, double amount) {
super(transactionId, date, amount);
    }
    public void execute() {
        System.out.println("Tranfer Transaction Processing");
        System.out.println("Amount Transferred" + amount);
    }
    public static void main(String[] args) {
        Transfer t1 = new Transfer(202, "25.01.2026", 2500);
        t1.showTransaction();
        t1.execute();
    }
}
