//***********************************************************************
// Author: James Ortiz          Date: 8/21/2015
//                              COP2551 - Project 5
// Filename: RealEstate.java
// Purpose: Demonstrates polymorphism via inheritance and interface.
//***********************************************************************

public class RealEstate                       //Header of the driver class called RealEstate 
{                                             //Initial block of the class.

  //-----------------------------------------------------------------
  //  Creates an inventory of properties managed and acesses fees.
  //-----------------------------------------------------------------
  public static void main(String[] args)     //Main header
  {                                          //Initial code block.
     Portfolio properties = new Portfolio(); //Creates an instance of the Portfolio object.
     
     properties.assessFees();                //Processes and displays the inventory of properties that are managed.
  }                                          //Ending block.
  
}                                            //Ending code block of the class.


/*
 Program Output:
 Property Owner: Jabba The Hutt
 Location: 123 Main Lane
 Property ID: C-75
 Property Manager: Boba Fett
 Monthly Percentage Rent fee : 137.5
 Total fees: 2560.57
 ----------------------------------
 Property Owner: Donald Trump
 Location: 1 Trump Tower
 Property ID: B-221
 Property Manager: Omarosa
 Total fees: 1246.15
 ----------------------------------
 Property Owner: Tony Stark
 Location: 789 Off Rocker
 Property ID: B-59
 Property Manager: Pepper Potts
 Total fees: 1169.23
 ----------------------------------
 Property Owner: Nick Fury
 Location: 678 Fifth Ave.
 Property ID: R-154
 Property Manager: Phil Coulson
 Current number of occupied units: 21
 Total fees: 431.55
 ----------------------------------
 Property Owner: Jack Bauer
 Location: 987 Suds Blvd.
 Property ID: Chloe
 Public service to the community!
 ----------------------------------
 Property Owner: Lone Ranger
 Location: 321 Duds Lane
 Property ID: Tonto
 Public service to the community!
 ----------------------------------
 Property Owner: Joe Moss
 Location: 76 Sans Souci Street
 Property ID: C-59
 Property Manager: John Smith
 Current number of occupied units: 1
 Current number of occupied Mobile Homes: 16
 Total fees: 240.0
 ----------------------------------
 Property Owner: Derrick Friedman
 Location: 23 Clark Street
 Property ID: S-12
 Property Manager: Lumis Sepulveda
 Current number of occupied units: 1
 Current number of occupied Mobile Homes: 21
 Total fees: 315.0
 ----------------------------------
 Property Owner: Johnathan Ferrer
 Location: 504 Marquis Court
 Property ID: A-55
 Property Manager: Marlene Sullivan
 Current number of occupied units: 50
 Total fees: 1100.0
 ----------------------------------
*/