public class Customer{
    private int customerId;
    private String name;
   
    public Customer(int customerId, String name){
        this.customerId = customerId;
        this.name = name;
    }
    public void authenticate() {
        System.out.println("Customer authenticated Successfully");
    }
    public void selectTransaction() {
        System.out.println("Transaction Selected");
    }
    public void showCustomer() {
        System.out.println("CustomerId:" + customerId);
        System.out.println("Name:" + name);
    }
    public static void main(String[] args) {
        Customer c1 = new Customer(100, "Mohamed Anwar Fathima");
        c1.showCustomer();
        c1.authenticate();
        c1.selectTransaction();
    }


} 