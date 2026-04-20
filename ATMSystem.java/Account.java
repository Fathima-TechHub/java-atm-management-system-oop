public class Account{
 private int accountNumber;
 private double balance;

public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
}
 
 public void credit (double amount) {
    balance += amount;
    System.out.println("Deposit Successful" + balance);
 }
 public void debit(double amount) {
if (amount <= balance) {
    balance -= amount; 
    System.out.println("withdrwal Successful");
} else {
    System.out.println("Insufficient Balance");
}
 }
 public void getBalance() {
    System.out.println("Current balance:" + balance);
 }
 public void showBalance() {
    System.out.println("Accountnumber:" + accountNumber);
    System.out.println("Currentbalance:" + balance);
 }
 public double getBalanceValue() {
    return balance;
}

 public static void main(String[] args) {
    Account myAccount = new Account (123456, 10000);
     
    myAccount.showBalance();
    myAccount.credit(5000);
    myAccount.debit(2000);
    myAccount.debit(4000);
    myAccount.showBalance();
}
 }
