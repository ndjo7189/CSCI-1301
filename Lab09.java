// Andrew Jo
// CSCI 1301
// Lab #09

/*
Write a program that reads a word and prints the word in reverse.  For example, if the user provides 
the input "Harry", the program prints "yrraH".  For this assignment you are required to use a loop in your solution.
*/

import java.util.*; // For Scanner

public class Lab09 {
   public static void main(String[] args) {     
      Scanner console = new Scanner(System.in);
      giveIntro();
      
      // Prompts the user for the sides of a triangle
      String word = getWord(console, "Input a word: ");
      
      String firstWord = firstWord(word);
      System.out.println();
      //backwardWord(firstWord);
      System.out.println();
      System.out.println("The first word in reverse is: ");
      //System.out.println();
      System.out.printf("%-10s", backwardWord(firstWord));
   }
   // Gives a brief intro to the user
   public static void giveIntro() {
   System.out.println("This program reads the first input word");
   System.out.println("and prints the word in reverse");
   System.out.println();   
   }
   
   // Returns the first word
   public static String firstWord(String s) {
      int start = 0;
      while (start < s.length() && s.charAt(start) == ' ') {
         start++;
      }
      int stop = start;
      while (stop < s.length() && s.charAt(stop) != ' ') {
         stop++;
      }
      return s.substring(start, stop);
   }
   
   // Returns the first word backward recursively
   public static String backwardWord(String word) {
      String result = "";
      for (int i = word.length() - 1; i >=0; --i) {
         result += word.charAt(i);
      }
      return result;  
   }
   
   // Prompts until a word is entered
   public static String getWord(Scanner console, String prompt) {
      System.out.print(prompt);
      while (console.hasNextInt() || console.hasNextDouble()) {
         System.out.println(console.next() + " is not a word; try again.");
         System.out.print(prompt);
         //console.next();
      }     
      return console.next(); 
   } 
}