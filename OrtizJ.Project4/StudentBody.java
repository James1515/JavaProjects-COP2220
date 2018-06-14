/*
*Author: James Ortiz            Date:07/31/2015   
*
*Filename: StudentBody.java     COP2551 - Project 4
*
*Purpose: Demonstrates aggregation between objects using a driver class.
*/

public class StudentBody //Public Class Header "StudentBody".
{                        //Initial brace of the class "StudentBody".

  
   public static void main(String[] args) //main header.
   {                                      //Initial brace of the main method.
   
      //--------------------------------------------------------------------------
      //Instances of the "Address" class.
      //Instantiates 4 addresses, each meant to correspond to a particular student.
      //--------------------------------------------------------------------------

      Address jhome = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
      Address mhome = new Address("123 Main Street", "Euclid", "OH", 44132);
      Address shome = new Address("6742 Sepulveda Street", "Philadelphia", "PA", 34241);
      Address chome = new Address("8990 Filimon Circle" , "Charleston", "SC", 78985);

      //--------------------------------------------------------------------------
      //Creates an instance of the Address class, to represent the school's address.
      //--------------------------------------------------------------------------

      Address school = new Address("800 Lancaster Avenue" , "Villanova", "PA", 19085);
      
      //-------------------------------------------------------------------------
      //Creates instances of the Student class, that in part, uses information
      //from the "Address" class. Students john, marsha, sandra, and casey 
      //are instantiated. 
      //-------------------------------------------------------------------------

      Student john = new Student("John", "Smith", jhome , school);
      Student marsha = new Student("Marsha", "Jones", mhome, school);
      Student sandra = new Student("Sandra", "Friedman", shome, school);
      Student casey = new Student("Casey", "Evans", chome, school);
      
     //-----------------------------------------------------------
     // Displays the intial information provided for each student:
     //-----------------------------------------------------------

      System.out.println(john);
      System.out.println(marsha);
      System.out.println(sandra);
      System.out.println(casey);
      
     //-----------------------------------------------------
     // Creates line seperation to avoid confusion.
     //-----------------------------------------------------      
      
      
      System.out.println();
      System.out.println();
      
     //-----------------------------------------------------
     // Sets test scores for tests 1-3 for John. Uses the 
     // setTestScores() method of the "Student" class.
     //-----------------------------------------------------
      
      john.setTestScores(1, 93);
      john.setTestScores(2, 86);
      john.setTestScores(3, 77);
      
     //-----------------------------------------------------
     // Displays John's test scores. Uses the getTestScore()
     // method of the "Student" class.
     //-----------------------------------------------------
      
      System.out.println("John's score for Test 1 is " + john.getTestScore(1));
      System.out.println("John's score for Test 2 is " + john.getTestScore(2));
      System.out.println("John's score for Test 3 is " + john.getTestScore(3));
      
     //-----------------------------------------------------
     // Prints spaces to avoid confusion.
     //-----------------------------------------------------
      
      System.out.println();
      System.out.println();
      
     //-----------------------------------------------------
     // Assigns test scores for Marsha. Uses the setTestScores()
     // method of the "Student" class.
     //-----------------------------------------------------
      
      marsha.setTestScores(1, 96);
      marsha.setTestScores(2, 79);
      marsha.setTestScores(3, 98);
      
     //-----------------------------------------------------
     // Displays test results for Marsha. Uses the
     // getTestScore() method of the Student class.
     //-----------------------------------------------------
      
      System.out.println("Marsha's score for Test 1 is " + marsha.getTestScore(1));
      System.out.println("Marsha's score for Test 2 is " + marsha.getTestScore(2));
      System.out.println("Marsha's score for Test 3 is " + marsha.getTestScore(3));
      
     //-----------------------------------------------------
     // Prints space to avoid confusion.
     //-----------------------------------------------------
      
      System.out.println();
      System.out.println();
   
     //-----------------------------------------------------
     // Assigns test scores for Sandra. Uses the setTestScores
     // method of the "Student" class.
     //-----------------------------------------------------
      
      sandra.setTestScores(1, 93);
      sandra.setTestScores(2, 80);
      sandra.setTestScores(3, 87);
      
     //-----------------------------------------------------
     // Displays Sandra's test scores. Uses the getTestScore()
     // method of the Student class.
     //-----------------------------------------------------
      
      System.out.println("Sandra's score for Test 1 is " + sandra.getTestScore(1));
      System.out.println("Sandra's score for Test 2 is " + sandra.getTestScore(2));
      System.out.println("Sandra's score for Test 3 is " + sandra.getTestScore(3));
      
     //-----------------------------------------------------
     // Creates space to avoid confusion.
     //-----------------------------------------------------
      
      System.out.println();
      System.out.println();
      
     //-----------------------------------------------------
     // Assigns test scores for Casey. Uses the setTestScores
     // method of the "Student" class.
     //-----------------------------------------------------
      
      casey.setTestScores(1, 90);
      casey.setTestScores(2, 81);
      casey.setTestScores(3, 72);
      
     //-----------------------------------------------------
     // Displays Casey's test scores. Uses the getTestScore()
     // method of the "Student" class.
     //-----------------------------------------------------
      
      System.out.println("Casey's score for Test 1 is " + sandra.getTestScore(1));
      System.out.println("Casey's score for Test 2 is " + sandra.getTestScore(2));
      System.out.println("Casey's score for Test 3 is " + sandra.getTestScore(3));
      
     //-----------------------------------------------------
     // Creates space to avoid output confusion.
     //-----------------------------------------------------
      
      System.out.println();
      System.out.println();
      
     //-----------------------------------------------------
     // Obtains the test average for each student.
     // Uses the testAverage() method of the "Student" class.
     //-----------------------------------------------------
      
      john.testAverage();
      marsha.testAverage();
      sandra.testAverage();
      casey.testAverage();
      
     //----------------------------------------------------------------------------
     // Displays each student's information (home and school address, test scores,
     // and average) after edits done to each student's test scores. 
     //
     // Includes a line of seperation that helps organize each student's information.
     //-----------------------------------------------------------------------------
      
   
      System.out.println(john);
      
      System.out.println();
      
      System.out.println(marsha);
      
      System.out.println();
      
      System.out.println(sandra);
      
      System.out.println();
      
      System.out.println(casey);
   
      
   }  //Ending brace for the main method
  
   
}     //Ending brace for the class "StudentBody".

