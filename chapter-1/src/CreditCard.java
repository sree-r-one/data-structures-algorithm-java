public class CreditCard {

    // Instance Variables

    /**
     * Name of the customer
     */
    private String customer;

    /**
     * Name of the bank
     */
    private String bank;

    /**
     * Account identifier
     */
    private String account;

    /**
     * Credit limit (measured in dollar)
     */
    private int limit;

    /**
     * Current balance (measured in dollar)
     */
    protected double balance;

    // Constructors

    /**
     * Initialises the customer account with 5 parameters
     * 
     * @param customer
     * @param bank
     * @param account
     * @param limit
     * @param initialBalance
     */
    public CreditCard(String customer, String bank, String account, int limit, double initialBalance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBalance;
    }

    /**
     * Initialises customer account with 4 parameters
     * 
     * @param customer
     * @param bank
     * @param account
     * @param limit
     */
    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0);
    }

    // Accessor Methods

    /**
     * @return name of the customer
     */
    public String getCustomer() {
        return this.customer;
    }

    /**
     * @return name of the bank
     */
    public String getBank() {
        return this.bank;
    }

    /**
     * @return account number
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return limit of the account
     */
    public int getLimit() {
        return this.limit;
    }

    /**
     * @return balance of the account
     */
    public double getBalance() {
        return this.balance;
    }

    // Update Methods

    /**
     * Charges an amount to an account
     * 
     * @param price
     * @return true if successful
     */
    public boolean charge(double price) {

        // Charging failed
        if (this.balance + price > this.limit) {
            return false;
        }

        // Charging is successful
        this.balance += price;
        return true;
    }

    /**
     * Makes payment
     * 
     * @param amount paid by the customer
     */
    public void makePayment(double amount) {
        this.balance -= amount;
    }

    // Utility Method
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); 
    }

    public static void main(String[] args){
        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("John Doe", "DBS", "Savings", 100000);
  
        wallet[1] = new CreditCard("Jane Doe", "UOB", "Savings", 100000);
  
        wallet[2] = new CreditCard("Andy Dufrance", "POSB", "Savings", 100000);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3*val);
            wallet[0].charge(2*val);
            wallet[0].charge(val);
        }  

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);
        }
    }
}
