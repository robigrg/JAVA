//Name: Robi Gurung
//MAC 190,
import java.util.Scanner; //import scanner class which is in util folder inside the Java folder
import java.text.DecimalFormat; //import decimal format class which is in util folder inside the Java folder
public class CreditCard {
	public static void main(String[] args) { 
	DecimalFormat format = new DecimalFormat("##.00"); //assigning the format variable to two decimal places
	String name, level, choice; //creating string variables for the user input
	String p = "Platinum", g = "Gold", s = "Silver", y ="YES", n = "NO"; //creating string variables that are pre-defined
	double balance, minPayment; //creating variables with double data type for mathematical operations
	Scanner input = new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
	System.out.println("Credit Card Program by Robi Gurung"); //printing a statement
	System.out.println("Please Enter A Customer Name: ");  //asking the user for customer name
	name = input.nextLine(); //assigning the name into the 'name' variable  
	System.out.println("Please Enter The Customer's Member Level: "); //asking the user for the customer level
	level = input.nextLine(); //assigning the level of the customer in the variable
	Scanner user = new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
	if (level.equals(p)){ //checking if the level inputed by the user is equal to the value stored in 'p'
		System.out.println("Please Enter The Current Balance: "); //asking the user for the current balance
		balance = input.nextDouble(); //assigning the amount into the 'balance' variable for further operations
		System.out.println("Was The Payment Made Late?(Yes/No): ");//asking the user if the payment was made late or not
		choice = user.nextLine(); //assigning the input given by the user as (yes/no) to 'choice' variable
		choice = choice.toUpperCase(); //changing the value inputed by the user to upper string
		if (choice.equals(y)){ //if the payment was made late then the following lines executes
			minPayment=(balance*2/100)+(balance*2/100); //calculating the minimum payment that the customer has to pay
			System.out.println(); //printing the results from the given conditions
			System.out.println("======================================================================================================================");
			System.out.println("\tStatement");
			System.out.println("======================================================================================================================");
			System.out.println("Billing Information For "+name);
			System.out.println("Customer Level: "+level);
			System.out.println("Credit Card Balance: $"+format.format(balance));
			System.out.println("Interest Rate For Late Payment: 2% per month");
			System.out.println("Required Minimum Payment: $"+format.format(minPayment));

		}
		else if (choice.equals(n)){ //if the payment was not made late then the following lines executes
			minPayment=(balance*2/100)+(balance*1/100); //calculating the minimum payment that the customer has to pay
			System.out.println();//printing the results from the given conditions
			System.out.println("======================================================================================================================");
			System.out.println("\tStatement");
			System.out.println("======================================================================================================================");
			System.out.println("Billing Information For "+name);
			System.out.println("Customer Level: "+level);
			System.out.println("Credit Card Balance: $"+format.format(balance));
			System.out.println("Interest Rate: 1% per month");
			System.out.println("Required Minimum Payment: $"+format.format(minPayment));
		}
	}
	else if (level.equals(g)){ //checking if the level inputed by the user is equal to the value stored in 'g'
		System.out.println("Please Enter The Current Balance: ");//asking the user for the current balance
		balance = input.nextDouble(); //assigning the amount into the 'balance' variable for further operations
		System.out.println("Was The Payment Made Late?(Yes/No): "); //asking the user if the payment was made late or not
		choice = user.nextLine(); //assigning the input given by the user as (yes/no) to 'choice' variable
		choice = choice.toUpperCase(); //changing the value inputed by the user to upper string
		if (choice.equals(y)){ //if the payment was made late then the following lines executes
			minPayment=(balance*2/100)+(balance*4/100); //calculating the minimum payment that the customer has to pay
			System.out.println();//printing the results from the given conditions
			System.out.println("======================================================================================================================");
			System.out.println("\tStatement");
			System.out.println("======================================================================================================================");
			System.out.println("Billing Information For "+name);
			System.out.println("Customer Level: "+level);
			System.out.println("Credit Card Balance: $"+format.format(balance));
			System.out.println("Interest Rate For Late Payment: 4% per month");
			System.out.println("Required Minimum Payment: $"+format.format(minPayment));
		}
		else if (choice.equals(n)){ //if the payment was not made late then the following lines executes
			minPayment=(balance*2/100)+(balance*2/100); //calculating the minimum payment that the customer has to pay
			System.out.println();//printing the results from the given conditions
			System.out.println("======================================================================================================================");
			System.out.println("\tStatement");
			System.out.println("======================================================================================================================");
			System.out.println("Billing Information For "+name);
			System.out.println("Customer Level: "+level);
			System.out.println("Credit Card Balance: $"+format.format(balance));
			System.out.println("Interest Rate: 2% per month");
			System.out.println("Required Minimum Payment: $"+format.format(minPayment));
		}
	}
	else if (level.equals(s)){ //checking if the level inputed by the user is equal to the value stored in 's'
		System.out.println("Please Enter The Current Balance: "); //asking the user for the current balance
		balance = input.nextDouble(); //assigning the amount into the 'balance' variable for further operations
		System.out.println("Was The Payment Made Late?(Yes/No): "); //asking the user if the payment was made late or not
		choice = user.nextLine(); //assigning the input given by the user as (yes/no) to 'choice' variable
		choice = choice.toUpperCase(); //changing the value inputed by the user to upper string
		if (choice.equals(y)){ //if the payment was made late then the following lines executes
			int lateFee = 20; //additional late fee for silver level customer
			minPayment=(balance*2/100)+(balance*3/100)+lateFee; //calculating the minimum payment that the customer has to pay
			System.out.println();//printing the results from the given conditions
			System.out.println("======================================================================================================================");
			System.out.println("\tStatement");
			System.out.println("======================================================================================================================");
			System.out.println("Billing Information For "+name);
			System.out.println("Customer Level: "+level);
			System.out.println("Credit Card Balance: $"+format.format(balance));
			System.out.println("Interest Rate For Late Payment: 3% per month");
			System.out.println("Late Fee: $"+lateFee);
			System.out.println("Required Minimum Payment: $"+format.format(minPayment));
		}
		else if (choice.equals(n)){ //if the payment was not made late then the following lines executes
			minPayment=(balance*2/100)+(balance*3/100);
			System.out.println();//printing the results from the given conditions
			System.out.println("======================================================================================================================");
			System.out.println("\tStatement");
			System.out.println("======================================================================================================================");
			System.out.println("Billing Information For "+name);
			System.out.println("Customer Level: "+level);
			System.out.println("Credit Card Balance: $"+format.format(balance));
			System.out.println("Interest Rate: 3% per month");
			System.out.println("Required Minimum Payment: $"+format.format(minPayment));
		}
	}	
	else{ //if the user inputed anything else than the mentioned levels then the following lines gets executed
		System.out.println("Please type in the correct level(Platinum/Gold/Silver)"); //printing a statement when the user input is mismatched with the condition
		System.out.println("Try Again!");
		System.exit(0); //exiting the program
	}
	System.out.println("======================================================================================================================");
	System.out.println("\tThank-You!"); //printing a statement
	System.out.println("======================================================================================================================");
	}
	
}
		