/*
***Program Output:***

 John Smith
 Home Address:
 21 Jump Street
 Lynchburg, VA 24551
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 0.0
 Test Score #2:
 0.0
 Test Score #3:
 0.0
 The test average is: 00.00
 
 Marsha Jones
 Home Address:
 123 Main Street
 Euclid, OH 44132
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 0.0
 Test Score #2:
 0.0
 Test Score #3:
 0.0
 The test average is: 00.00
 
 Sandra Friedman
 Home Address:
 6742 Sepulveda Street
 Philadelphia, PA 34241
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 0.0
 Test Score #2:
 0.0
 Test Score #3:
 0.0
 The test average is: 00.00
 
 Casey Evans
 Home Address:
 8990 Filimon Circle
 Charleston, SC 78985
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 0.0
 Test Score #2:
 0.0
 Test Score #3:
 0.0
 The test average is: 00.00
 
 
 
 John's score for Test 1 is 93.0
 John's score for Test 2 is 86.0
 John's score for Test 3 is 77.0
 
 
 Marsha's score for Test 1 is 96.0
 Marsha's score for Test 2 is 79.0
 Marsha's score for Test 3 is 98.0
 
 
 Sandra's score for Test 1 is 93.0
 Sandra's score for Test 2 is 80.0
 Sandra's score for Test 3 is 87.0
 
 
 Casey's score for Test 1 is 93.0
 Casey's score for Test 2 is 80.0
 Casey's score for Test 3 is 87.0
 
 
 John Smith
 Home Address:
 21 Jump Street
 Lynchburg, VA 24551
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 93.0
 Test Score #2:
 86.0
 Test Score #3:
 77.0
 The test average is: 85.33
 
 
 Marsha Jones
 Home Address:
 123 Main Street
 Euclid, OH 44132
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 96.0
 Test Score #2:
 79.0
 Test Score #3:
 98.0
 The test average is: 91.00
 
 
 Sandra Friedman
 Home Address:
 6742 Sepulveda Street
 Philadelphia, PA 34241
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 93.0
 Test Score #2:
 80.0
 Test Score #3:
 87.0
 The test average is: 86.67
 
 
 Casey Evans
 Home Address:
 8990 Filimon Circle
 Charleston, SC 78985
 School Address:
 800 Lancaster Avenue
 Villanova, PA 19085
 Test Score #1:
 90.0
 Test Score #2:
 81.0
 Test Score #3:
 72.0
 The test average is: 81.00

*/