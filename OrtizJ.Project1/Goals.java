/*
*Author:  James Ortiz                            Date: 05/31/2015
*Filename: Goals.java                            COP 2551 - Project 1a
*Purpose: This program prompts the user for information and displays a message on the screen.
*/

import java.util.Scanner;                                   //Library function that allows the Scanner object to be used for input.

public class Goals                                          //Class definition named "Goals".
  
{                                                           //Beginning block for the Class "Goals".


   public static void main(String[] args)                   //Main method definition.
   
   {                                                        //Beginning block for the main method.                              
   
      String name, age, major, dreamJob;                    //Variable declarations for the program.
    
      Scanner scan  = new Scanner (System.in);              //Initiates Scanner object to read input.
    
      System.out.println("Please enter your name: ");       //Prints out phrase asking for a name.
    
      name = scan.nextLine();                               //Recieves input from user, places it in the variable "name".
    
      System.out.println("Please enter your age: ");        //Prints out phrase asking for the age.
    
      age = scan.nextLine();                                //Recieves input from the user, places value in the variable "age".
    
      System.out.println("Please enter your major: ");      //Prints out phrase asking the major.
    
      major = scan.nextLine();                              //Recieves input from the user, places value into variable "major".
    
      System.out.println("Please enter your dream job: ");  //Prints out phrase asking for the users dream job.
    
      dreamJob = scan.nextLine();                           //Recieves input from the user, stores value into vairable "dreamJob".
    
    
      System.out.println("The following are the results: \n");               //Prints phrase, and creates an extra line speace.
    
   
      System.out.println("Hello, my name is " + name + " and I am " + age +  //Displays results with the inputs the user has provided for
      "\nyears old. I am enjoying my time studying " + major + ", and \n" +  //each variable: "name", "age", "major", and "dreamJob".
      "I want to be a " + dreamJob + " when I grow up!");
   
   }                                                                         //Ending block for the main method.
  
}                                                                            //Ending block for the class definition.


/*
*Program Output:
*
*Please enter your name: 
*James
*Please enter your age: 
*24
*Please enter your major: 
*Computer Engineering
*Please enter your dream job: 
*Software Engineer
*The following are the results:
*
*Hello, my name is James and I am 24
*years old. I am enjoying my time studying Computer Engineering, and  
*I want to be a Software Engineer when I grow up!
*
*/