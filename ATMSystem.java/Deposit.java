public class Deposit extends Transaction {
    public Deposit(int transactionId, String date, double amount) {
super(transactionId, date, amount);
    }
    public void execute() {
        System.out.println("Depost Transaction Processing");
        System.out.println("Deposite Amount:" + amount);
    }
    public static void main(String[] args) {
        Deposit d1 = new Deposit(202, "25.012026", 4000);
        d1.showTransaction();
        d1.execute();
    }
}
