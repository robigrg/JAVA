//Name: Robi Gurung
//MAC 190,
//Lab week 1, Part5
import java.util.Scanner; //import scanner class which is in util folder inside the java folder

public class ReverseNumber {

    public static void main(String[] args) {

        int num , reversed = 0; //initializing an integer variable 'num' and 'reversed'
        Scanner input=new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
        System.out.println("Enter a number:"); //asking the user to input a number to be reversed
        num = input.nextInt(); //taking the input from the user and assigning it to the variable 'num' 
        while(num != 0) { // a while loop that runs until and unless the value in the variable 'num' had '0'
            int digit = num % 10; //creating an integer data type variable called 'digit' where the value in 'num' variable is operated with MOD 10
            reversed = reversed * 10 + digit; //assigning the 'reversed' variable by multiplying it with 10 and adding the value in 'integer' variable
            num = num/10; //dividing the value in 'num' variable by 10
        }

        System.out.println("Reversed Number: " + reversed); //printing the reversed number
    }
}
