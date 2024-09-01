public class CreditCard {

    private String customer;      
    private String bank;          
    private String account;       
    private int limit;            
    protected double balance;     

    
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);  
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {   
            return false;  
        }
        balance = balance+price;  
        return true;  
    }

    public void makePayment(double amount) {
        balance = balance-amount;
    }

  
    public void printSummary() {
        System.out.println("Customer = " + customer);
        System.out.println("Bank = " + bank);
        System.out.println("Account = " + account);
        System.out.println("Balance = " + balance);
        System.out.println("Limit = " + limit);
    }

    public static void main(String[] args) {

        CreditCard[] cc = new CreditCard[3];

        cc[0] = new CreditCard("James", "CCB", "198340119038", 5000, 1000.0);
        cc[1] = new CreditCard("Buoyuan", "BOC", "128710981239", 3000);
        cc[2] = new CreditCard("Yifang", "CDB", "123899871923", 4000, 500.0);

        cc[0].charge(200.0); 
        cc[1].charge(1500.0); 
        cc[2].charge(300.0); 

        for (CreditCard card : cc) {
            card.printSummary();
            System.out.println();

            while (card.getBalance() > 200) {
                card.makePayment(200);
                System.out.println("New balance after payment: " + card.getBalance());
            }

            System.out.println(); 
        }
    }
}
