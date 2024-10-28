/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: Main.java
 * Description: This is the main class to begin the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment3.Email;
import edu.bu.met.cs665.assignment3.EmailGenerator;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * Main method to run the program
   */
  public static void main(String[] args) {
    // Generate email generator object
    EmailGenerator emailGenerator = new EmailGenerator();

    // List of customer type
    String[] customerSegments = { "business", "returning", "frequent", "new", "vip" };

    // Generate email and print the email for each customer
    for (String segment : customerSegments) {
      Email email = null;
      email = emailGenerator.GenerateChristmasEmail(segment);
      email.print();
      System.out.println("--------------------------------------------------");
    }
  }

}
