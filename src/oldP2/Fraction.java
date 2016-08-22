package oldP2;

import java.util.StringTokenizer;

public class Fraction
{
   private int numerator, denominator;

   public Fraction()
   {
      // Set numerator to 0, denominator to 1
      numerator = 0;
      denominator = 1;
   }
   
   public Fraction(Fraction frac)
   {
      numerator = frac.numerator;
      denominator = frac.denominator;
   }
   
   @Override
   public String toString()
   {
      return numerator + "/" + denominator;
   }

   public static void main ( String args[] ) 
   {
      // this is the test-bed main AT THE BOTTOM
      // Remove these comments.

      Fraction c1 = new Fraction();
   }

}
