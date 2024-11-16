public class ConditionalWhileCounter {
   public static void main(String[] args)
   {
      int conditionCounter = 0;
      int downCounter = 10;
      while (downCounter >= 1)
      {
         if (downCounter % 2 == 0 && downCounter % 4 ==0)
         {
            conditionCounter++;
         }
         downCounter--;
      }
   }
}
