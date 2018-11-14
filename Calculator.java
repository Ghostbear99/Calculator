/****************************************************************
   Name: Chris Gawbill
   Things to Do:
                  Fix Sutraction Method (Outputting Negative)
                  Further improve the Quadratic Equation
                  Graphing Capabilities
                  GUI Interface with text box nad buttons
                        Use String.split to get the values
*************************************************************/
import java.util.*;
public class Calculator{

   Scanner scan = new Scanner(System.in); 
   boolean set = false;
   boolean anothoperat  = false;
   // Used across all methods. For example is user wants to add then multiply it will store the addition in this and then multiply
   double globalmath = 0;
   // Used across all methods but handles the math between the two numbers entered in by user
   double localmath = 0;
   // Handles the two number input
   double enmath1 = 0;
   double enmath2 = 0;
   double enmath3 = 0;
   // Handles menu input
   String input = null;
   
   public Calculator(){
   
   }
   public void setUp(){      
      Menu();
      
      while(set == false){
         input = scan.nextLine();
         if(input.equals("Addition")){
            Addition();
            set = true;
         }else if(input.equals("Subtraction")){
            Subtraction();
            set = true;
         }else if(input.equals("Multiplication")){
            Multiplication();
            set = true;
         }else if(input.equals("Division")){
            Division();
            set = true;
         }else if(input.equals("Quadratic")){
            Quadratic();
            set = true;
         }else if(input.equals("Graphing")){
            // Call Graphing Method
            set = true;
         }else if(input.equals("Menu")){
            Menu();
         }else{
            System.out.println("ERROR_UNRECOGNIZED INPUT\nIf you need the menu enter Menu");
         }
       }
   }
   public void Menu(){
      System.out.println("What do you want to do?");
      System.out.println("\nCapabilities\n--------------------");
      System.out.println("\n\tAddition\n\tSubtraction\n\tMultiplication\n\tDivision\n\tQuadtradics\n\tGraphing");
   }
   public void inmathInput(){
       set = false;
       input = scan.nextLine();
       while(set == false){
         input = scan.nextLine();
         if(input.equals("Addition")){
            anothoperat = true;
            Addition();
            set = true;
         }else if(input.equals("Subtraction")){
            anothoperat = true;
            Subtraction();
            set = true;
         }else if(input.equals("Multiplication")){
            anothoperat = true;
            Multiplication();
            set = true;
         }else if(input.equals("Division")){
            anothoperat = true;
            Division();
            set = true;
         }else if(input.equals("Output")){
            Output();
         }else{
            System.out.println("ERROR_UNRECOGNIZED INPUT\nHere is What You Can Do\n------------------------------------"
                                + "\n\tAddition\n\tSubtraction\n\tMultiplication\n\tDivision\n\tOutput");
         }
       }

   }
   public void Addition(){
      System.out.println("Enter in a Number");
      enmath1 = scan.nextDouble();
      System.out.println("Enter in a Number");
      enmath2 = scan.nextDouble();
      
      localmath = enmath1+enmath2;
      globalmath = globalmath + localmath;
      
      System.out.println("What Do You Want to do Next?");
      inmathInput();
   }
   public void Subtraction(){
      System.out.println("Enter in a Number");
      enmath1 = scan.nextDouble();
      System.out.println("Enter in a Number");
      enmath2 = scan.nextDouble();
      
      localmath = enmath1 - enmath2;
      if(anothoperat  = false){
         globalmath = localmath;
         System.out.println("What Do You Want to do Next:");
         inmathInput();
      }
      globalmath = globalmath - localmath;
      System.out.println("What Do You Want to do Next:");
      inmathInput();
      
   
   }
   public void Multiplication(){
      System.out.println("Enter in a Number");
      enmath1 = scan.nextDouble();
      System.out.println("Enter in a Number");
      enmath2 = scan.nextDouble();
      
      if(enmath1 == 0.0 || enmath2 == 0.0){
         localmath = enmath1 + enmath2;
         if(anothoperat == false){
            globalmath = localmath;
            System.out.println("What Do You Want to do Next:");
            inmathInput();
         }
         globalmath = globalmath * localmath;
         System.out.println("What Do You Want to do Next:");
         inmathInput();
   
      }else{
         localmath = enmath1 * enmath2;
         if(anothoperat == false){
            globalmath = localmath;
            System.out.println("What Do You Want to do Next:");
            inmathInput();
         }
         globalmath = globalmath * localmath;
         System.out.println("What Do You Want to do Next:");
         inmathInput();

      }
   }
   public void Division(){
      System.out.println("Enter in a Number");
      enmath1 = scan.nextDouble();
      System.out.println("Enter in a Number");
      enmath2 = scan.nextDouble();
      
      if(enmath1 == 0.0 || enmath2 == 0.0){
         localmath = enmath1 + enmath2;
         if(anothoperat == false){
            globalmath = localmath;
            System.out.println("What Do You Want to do Next:");
            inmathInput();
         }
         globalmath = globalmath/localmath;
         System.out.println("What Do You Want to do Next:");
         inmathInput();

      }else{
         localmath = enmath1/enmath2;
          if(anothoperat == false){
            globalmath = localmath;
            System.out.println("What Do You Want to do Next:");
            inmathInput();
         }
         globalmath = globalmath/localmath;
         System.out.println("What Do You Want to do Next:");
         inmathInput();

      }
   }
   public void Quadratic(){
      System.out.println("Enter in an a");
      enmath1 = scan.nextDouble();
      System.out.println("Enter in a b");
      enmath2 = scan.nextDouble();
      System.out.println("Enter in a c");
      enmath3 = scan.nextDouble();
      
      double origenmath2 = 0;
      
      origenmath2 = enmath2;
      
      enmath2 = -enmath2;
      
      localmath = origenmath2 * origenmath2;
      enmath3 = 4*enmath1* enmath3;
      localmath = localmath-enmath3;
      enmath1 = 2 * enmath1;
      
      double sqrt = (double) Math.sqrt(localmath);
      if(sqrt*sqrt == localmath){
         double a  = enmath2 + sqrt;
         double s = enmath2 - sqrt;
         
         System.out.println("( " + a + " ) / " + enmath1 + " )");
         System.out.println("( " + s + " ) / " + enmath1 + " )");
      
      }else{
          System.out.println("( " + enmath2 + "+ sqrt( " + localmath + " ) / " + enmath1 + " )");
          System.out.println("( " + enmath2 + "- sqrt( " + localmath + " ) / " + enmath1 + " )");
      }
      
      
      
   }
   public void Output(){
      System.out.println("Output: " + globalmath);
      System.exit(1);
   }
}