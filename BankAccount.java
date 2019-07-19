public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //What is written below are constructors. Written as public *insert name of class* parenthesis with all parameters then bracket
    //This is what will happen if you put in no parameters
    public BankAccount() {
        this("56789", 2.50, "Default Name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    //This is what will happen if you put in all of the parameters
    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called ");
        //All of the variables only have to be initialized as done below ONCE. Since it is already done in this
        // constructor, you do not need to re-initialize in the other ones.
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //This is what will happen if you only put in these three parameters and adds default value for first two
    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Only " + this.balance + " available in your bank account. Withdrawal not processed.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

