// Andrew Jo
// CSCI 1301
// Lab #11

/*
Write a method that reverses the sequence of elements in an array. 
For example, if you call the method with the array 1, 4, 9, 16, 9, 7, 4, 9, 11, 
then the array is changed to 11, 9, 4, 7, 9, 16, 9, 4, 1.  
Use one or more loops in your solution (do not use the Array Reverse method).
*/

import java.util.*; // For Scanner

public class Lab11 {
   public static void main(String[] args) {     
      Scanner console = new Scanner(System.in);
      giveIntro();
      
      // Prompts the user for the length of the array
      System.out.print("Length of the array? ");
      int arraySize = console.nextInt();
      
      int[] list = new int[arraySize];
      
      // Records the elements
      for(int i = 0; i < arraySize; i++) {
         System.out.print("Element " + (i) + ": ");
         list[i] = console.nextInt();
      }
      
      System.out.println("Original Array: " + Arrays.toString(list));
      
      // Uses a recursive loop to reverse the arrays
      reverseArray(list, 0, list.length - 1);
      System.out.println("Reversed Array: " + Arrays.toString(list));
      
      // Uses a for loops to reverse the arrays
      //reverse(list);
      //System.out.println("Reversed Array: " + Arrays.toString(list));
   }
   // Gives a brief intro to the user
   public static void giveIntro() {
   System.out.println("This program reverses the sequence of elements in an array");
   System.out.println("and prints the array");
   System.out.println();   
   }
   
   /*
   // Reverses the given array using for loop
   public static void reverse(int[] list) {
      for (int i = 0; i < list.length / 2; i++) {
         int j = list.length - i - 1;
         swap(list, i, j);
      }
   }
   // Swaps the elements in the array
   public static void swap(int[] list, int i, int j) {
      int temp = list[i];
      list[i] = list[j];
      list[j] = temp;
   }
   */
   
   
   // Reverses the given array recursively
   public static void reverseArray(int[] list, int start, int end) {
      if (start >= end) {
         return;
      }   
      int temp = list[start];
      list[start] = list[end];
      list[end] = temp;
      reverseArray(list, start + 1, end - 1);
   }
   

}