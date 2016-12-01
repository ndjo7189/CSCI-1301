// Andrew Jo
// CSCI 1301
// Lab #10

/*
Write a program that carries out the following tasks: Open a file with the name hello.txt; Store the message "Hello World!" 
in the file; Close the file; Open the same file again; Read the message into a string variable and print it.  
The program should be designed to handle a 'File not found' exception.
*/

import java.util.*;  // For Scanner
import java.io.*;    // For File

public class Lab10 {
   public static void main(String[] args)      
         throws FileNotFoundException { // Handles a 'File not found' exception
      //Scanner console = new Scanner(System.in);
      giveIntro();
      PrintStream output = new PrintStream(new File("hello.txt")); // Step 1
      output.println("Hello World!"); // Step 2
      
      output.close(); // Step 3
      
      Scanner input = new Scanner(new File("hello.txt")); // Step 4
      while (input.hasNextLine()) { // Step 5
         String text = input.nextLine();
         System.out.println(text);
      }
   }
   // Gives a brief intro to the user
   public static void giveIntro() {
      System.out.println("This program carries out the following tasks:");
      System.out.println("1. Open a file with the name hello.txt;");
      System.out.println("2. Store the message \"Hello World!\" in the file;");
      System.out.println("3. Close the file;");
      System.out.println("4. Open the same file again;");
      System.out.println("5. Read the message into a string variable and print it.");
      System.out.println();
   }   
}