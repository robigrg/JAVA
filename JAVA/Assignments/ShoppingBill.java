//Name: Robi Gurung
//MAC 190,
package com.company;
import java.util.Scanner; //import scanner class which is in util folder inside the java folder
public class Main {

    public static void main(String[] args) {
        int maxAmount = 100,maxItem = 3; //creating the maximum amount and number of items
	    System.out.println("You may buy up tp 3 items costing no more than $100!"); //printing a statement
	    Scanner one = new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
	    System.out.println("Enter the number of items bought:"); //asking the user tto input number of items bought
	    int itemBought = one.nextInt(); //taking the input from the user and assigning it to variable 'itemBought'
	    if(itemBought!= maxItem){ //if the itemBought does not match with the maximum number of items to be bought by the user
	    	System.out.println("You can only buy 3 items. Try again!");//printing a statement
		}
		else if(itemBought== maxItem){ // if the number of items bought by the user matches with the maximum number of items that needs to be bought then the following statements executes
	    	Scanner two = new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
	    	System.out.println("Enter the cost of #1 item: $"); //asking the user for the cost of item no.1
	    	int cost1 = two.nextInt(); //taking the input from the user and assigning it to variable 'cost1'
	    	if(cost1==maxAmount){
	    	    System.out.println("You spent $100, and are done shopping!");//printing a statement
	    	}
	    	else if(cost1>maxAmount){
	    	    System.out.println("You can only buy 3 items costing no more than $100!");//printing a statement
	    	    System.out.println("Try Again!");//printing a statement
            }
	    	else if(cost1<maxAmount){
                int Remain = maxAmount-cost1; //creating an integer variable 'Remain' to keep track of the remaining amount
                int Total = 0 + cost1; //creating an integer variable 'Total' to count the total amount the user spent
	    	    System.out.println("You may buy this item.");//printing a statement
	    	    System.out.println("You have spent $"+Total+" so far.");//printing a statement
	    	    System.out.println("You may buy up to 2 items costing no more than $"+Remain+".");//printing a statement
                Scanner three=new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
                System.out.println("Enter the cost of #2 item: $"); //asking the user for the cost of item no.1
                int cost2 = three.nextInt(); //taking the input from the user and assigning it to variable 'cost2'
                if (cost2==Remain){
                    System.out.println("You spent $100, and are done with shopping!");//printing a statement
                }
                else if(cost2<Remain){
                    Remain = Remain - cost2;
                    Total = Total + cost2;
                    System.out.println("You may buy this item.");//printing a statement
                    System.out.println("You have spent $"+Total+" so far.");//printing a statement
                    System.out.println("You may buy up to 1 items costing no more than $"+Remain+".");//printing a statement
                    Scanner four=new Scanner(System.in); //creates a new object of type scanner from the standard input of the program
                    System.out.println("Enter the cost of #3 item: $"); //asking the user for the cost of item no.1
                    int cost3=four.nextInt(); //taking the input from the user and assigning it to variable 'cost3'
                    if(cost3==Remain){
                        System.out.println("You spent $100, and are done with shopping!");//printing a statement
                    }
                    else if(cost3 < Remain || cost3 > Remain)
                        System.out.println("Please buy an item worth of $" + Remain + ".");//printing a statement
                }
	    	}
	    }
    }
}
