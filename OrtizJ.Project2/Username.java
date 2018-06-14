/*
*Author: James Ortiz             Date: 06/14/2015
*Filename: Username.java         COP 2551 - Project 2a
*
*Purpose: This program propts the user for the user's first name and last name, 
*and then generates a random username.
*/

import java.util.Scanner;                          //Introduces the Java library (java.util) - Allows the class "Scanner" to be used.
import java.util.Random;                           //Introduces the Java library (java.util). - Allows the class "Random" to be used.

public class Username                              //Begins a public class definition called "Username".
{                                                  //Starting block of the class "Username".


   public static void main(String[] args)          //Starts main method.
   {                                               //Starting block of the main method.
      
      Scanner scan = new Scanner(System.in);       //Creates a new object from the scanner class.
      Random generator = new Random();             //Creates a new object from the Random class.
      int randomNumber;                            //Declares interger variable called randomNumber.
      String firstName, lastName;                  //Declares string variables firstName, and lastName.
      String mutation1, mutation2, mutation3;      //Declares string variables mutation1, mutation2, and mutation3.
      
      
      System.out.println("Please enter your first name: "); //Asks user for the first name.
      
      firstName = scan.nextLine();                          //Scans for user input for the first name.
      
      System.out.println("Please enter your last name: ");  //Asks user for the last name
      
      lastName = scan.nextLine();                           //Scans for input for the last name.
      
      mutation1 = lastName.substring(0, 4);                 //Edits the last name.          
      
      mutation2 = firstName.substring(0, 2);                //Edits the first name.
      
      mutation3 = mutation1.concat(mutation2);              //Concatenates the last name and first name.
      
      randomNumber = generator.nextInt(90) + 10;            //Creates a random number in the range 10 - 99.
      
      System.out.println();                                 //Creates a space.
      
      System.out.println("Your random username is the following: " + //Line 45-46 prints out the username, and concatenates it with the random number generator.
      mutation3 + randomNumber);                                       
      
   }  //Ends "main" method.
}     //Ends public class deinfition called "Username".

/*
*Program Output:
*-----------------
*Please enter your first name:
*James
*Please enter your last name:
*Ortiz
*
*Your random username is the following: OrtiJa14
*
*/
 

    
    
    
    
    
    
    
    
    
    
    
