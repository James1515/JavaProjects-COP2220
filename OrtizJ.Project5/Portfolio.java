//**********************************************************************
//  Portfolio.java    Author: Pamela Brauda
//
//  Represents the proprties managed by property management company.
//**********************************************************************


public class Portfolio
{

   private Property[] propertyList;
   //--------------------------------------------------------------------
   //  Constructor: Sets up the list of properties.
   //--------------------------------------------------------------------
   public Portfolio()
   {
      propertyList = new Property[9];    //Three new properties have been added here.
          
      propertyList[0] = new Commercial ("Jabba The Hutt", "123 Main Lane",
             "C-75", "Boba Fett", 2423.07);
      propertyList[1] = new Building ("Donald Trump", "1 Trump Tower",
             "B-221", "Omarosa", 1246.15);
      propertyList[2] = new Building ("Tony Stark", "789 Off Rocker", 
             "B-59", "Pepper Potts", 1169.23);
      propertyList[3] = new Residential ("Nick Fury", "678 Fifth Ave.",
             "R-154", "Phil Coulson", 20.55);
      propertyList[4] = new VacantLot ("Jack Bauer", "987 Suds Blvd.",
             "Chloe");
      propertyList[5] = new VacantLot("Lone Ranger", "321 Duds Lane",
             "Tonto");
      propertyList[6] = new MobileHomePark("Joe Moss", "76 Sans Souci Street",    //Mobile Home Park Added.
             "C-59", "John Smith", 1000.76);
      propertyList[7] = new MobileHomePark("Derrick Friedman", "23 Clark Street", //Mobile Home Park Added.
             "S-12", "Lumis Sepulveda", 780.43);
      propertyList[8] = new Residential("Johnathan Ferrer", "504 Marquis Court",  //New residential building added.
             "A-55", "Marlene Sullivan", 25.00);
          
      ((Commercial)propertyList[0]).assessPercentRent(5000.00);
      ((Residential)propertyList[3]).addUnits(20);
      ((MobileHomePark)propertyList[6]).addUnits(15);     //Adds 15 Mobile Home Units MobileHomePark #1.
      ((MobileHomePark)propertyList[7]).addUnits(20);     //Adds 20 Mobile Home Units MobileHomePark #2.
      ((Residential)propertyList[8]).addUnits(49);        //Adds 49 Units to the new residence.
          
   
   }
   
   //-------------------------------------------------------------------
   //   Calculates all management fees.
   //-------------------------------------------------------------------
   public void assessFees()
   {
   
      double amount;
      for(int count = 0; count < propertyList.length; count++)
      {
      
         System.out.println(propertyList[count]);
         amount = propertyList[count].monthlyFee();
       
         if(amount == 0.0)
            System.out.println("Public service to the community!");
         else
            System.out.println("Total fees: " + amount);
         
       
         System.out.println("----------------------------------");
       
      }
     
   
   }


}