// Andrew Jo
// CSCI 1301
// Lab #06
// Andrew Jo
// CSCI 1301
// Lab #06

/*
Write a program that declares a radius value as an integer of your choice (between 10 and 100) and then calculates and prints 
(1) the area and circumference of a circle with that radius, and 
(2) the volume and surface area of a sphere with that radius. 

You will need to search the web if you do not know any of the four formulas used in the calculations mentioned above.

Please submit your source code file (the one with the .java extension) into the dropbox for the week.
*/


public class Lab06 {

   // Set a radius with an integer of between 10 and 100 for calculations below
   public static final int radius = 10;
   
   public static void main(String[] args) {     
      // Print out the constant radius set above
      System.out.println("You have input a radius of " + radius);
      
      // Apply formulas to get the following:
      // (1) the area and circumference of a circle with that radius, and 
      // (2) the volume and surface area of a sphere with that radius. 
      double areaCircle = (double) Math.PI * (radius * radius);
      double circumferenceCircle = (double) 2 * Math.PI * radius;
      double volumeSphere = (double) ((4) * Math.PI * (radius * radius * radius))/3;
      double surfaceareaSphere = (double) 4 * Math.PI * (radius * radius);
      
      // Print out the computed values
      System.out.println();
      System.out.println("Here are the computed values with the stated radius: ");
      System.out.println("A) Area of a circle: " + areaCircle);
      System.out.println("B) Circumference of a circle: " + circumferenceCircle);
      System.out.println("C) Volume of a sphere: " + volumeSphere);
      System.out.println("D) Surface area of a sphere: " + surfaceareaSphere);         
   }
}