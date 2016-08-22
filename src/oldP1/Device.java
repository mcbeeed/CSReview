package oldP1;

// Put your comment block here
public class Device
{
   private String name;           // name of the device
   private float readings[];      // array of readings for the device
   private int curIndex;          // index where next reading goes

   // No other object data are allowed!  [-3 for any other object data]
   // You are not allowed to do any reading or printing in this class!
   // Remove these 3 "how-to-proceed" comment lines.


   // Don't forget comment block here too!
   public Device ( String deviceName, int numReadings, float initValue )
   {
      //  ???
      //  Use numReadings to "new" (instantiate/create) the array, readings.
      //  Use initValue to initialize all the elements of the array
      //  Be sure to set name and initialize curIndex to 0.
      //  ???   AND remove these comment lines.
   }

   public String getName()
   {
//     ??? This is an easy one!
      return name;
   }

   @Override
   public String toString()
   {
      /*
      ??? This should make a String containing the name, then the curIndex,
          then the readings.  Make a temporary String variable and
          build it up with concatentation.  Then return it.
          Look at the format for the Print command.
          But don't comment this based on the Print command and don't mention
          print command
      */
      return name + curIndex + readings; // verify if correct usage
   }
/*
   ??? Make 2 (and ONLY 2) more public methods
 
      1) Store a reading - put the reading in the array at curIndex and
         advance curIndex.  Note that when curIndex gets to the end,
         wrap it back to 0.  This method should be a "void".

      2) Return a reading - returns a float, which is the average
         of all the readings in the array.  This MUST return a float.
         Use readings.length for the number of readings in the array.


   That's all. You can't have any other methods or data.  [-2 for each
   additional method added.
   You can't read or write in any method.
   If you get the urge in to put in more data or methods, you have some
   misunderstanding that needs to be cleared up!
*/
}
