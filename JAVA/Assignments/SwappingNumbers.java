//Name: Robi Gurung
//MAC 190,
//Lab week 1, Part 3
import java.util.Scanner; //import scanner class which is in util folder inside the Java folder
public class SwappingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
		System.out.println("Swapping Two Numbers Using A Third Variable."); //printing a statement stating what the program is about
		System.out.println("Enter a number A:"); //asking the user to input a number
		int A = input.nextInt(); //taking the input from the user and assigning it to a variable 'A' with integer datatype
		System.out.println("Enter a numebr B:"); //asking the user to input a number
		int B = input.nextInt(); //taking the input from the user and assigning it to a variable 'B' with integer datatype
		System.out.println("(Before Swapping) A: "+ A +" & B:"+B); //printing the numbers before swapping them
		int C = A; //declaring a third variable 'C' where the number assigned to 'A' is assigned here
		A = B; //assigning the number in variable 'B' to 'A'
		B = C; //assigning the number in variable 'C' to 'A'
		System.out.println("(After Swapping) A: "+ A +" & B:"+B); //printing the numbers after swapping them

	}

}
