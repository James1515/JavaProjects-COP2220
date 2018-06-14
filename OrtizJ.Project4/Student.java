//*******************************************************
//File: Student.java        Author: Lewis/Loftus
//
//Purpose: Respresents a college student.
//*******************************************************

import java.text.DecimalFormat;        //Allows for use of the DecimalFormat class.

public class Student                   //Header of the public class "Student"
{                                      //Initial brace of the class "Student"

   private String firstName, lastName;          //Declares two strings: firstName, and lastName.
   private Address homeAddress, schoolAddress;  //Declares two Address values homeAddress, and studentAddress from the "Address class"
   private double test1, test2, test3;          //Declares 3 type double variables: test1, test2, and test3.
   private double average;                      //Declares an average variable of type double.
   private DecimalFormat formatter = new DecimalFormat("#00.00"); //Creates an instance of the "DecimalFormat" class.
  
  //-----------------------------------------------------
  //Constructor: Sets up the student with specified values.
  //-----------------------------------------------------
  
   public Student(String first, String last, Address home, Address school, double exam1, double exam2, double exam3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = exam1;
      test2 = exam2;
      test3 = exam3;
   }
   
   //----------------------------------------------------
   //**Overloaded Constructor**
   //Each test score assumed to be zero.
   //Assigns a default "0.0" value for test1, test2, and test3.
   //-----------------------------------------------------
   
   public Student(String first, String last, Address home, Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = 0.0;
      test2 = 0.0;
      test3 = 0.0;
   }
   
   //----------------------------------------------------------------
   //Accepts two parameters, the test number, and the score. 
   //Uses an if-else statement to determine which test is to be 
   //assigned a score. 
   //----------------------------------------------------------------
   
   public void setTestScores(int TestNumber, double score)
   {
      if(TestNumber == 1)
      {
         test1 = score;
      }
      else
         if(TestNumber == 2)
         {
            test2 = score;
         }
         else
            if(TestNumber == 3)
            {
               test3 = score;
            }   
   }
   
   //--------------------------------------------------------------
   //Gets the test score, accepts the test number as a parameter.
   //Returns the test score according to the number that is passed
   //as a parameter.
   //--------------------------------------------------------------
   
   public double getTestScore(int testNumber)
   {
      if (testNumber == 1 || testNumber == 2 || testNumber == 3)
      {
         if(testNumber == 1)
         {
            return test1;
         }
         else
            if(testNumber == 2)
            {
               return test2;
            }
            else
               return test3;
      
      }
      
      return 0;
   
   }

   //-------------------------------------------------------------------------
   //Calculates, and returns the average test acore for the student.
   //-------------------------------------------------------------------------
   public double testAverage()
   {
      average = (test1 + test2 + test3) / 3.0;
      return average;
   }

  
  //-------------------------------------------------------
  // Returns a string description of this student object. 
  // Includes the values of each test, and also the average 
  // of the tests in ###.## format (within two decimal places).
  //-------------------------------------------------------
  
   public String toString()
   {
      String result;
      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress + "\n";
      result += "Test Score #1:\n" + test1 + "\n";
      result += "Test Score #2:\n" + test2 + "\n";
      result += "Test Score #3:\n" + test3 + "\n";
      result += "The test average is: " + formatter.format(average) + "\n";
      return result;
   }
  
}