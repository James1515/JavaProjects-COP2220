/*
* Author: James Ortiz                  Date: 07/05/2015
* Filename: GuessingGame.java          COP 2551 - Project 3
* 
*Purpose: This program is a guessing game with numbers. The program will 
*generate a random number, in which the user will input and guess
*the correct answer within the range of 1 - 100. The program will then determine,
*if the guess was either correct, above, or below the right answer and will also
*gradually keep count, and display the number of guesses.
*/

import java.util.Scanner;                 //Java library - Allows the usage of the Scanner class 
import java.util.Random;                  //Java library - Allows the useage of the Random class
import java.lang.Integer;                 //Java library - Allows the useage of the Integer class

public class GuessingGame                   //Class GuessingGame
{                                           //Intial block of the class GuessingGame
   public static void main(String[] args)   //main method
   {                                        //Intial block of the main method
   
      final int MAX = 100;                  //Declarations: An integer constant MAX, used to determine the range of numbers in the game.
      String again;                         //Declarations: String again, used as a sentinel to continue or quit the program.
      int number, response, counter;        //Declarations: interger number - used to hold the value of the random number 
                                            //Declarations: interger response - used as the guessing variable in the program.
                                            //Declarations: interger counter - used to count the guesses in the program.
                                          
      Scanner scan = new Scanner(System.in); //Creates an instance of a Scanner object
      Random generator = new Random();       //Creates an instance of a Random object
   
    
      do                                     //Do-while outer loop
      {                                      //Initial block of the do-while loop
      
         System.out.println("Guess a number between 1 and " + MAX); //Prints out a message about the range of numbers in the program.
         number = (int) (Math.random() * MAX) + 1;                  //Generates a random number in the range of 1 to 100.
         counter = 0;                                               //Sets counter value to zero
      
         do                                                         //Inner do-while loop
         {                                                          //Initial block of the inner do-while loop.
            System.out.print("Enter your guess: (or 0 to quit) ");  //Prints out phrase askeng the user to 
            response = Integer.parseInt(scan.nextLine());           //Stores guess into the interger variable response.
            counter = counter + 1;                                  //Repeatedly adds 1 to the counter.
          
            if (response > 0)                                       //If statement, validationg if the response is greater than zero. 
               if (response == number)                              //If Statement - validating if the response is equal to the value in number.
                  System.out.println("You have guessed correctly!" + " Guesses made: " + counter); //Displays message and the number of guesses.
               else 
                  if (response < number)                                          //If statement - validating if the guess is less than the 
                     System.out.println("Your guess was LOWER than the answer." + //Displays message mentioning the guessed value was less than the answer.
                        " Please try again.");
                  else
                     System.out.println("Your guess was HIGHER than the answer." + //Displays message mentioning the guessed value was greater than the answer. 
                        " Please try again.");
         
         
         
         }                                             //Ending block of the inner do-while loop
         while (response != number && response > 0);   //Do-while condition - if the result is true, the loop will continue.
      
         System.out.println();                         //Creates an extra line of space
         System.out.println("Do you want to play again? (y/n)");  //Displays a message letting the user decide whether they want to play again or not.
         again = scan.nextLine();                      //Recieves input from the user.
      
      }                                                //Ending block of the outer do-while loop
      while (again.equalsIgnoreCase("y"));             //If the user enters the lower-case letter "y" the loop will continue, otherwise, the program will end. will end.
   }                                                   //Ending block of the main method.

}                                                      //Ending block for the class GuessingGame
    

/*
   
 Program Output:

 Guess a number between 1 and 100
Enter your guess: (or 0 to quit) 50
Your guess was HIGHER than the answer. Please try again.
Enter your guess: (or 0 to quit) 40
Your guess was HIGHER than the answer. Please try again.
Enter your guess: (or 0 to quit) 35
Your guess was HIGHER than the answer. Please try again.
Enter your guess: (or 0 to quit) 30
Your guess was HIGHER than the answer. Please try again.
Enter your guess: (or 0 to quit) 20
You have guessed correctly! Guesses made: 5

Do you want to play again? (y/n)
 n
 
*/       
       
      
    
    
       
    
    
    
