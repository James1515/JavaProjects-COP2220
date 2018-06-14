/*
*Author: James Ortiz              Date: 06/14/2015
*Filename: IdNumber.java          COP 2551 - Project 2b
*Purpose:  This program generates a random identification number in the form "XXX-XX-XXXX".
*
*/

import java.text.DecimalFormat;  //Java library (java.text) - Allows the class "DecimalFormat" to be used.
import java.util.Random;         //Java library (java.util) - Allows the class "Random" to be used.       

public class IdNumber            //Begins a public class definition called "IdNumber".
{                                //Starting block of the public class "IdNumber".

   public static void main(String[] args)  //Begins main method.
   {                                       //Starting block for the main method.
    
      Random generator = new Random();                 //Instantiates an object from the class "Random".
      DecimalFormat fmt1 = new DecimalFormat("00");    //Creates an object of the class DecimalFormat for a 2 digit number.
      DecimalFormat fmt2 = new DecimalFormat("0000");  //Creates an object of the class DecimalFormat for a 4 digit number.
      
      int Digit1, Digit2, Digit3;         //Declares interger variables Digit1, Digit2, and Digit3
      int middleNum, lastNum;             //Declares interger variables  middleNum, and lastNum.
   
      
      Digit1 = generator.nextInt(8);      //The variable Digit1 is assigned to a generator which provides a random number between: 0 - 7.
      
      Digit2 = generator.nextInt(8);      //The variable Digit2 is assigned to a generator that provides a random number between: 0 - 7.
      
      Digit3 = generator.nextInt(8);      //The variable Digit2 is assigned to a generator that provides a random number between: 0 - 7.
      
      middleNum = generator.nextInt(74);  //The vaiiable "middleNum" is assigned to a generator the provides a number between: 0 - 73.
      
      lastNum = generator.nextInt(10000); //The variable "lastNum" is assigned to a generator that provides a number between: 0 - 9999.
      
      System.out.println("Your identification number is: " + Digit1 + Digit2 + Digit3 + "-" + //Line 34-35 prints out the results in XXX-XX-XXXX format.
         fmt1.format(middleNum) + "-" + fmt2.format(lastNum));
      
   } //Ending block for the main method.
}    //Ending block for the public class "IdNumber"



//
//Program Output:
//Your identification number is: 712-53-9212
//