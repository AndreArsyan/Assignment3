/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: EmailFactory.java
 * Description: This interface is responsible for the methods and attributes of an Email Factory.
 */
package edu.bu.met.cs665.assignment3;

/**
 * This is the EmailFactory interface.
 * This interface is responsible for representing an EmailFactory.
 */
public interface EmailFactory {
    public String generateGreetings();
    public String generateHeader();
    public String generateBody();
    public String generateFooter();
}
