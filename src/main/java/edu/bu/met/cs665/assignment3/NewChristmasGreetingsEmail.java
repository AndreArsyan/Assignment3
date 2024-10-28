/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: NewChristmasGreetingsEmail.java
 * Description: This class is responsible for the methods and attributes of an email for new customer.
 */
package edu.bu.met.cs665.assignment3;

/**
 * This is the NewChristmasGreetingsEmail class.
 * This class is responsible for creating an Email content for new customer.
 */
public class NewChristmasGreetingsEmail implements EmailFactory{
    @Override
    public String generateGreetings(){
        return "Dear Our New Customer,";
    };

    @Override
    public String generateHeader(){
        return "Thank you for trusting our product.";
    };

    @Override
    public String generateBody(){
        return "We hope you have a merry christmas!";
    };

    @Override
    public String generateFooter(){
        return "See you soon!";
    };
}
