public class Bank {
    private int bankId;
    private String name;

    public Bank(int bankId, String name) {
        this.bankId = bankId;
        this.name = name;
    }
    public void verifyAccount() {
        System.out.println("Account Verified by Bank.");
    }
    public void authorizeTransaction() {
        System.out.println("Transaction Authorized by Bank.");
    }
    public void refillATM(double amount) {
        System.out.println("ATM cash Refill:" + amount);
    }
    public void showBankDetails() {
        System.out.println("Bank Id:" + bankId);
        System.out.println("Bank Name:" + name);
    }
    public static void main(String[] args) {
        Bank b1 = new Bank(101, "People's Bank");
        b1.showBankDetails();
        b1.verifyAccount();
        b1.authorizeTransaction();
    }
}
