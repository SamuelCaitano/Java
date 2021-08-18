package appe;

public class Account {

    private String name;
    private double balance;

    //Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // method that deposits only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance += depositAmount; // add it to the balance
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
}