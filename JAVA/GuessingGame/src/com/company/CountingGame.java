package com.company;
import java.util.Scanner;
import java.lang.*;


public class CountingGame extends result{
    private int totalNum;



    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
    public int getTotalNum() {
        return totalNum;
    }



    public static void first(){
       Scanner input =new Scanner(System.in);

       System.out.println("The guessing game will find your age and your lucky number between 0-9..");

       System.out.print("Press any key to continue . . . ");
       input.nextLine();

       System.out.println("Alright, let me guess your age.");

       System.out.print("Press to continue . . . ");

       input.nextLine();

       System.out.println("Do you want to play, just a simple math. Enter y/n");
       char continueY=input.next().charAt(0);
       char con = Character.toUpperCase(continueY);


               if (con=='Y' || con=='y'){
               System.out.println("Its simple, what's your age ? ");
               System.out.print("Press to continue . . . ");
               input.nextLine();
               System.out.println("Keep in your mind, you don't have to tell me.");
               System.out.print("Press to continue . . . ");
               input.nextLine();
               System.out.print("First, multiply your age by number 2.");
               System.out.print("Press to continue . . . ");
               input.nextLine();
               System.out.print("Add 5 to the above total.");
               System.out.print("Press to continue . . . ");
               input.nextLine();
               System.out.print("Multiply the above total by 5.");
               System.out.print("Save that number in your mind..Press to continue . . . ");
               input.nextLine();
               System.out.println("Now think your lucky number between 0-9");
               System.out.print("Press to continue . . . ");
               input.nextLine();
               System.out.print("add the first total and your lucky number. ");
               System.out.print("Press to continue. . . ");
               input.nextLine();

               System.out.print("Enter the total number: ");

               int totalnum = input.nextInt();

               System.out.print("And your lucky number is : ");

               System.out.print(" \n I guess you are " + findResult(totalnum) + " years old.");

               System.out.println(" \n I hope you enjoyed playing the game.");

                   System.out.println(" \n I hope you enjoyed playing the game.");





       }


       }
   }


