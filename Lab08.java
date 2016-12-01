// Andrew Jo
// CSCI 1301
// Lab #08

/*
Write a program that asks the user to enter a month (1 for January, 2 for February, and so on) and 
then prints the number of days in the month.  For February print "28 or 29 days".  Do not use a 
separate if statement for each month or the switch statement.  Use Boolean operators.
*/

import java.util.*; // For Scanner

public class Lab08 {
   public static void main(String[] args) {     
      Scanner console = new Scanner(System.in);
      giveIntro();
      
      // Prompts the user for the sides of a triangle
      System.out.print("Enter the month number: ");
      int month = console.nextInt();
      
      System.out.println(days(month));
   }
   // Gives a brief intro to the user
   public static void giveIntro() {
   System.out.println("This program prints the");
   System.out.println("number of days in a month");
   System.out.println("given thet user input month");
   System.out.println();   
   }
   
   // Returns an angle of the triangle given the lengths of the side
   public static String days(int month) {
      
      if(month == 2) {
         return "28 or 29 days";
      } else if(month % 2 == 0 && month < 8 || month % 2 != 0 && month >= 8) {
         return "30 days";
      } else { // Jan, Mar, May, Jul, Aug, Oct, and Dec
         return "31 days";
      }
   }
}