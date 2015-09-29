import java.util.Scanner;

public class AvgOfThree
{
   public static void main (String[] args)
   {
       Scanner s = new Scanner(System.in);
       double a, b, c;

      System.out.print ("Enter the first number: ");
      a = s.nextDouble();
      

      System.out.print ("Enter the second number: ");
      b = s.nextDouble();

      System.out.print ("Enter the third number: ");
      c = s.nextDouble();

      // compute the average of the three numbers

      double avg = (a + b + c) / 3;
      
      System.out.println ("average " + avg);
      char x = '\u004b';
      
      System.out.println(x);
   }
}
