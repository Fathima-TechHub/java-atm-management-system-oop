import java.util.Scanner;
public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer(1001, "Mohamed Anwar Fathima");
        Account account = new Account(123456, 10000);
        Card card = new Card("12345-6788-9999", 1234);

        Bank bank = new Bank(101, "People's Bank");

        System.out.println("=====================");
        System.out.println("WELCOME TO ATM SYSTEM");
        System.out.println("=====================");

        customer.showCustomer();

        System.out.println("Enter Pin:");
        int enteredPin = sc.nextInt();

        if(card.validatePIN(enteredPin)){
            System.out.println("Login Successful");

            bank.verifyAccount();

            
            System.out.println("\nSelect Transaction:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Check");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.println("6. Maintenance Refill(Technican ONLY)");
            System.out.println("=====================================");
            System.out.println("Select an Option:");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Deposit Amount:");
                    Double dep = sc.nextDouble();
                    account.credit(dep);

                    Deposit d = new Deposit(201, "25.01.2026", dep);
                    d.execute();
                    break;

                    case 2:
                        System.out.println("Enter Withdraw Amount:");
                        double wd = sc.nextDouble();
                        account.debit(wd);

                        Withdraw w = new Withdraw(202, "25.01.2026", wd);
                        w.execute();
                     break;

                     case 3:
                        account.getBalance();

                        BalanceInquiry b = new BalanceInquiry(203, "25.01.2026", account.getBalanceValue());
                        b.execute();
                        break;
                        
                            case 4: 
                            System.out.println("Enter Transfer Amount:");
                            double tr = sc.nextDouble();
                            account.debit(tr);
                            System.out.println("Transfer Successful:" + tr);
                            break;
                            case 5:
                                System.out.println("Thank you for using ATM");
                                break;

                            case 6:
    System.out.println("Enter cash refill amount:");
    double refill = sc.nextDouble();
    Maintenance m = new Maintenance(301,"Cash Refill");
    m.refillCash(refill);
    break;
    default:
        System.out.println("Invalid Choice");
    
            } 
            bank.authorizeTransaction();
        } else {
            System.out.println("Wrong PIN");
        }
        
        sc.close();
    }
}
