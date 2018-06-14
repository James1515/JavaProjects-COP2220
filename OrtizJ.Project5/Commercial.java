//*********************************************************************
//  Commercial.java   Author: Pamela Brauda
//
//  Represents a commercial building with a percentage of rent fee.
//*********************************************************************

public class Commercial extends Building 
{

   private double percentRent;
   
   //------------------------------------------------------------------
   // Constructor: Sets up this commercial building with the specified 
   // information.
   //------------------------------------------------------------------
   public Commercial (String cOwner, String cAddress, String cPropID,
                      String cPropMgr, double rate)
   {
   
      super(cOwner, cAddress, cPropID, cPropMgr, rate);
      
      percentRent = 0; //Percent of rent fee has not been determined
     
   }
   
  //-----------------------------------------------------------
  //  Calculates the percentage rent fee.
  //-----------------------------------------------------------
  public void assessPercentRent(double sales)
  {
  
    percentRent = sales * 0.0275;
  }
  
  //-----------------------------------------------------------------
  //  Computes and returns the total management fee for a commercial 
  //  building: monthly fee plus the percentage rent fee.
  //-----------------------------------------------------------------
  public double monthlyFee()
  {
    
    double fee = super.monthlyFee() + percentRent;
    
    percentRent = 0;
    
    return fee;
  }
  
  //------------------------------------------------------------------
  //  Returns information about this commercial building as a string.
  //------------------------------------------------------------------
  public String toString()
  {
    String result = super.toString();
    result += "\nMonthly Percentage Rent fee : " + percentRent;
    return result;
  
  }
}
