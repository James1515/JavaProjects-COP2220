/*
*Author:    James Ortiz                     Date: 05/31/2015
*Filename:  Money.java                      COP 2551 - Project 1b
*Purpose:   This program prompts the user for numbers of coins and displays the value of the coins on the screen.
*/

import java.util.Scanner;                                      //Library function that allows the use of the Scanner for input.

public class Money                                             //Initiates a class called "Money".

{                                                              //Begins class block.


 public static void main(String[] args)                        //Begins main method.
 
 {                                                             //Beginning block for the main method.
 
  int quarters, dimes, nickels, pennies;                       //Variable declarations of type "int".
  
  double total;                                                //Variable declaration of type "double".
  
  Scanner scan = new Scanner (System.in);                      //Initliates scanner object to read input from the user.
  
  System.out.print("Please enter the number of quarters: ");   //Prints out a phrase asking the number of quarters.
  
  quarters = scan.nextInt();                                   //Reads the user's input, and places the value in the variable, "quarters".
  
  System.out.print("Please enter the number of dimes: ");      //Prints out a phrase asking for the number of times from the user.
  
  dimes = scan.nextInt();                                      //Reads the users input, and places the value in the variable, "dimes".
  
  System.out.print("Please enter the number of nickels: ");    //Prints out a phrase asking for the number of nickels.
  
  nickels = scan.nextInt();                                    //Reads the user's input, and places the value in the variable, "nickels".
  
  System.out.print("Please enter the number of pennies: ");    //Prints out a phrase asking for the number of pennies.
  
  pennies = scan.nextInt();                                    //Reads the user's input, and places the value in the variable, "pennies".
  
  total = (pennies * .01d) + (nickels * .05d) + (dimes * .10d) + (quarters * .25d); //Calculates the total amount to two decimal places.
  
  System.out.print("\nCongratulations! Your change is worth $" + total);            //Prints out the amount of change
  
  }                                                                                 //Ending block for the main method.
                                                                   
}                                                                                   //Ending block for the class definition.

/*
*Program Output:
*
*Please enter the number of quarters: 13
*Please enter the number of dimes: 27
*Please enter the number of nickels: 153
*Please enter the number of pennies: 489
*
*Congratulations! Your change is worth $18.49
*/