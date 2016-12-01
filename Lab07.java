// Andrew Jo
// CSCI 1301
// Lab #07

/*
Write a program that prompts the user to enter the lengths of the side of a triangle and prints its three angles. 
The calculation of the angle values should take place in a separate method.  You will pass the three side lengths 
as parameters to the method and it will return the angle as the result.  You will have to call the method three times 
(once for each angle).  Round your answers to two decimal places.
*/

import java.util.*; // For Scanner

public class Lab07 {
   public static void main(String[] args) {     
      Scanner console = new Scanner(System.in);
      giveIntro();
      
      // Prompts the user for the sides of a triangle
      System.out.print("Length of the first side? ");
      double a = console.nextDouble();
      System.out.print("Length of the second side? ");
      double b = console.nextDouble();
      System.out.print("Length of the third side? ");
      double c = console.nextDouble();
      System.out.println();
      
      // Requests and prints out the calculated angle values separately
      System.out.println("The first angle is " + Angle2(a, b, c));
      System.out.println("The second angle is " + Angle2(b, a, c));
      System.out.println("The third angle is " + Angle2(c, a, b));
   }
   // Gives a brief intro to the user
   public static void giveIntro() {
   System.out.println("This program computes the");
   System.out.println("angles of a triangle given the");
   System.out.println("lengths of the side of the tiangle");
   System.out.println();   
   }
   
   // Returns an angle of the triangle given the lengths of the side
   public static double Angle2(double a, double b, double c) {
   
      double angle = Math.acos(((b * b) + (c * c) - (a * a))/(2 * b * c));                              
      
      return round2(Math.toDegrees(angle));
   }
   
   // Rounds n to 2 digits after the decimal point
   public static double round2(double n) {
      return Math.round(n * 100) / 100.0;
   }
}