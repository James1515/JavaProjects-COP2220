//****************************************************************
//  File: MobileHomePark.java       Author: James Ortiz
//
//  A subclass made to add an alternative residence, a mobile 
//  home park.
//****************************************************************

public class MobileHomePark extends Residential  //The header of the class MobileHomePark: A sub-class of Residential.
{                                                //Initial code block.
   private final int unitsPerParkMAX = 25;    //Int Variable: creates a constant called limits of 25 Mobile Homes
   private int unitsPerPark;                  //Int Variable: to hold the current amount of Mobile Home Units.
   private double mobileHomeRate = 15.0;      //Double Variable: provides the rental rate for each unit. 
   
   //--------------------------------------------------------
   //  Constructor: Sets up a Mobile Home useing the specified 
   //  information.
   //--------------------------------------------------------
   
   public MobileHomePark(String cOwner, String cAddr, String cPropID,
                 String cPropMgr, double rate)
   {
      super(cOwner, cAddr, cPropID, cPropMgr, rate);   //Places the specified information needed to set up the constructor.  
      unitsPerPark = 1;                                //Assigns the initial value of units in the mobile home park.
   
   }
   
    //-------------------------------------------------------------------
    //  Method: addUnits(int moreUnits)
    //  Adds to the specified number of units to the Mobile home Park's
    //  count of occupied units. Checks to see if the limit
    //  has been reached.
    //-------------------------------------------------------------------
    public void addUnits(int moreUnits)
    {
    
      if(unitsPerPark <= unitsPerParkMAX) //If-else condition
      {        
         unitsPerPark += moreUnits;     //Assigns unitsPerPark variable to its current value, plus the value of "moreUnits".
      }
      else
      {
         System.out.println("No further units can be added!");  //Prints out this statement if the added units is greater then 25.
      }
    }
    
   //----------------------------------------------------------------------
   //  Method: monthlyFee()
   //  Computes and returns the monthly fee for this residential building.
   //----------------------------------------------------------------------
   public double monthlyFee()
   {
     double fee = mobileHomeRate * unitsPerPark;  //Calculates the fee.
     unitsPerPark = 1;                            //Re-assigns the unitsPerPark variable for one unit.    
     return fee;                                  //Returns the fee.
     
   }
   
   //-------------------------------------------------------------------------
   // Method: toString() 
   // Returns a string including basic property information.
   //-------------------------------------------------------------------------
   public String toString()
   { 
       String result = super.toString();                                        //Obtains information from the parent class, assgins it to result.
       result += "\nCurrent number of occupied Mobile Homes: " + unitsPerPark;  //Adds another line and provides the number of occupied mobile homes.
      
      return result;                                                            //Returns the result.
   }

}                                                                               //Ending code block.