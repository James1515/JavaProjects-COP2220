//****************************************************************
//  Residential.java        Author: Pamela Brauda
//
//  Represents a residential building with one or more units.
//****************************************************************

public class Residential extends Building
{

  private int unitCount;           //Represents the number of occupied units.
  private double difference;       //Finds the difference between units.
  private double complexityCharge; //Calculates the complexity charge. 
  //---------------------------------------------------------------------
  //  Constructor: Sets up this residential building using the specified
  //  information.
  //---------------------------------------------------------------------
  public Residential (String cOwner, String cAddr, String cPropID,
                 String cPropMgr, double rate)
                 
  {
     super(cOwner, cAddr, cPropID, cPropMgr, rate);
     
     unitCount = 1;
  
  }
  //----------------------------------------------------------------
  //  Adds the specified number of units to this building's 
  //  count of occupied units.
  //----------------------------------------------------------------
  public void addUnits(int moreUnits)
  {
    unitCount += moreUnits;                        
  }
  //-----------------------------------------------------------------
  //  Computes and returns the monthly for this residential building.
  //
  //  If the amount of units is greater than 40, this method will 
  //  calculate the complexity charge, and return the appropriate fee.
  //-----------------------------------------------------------------
  public double monthlyFee()
  {
   if(unitCount <= 40)                       //Compares values in unitCount.
    {
       double fee = rate * unitCount;        //Calculate fee for units when unit count is less than 40.
       return fee;                           //Returns fee.       
    }
   else
   {
     difference = unitCount - 40;                   //Obtains the difference between 40 and the unit count.
     complexityCharge = (difference * 10.00);       //Calculates the complexity charge.
     double fee = complexityCharge + (rate * 40);   //Assigns the total amount to fee.
     return fee;                                    //Returns fee.
    } 
     
      
  }
  //-----------------------------------------------------------------
  //  Returns information about this residential building as a string.
  //-----------------------------------------------------------------
  public String toString()
  {
    String result = super.toString();
    
    result += "\nCurrent number of occupied units: " + unitCount;
    
    return result;
  
  }
}

  
  
  
  
  
  
  