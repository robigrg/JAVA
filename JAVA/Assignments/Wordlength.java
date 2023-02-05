//Name: Robi Gurung
//MAC 190,
//Lab week 1, Part4
import java.util.Scanner; //import scanner class which is in util folder inside the java folder
public class Wordlength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//creates a new object of type scanner from the standard input of the program
		System.out.println("Enter a Sentence:"); //asking the user to input a sentence
		String sentence = input.nextLine(); //assigning the input from the user to the string variable 'sentence'
		for(String part : sentence.split(" ")){ //using for loop where a string data type 'part' variable is used which takes a word at a time by splitting the sentence where the regex:" " 
			System.out.println(part+"="+part.length()); //printing the word stored in the 'part' after splitting and the number of character in it using the length function
		}

	}
}