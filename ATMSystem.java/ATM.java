import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Account myAccount = new Account(123456, 10000);

System.out.print("Enter Pin: ");
int pin = sc.nextInt();
 if (pin == 1234) {
   System.out.println("PIN is Correct");
    System.out.println("Login Successful");

    myAccount.getBalance();

    System.out.println("Enter Depost Amount ");
    double dep = sc.nextDouble();
    myAccount.credit(dep);

    System.out.println("Enter withdrawal Amount ");
    double wd = sc.nextDouble();
    myAccount.debit(wd);

    myAccount.getBalance();

 } else {
    System.out.println("Wrong Pin");
 }
 sc.close();
    }
    
}
