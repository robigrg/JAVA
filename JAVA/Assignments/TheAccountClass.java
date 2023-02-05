//Name: Robi Gurung
//MAC 190,
import java.util.Scanner; //import scanner class which is in util folder inside the Java folder
public class TheAccountClass {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000); //an account id created that contains id and a balance
        account.setAnnualInterestRate(4.5);  //passing the parameter 4.5% interest rate to the object setAnnualInterestRate of the account class
        account.withdraw(2500.0); //passing the parameter $2500 to the object withdraw of the account class
        account.deposit(3000.0); //passing the parameter $3000to the object deposit of the account class
        System.out.println("Balance: $" + account.getBalance()); //printing the Balance after withdrawing $2500 and depositing $3000
        System.out.println("Monthly Interest: " + account.getMonthlyInterest()); //printing the monthly interest
        System.out.println("Date Created: " + account.getDateCreated()); //printing the date created

    }
}

class Account {
    private int id = 0; //creating a private int data field named id for the account(default 0)
    private double balance = 0.0; //creating a private double data field named balance for the account(default 0)
    private static double annualInterestRate = 0.0; //creating a private double data field named annualInterestRate that stores the current interest rate(defult 0)
    private java.util.Date dateCreated; //creating a private Date data field named dateCreated that stores the date when the account was created

    public Account() {
        dateCreated = new java.util.Date(); //importing the current date to the data field dataCreated 
    }

    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id; //returning the current class id
    }

    public double getBalance() {
        return this.balance; //returning the current class balance
    }

    public double getAnnualInterestRate() {
        return annualInterestRate; //returning the current class annualInterestRate
    }

    public String getDateCreated() {
        return this.dateCreated.toString(); //returning the current class dateCreated by casting it into string
    }
    // parameterized constructors
    public void setId(int id) {
        this.id = id; //referring to the current class instance id
    }

    public void setBalance(double balance) {
        this.balance = balance; //referring to the current class instance balance
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate; //referring to the current class instance annualInterestRate
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ; //returning the current class getMonthlyInterestRate by dividing the annualInterestRate by 100 and then by 12
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate(); //returning the monthly interest rate by multiplying the balance with the monthly interest rate
    }

    public void withdraw(double amount) {
        this.balance = balance - amount; //referring to the current class instance withdraw by subtracting the amount from the balance
    }

    public void deposit(double amount) {
        this.balance = balance + amount; //referring to the current class instance deposit by adding amount to the balance
    }
}
