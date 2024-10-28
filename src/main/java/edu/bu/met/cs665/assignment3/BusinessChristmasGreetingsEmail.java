/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: BusinessChristmasGreetingsEmail.java
 * Description: This class is responsible for the methods and attributes of an email for business customer.
 */
package edu.bu.met.cs665.assignment3;

/**
 * This is the BusinessChristmasGreetingsEmail class.
 * This class is responsible for creating an Email content for business customer.
 */
public class BusinessChristmasGreetingsEmail implements EmailFactory{
    @Override
    public String generateGreetings(){
        return "Dear Our Business Valued Member,";
    };

    @Override
    public String generateHeader(){
        return "We hope this email finds you and your business well.";
    };

    @Override
    public String generateBody(){
        return "We would like to say merry christmas to your company.";
    };

    @Override
    public String generateFooter(){
        return "With best regards form your best business partner.";
    };
}
