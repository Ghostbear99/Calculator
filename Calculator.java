/****************************************************************
   Name: Chris Gawbill
   Things to Do:
                  Fix Sutraction Method (Outputting Negative);
                  Solve Quadratic Equations
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
         }else if(input.equals("Quadratics")){
            // Call Quadtratic Method
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
   public void Output(){
      System.out.println("Output: " + globalmath);
      System.exit(1);
   }
}