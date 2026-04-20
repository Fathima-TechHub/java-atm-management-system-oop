public class Withdraw extends Transaction {

    public Withdraw(int transactionId, String date, double amount) {
        super(transactionId, date, amount);
    }

    public void execute() {
        System.out.println("Withdraw Transaction Processing");
        System.out.println("Amount Withdrawn:" + amount);
    }
public static void main(String[] args) {
    Withdraw w1 = new Withdraw(201, "25.01.2026", 3000);
    w1.showTransaction();
    w1.execute();
}
}
