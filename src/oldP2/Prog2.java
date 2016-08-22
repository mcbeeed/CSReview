package oldP2;

/**
Runs the main for Program 2
@author T. Scanlan
*/

public class Prog2
{
   /**
   Runs ComplexManipulator.
   @param args  is unused
   */
   public static void main ( String args[] ) 
   {
      try
      {
         new FractionManipulator().run();
      }
      catch ( Exception e)
      {
         System.out.println("Program Error!");
      }
   }
}
