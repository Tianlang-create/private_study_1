public class ifVSswitch {
   public static void main(String[] args) {
      int monthNum = 8;
      if (monthNum == 1) {
         System.out.print("January");
      } else if (monthNum == 2) {
         System.out.print("February");
      }
      // and so on ...

      int monthNumber = 8;
      String month;
      switch (monthNumber) {
         case 1:
            month = "January";
            break;
         case 2:
            month = "February";
            break;
         // and so on ...
      }
   }
}