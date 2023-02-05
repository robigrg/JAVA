//Name: Robi Gurung
//MAC 190,
//Lab week 1, Part 2
import java.util.Scanner; //import scanner class which is in util folder inside the Java folder
public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
		System.out.println("Converting temperature from Fahrenheit to Celsius."); //printing a statement stating what the program is about
		System.out.println("Enter the temperature in Fahrenheit: "); //printing a statement asking for the input of the temperature to the user
		int Temperature = input.nextInt(); //taking the input by the user and assigning it to the variable 'Temperature' that has integer datatype
		int Celsius = (Temperature-32)*5/9; //mathematical calculation to convert the given temperature into Celsius
		System.out.println("The temperature in Celsius is:" +Celsius); //printing the converted result 
		}
}
