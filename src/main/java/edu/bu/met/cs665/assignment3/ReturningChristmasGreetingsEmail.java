/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: ReturningChristmasGreetingsEmail.java
 * Description: This class is responsible for the methods and attributes of an email for returning customer.
 */
package edu.bu.met.cs665.assignment3;

/**
 * This is the ReturningChristmasGreetingsEmail class.
 * This class is responsible for creating an Email content for returning customer.
 */
public class ReturningChristmasGreetingsEmail implements EmailFactory{
    @Override
    public String generateGreetings(){
        return "Dear Our Returning Customer,";
    };

    @Override
    public String generateHeader(){
        return "We hope this email finds you well.";
    };

    @Override
    public String generateBody(){
        return "We would like to say merry christmas to your family. We hope you can return to our service.";
    };

    @Override
    public String generateFooter(){
        return "With our best regards.";
    };
}
