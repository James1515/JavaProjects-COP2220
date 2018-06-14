//******************************************************************
// Property.java    Author: Pamela Brauda
//
// Represents a generic piece of property.
//******************************************************************

abstract public class Property implements monthlyFee  //The monthlyFee interface is now implemented here.
{
   protected String owner;
   protected String address;
   protected String propertyID;
   
   //--------------------------------------------------------------
   // Constructor: Sets up this property using the specified
   // information.
   //--------------------------------------------------------------
   public Property (String cOwner, String cLocation, String cPropID)
   {
     
      owner = cOwner;
      address = cLocation;
      propertyID = cPropID;
   }
   //--------------------------------------------------------------
   //  Returns a string including the basic property information.
   //--------------------------------------------------------------
   public String toString()
   {
    
      String result = "Property Owner: " + owner + "\n";
      
      result += "Location: " + address + "\n";
      result += "Property ID: " + propertyID;
      
      return result;
   }
   
   //--------------------------------------------------------------
   // Derived classes must define the fee method for each type of
   // property.
   //--------------------------------------------------------------
   
   //------------------------------------------------------------
   //This method declaration has been removed, and replaced with 
   //an interface called "monthlyFee", which is
   //implemented in the class "Property":
   //------------------------------------------------------------
   //public abstract double monthlyFee();
   
}