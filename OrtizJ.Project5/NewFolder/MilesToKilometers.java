import java.util.Scanner;

public class MilesToKilometers
{
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      final double Kilometer = 1.60935;
      
      System.out.println("Please enter miles: ");
      
      double miles = scan.nextDouble();
      
      double Mile = miles*Kilometer;
      
      System.out.println("The measurement in kilometers is: " + Mile);
      
      
      
   }

}
