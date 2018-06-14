
import java.util.Scanner;
public class TempConverter
{
   public static void main(String[] args)
   {
    
      double fahrenheit;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter a temperature in Fahrenheit: ");
      
      fahrenheit = scan.nextDouble();
      
      double celsius = (fahrenheit - 32) * 5/9;
      
      System.out.println("The temp. in deg. celsius is: " + celsius);
      
      
   }

}