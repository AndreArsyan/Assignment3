/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: FrequentChristmasGreetingsEmail.java
 * Description: This class is responsible for the methods and attributes of an email for frequent customer.
 */
package edu.bu.met.cs665.assignment3;

/**
 * This is the FrequentChristmasGreetingsEmail class.
 * This class is responsible for creating an Email content for frequent customer.
 */
public class FrequentChristmasGreetingsEmail implements EmailFactory{
    @Override
    public String generateGreetings(){
        return "Dear Our Most Loyal Customer,";
    };

    @Override
    public String generateHeader(){
        return "Thank you for being our loyal customer.";
    };

    @Override
    public String generateBody(){
        return "Merry christmas and happy new year!";
    };

    @Override
    public String generateFooter(){
        return "We hope you will always use our products.";
    };
}
