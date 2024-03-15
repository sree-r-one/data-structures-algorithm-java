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
     * @param customer
     * @param bank
     * @param account
     * @param limit
     * @param initialBalance
     */
    public CreditCard(String customer, String bank,String account, int limit, double initialBalance){
        this.customer = customer; 
        this.bank = bank;
        this.account = account;
        this.limit = limit; 
        this.balance = initialBalance;
    }

    /**
     * Initialises customer account with 4 parameters 
     * @param customer
     * @param bank
     * @param account
     * @param limit
     */
    public CreditCard(String customer, String bank, String account, int limit){
        this(customer,bank,account,limit,0.0);
    }

    // Accessor Methods 

    /**
     * @return name of the customer 
     */
    public String getCustomer(){
        return this.customer;
    }

    /**
     * @return name of the bank
     */
    public String getBank(){
        return this.bank; 
    }

    /**
     * @return account number
     */
    public String getAccount(){
        return this.account;
    }

    /**
     * @return limit of the account
     */
    public int getLimit(){
        return this.limit;
    }

    /**
     * @return balance of the account
     */
    public double getBalance(){
        return this.balance;
    }

    // Update Methods 

    // Utility Method
}
