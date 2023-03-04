import java.util.Scanner;

 class EC_SwitchCase_False {

   static double arrTrue[] = {1500.652, 96, 17.987, 5219.8127, 360};
   static double arrFalse[] = {-96.152, -85.682, -615, -75, -2310.987};

   
   
   public static void main(String[] args) {
   
      
      System.out.println("Here at the Day West Bank we feel that uncertainty is part of the banking process.");
      System.out.println("Please enter a number 1-10: ");
      Scanner in = new Scanner(System.in);
      int name0 = in.nextInt();
      boolean name1 = (name0 <= 5);
      
      if(name1) {
      
      
      
      
      switch(name0) {
         case 1:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You receive: $"+"%,.2f\n" , arrTrue[0]);
            break;
         case 2:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You receive: $"+"%,.2f\n" , arrTrue[1]);
            break;
         case 3:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You receive: $"+"%,.2f\n" , arrTrue[2]);
            break;
         case 4:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You receive: $"+"%,.2f\n" , arrTrue[3]);
            break;
         case 5:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You receive: $"+"%,.2f\n" , arrTrue[4]);
            break;

         default:
            System.out.println("That input was not between 1-10");

         break;
      
      }
      }
      if (!name1) {
      
      switch(name0) {
         case 6:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You deposit: $"+"%,.2f\n" , arrFalse[0]);
            break;
         case 7:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You deposit: $"+"%,.2f\n" , arrFalse[1]);
            break;
         case 8:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You deposit: $"+"%,.2f\n" , arrFalse[2]);
            break;
         case 9:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You deposit: $"+"%,.2f\n" , arrFalse[3]);
            break;
         case 10:
            System.out.printf("bool was: "+"%b\n",name1);
            System.out.printf("You deposit: $"+"%,.2f\n" , arrFalse[4]);
            break;
         
         default:
            System.out.println("That input was not between 1-10");
         break;
      
      }
      
      
      
      }
      
      
      
   
   
   }

}