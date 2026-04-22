/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sinakhojavaapp;

import java.util.Scanner;

/**
 *
 * @author cash
 */
public class SinakhoJavaApp {
// Setting up the Scanner and Login objects to handle input and logic
    public static void main(String[] args) {
   // 1. Setup the tools
    Scanner input = new Scanner(System.in);
    Login loginSystem = new Login();

    // 2. The Greeting
    System.out.println("------------------------------------");
System.out.println("   WELCOME TO THE SINAKHO APP V1.0  ");
System.out.println("------------------------------------");
    
    // 3. Collect Data
    System.out.print("Please enter your First Name: ");
    String fName = input.nextLine().trim();
    
    System.out.print("Please enter your Last Name: ");
    String lName = input.nextLine().trim();

    System.out.println("Enter a username (Must have '_' and be max 5 chars): ");
    String user = input.nextLine().trim();

    // 4. Use your Login rules!
    if (loginSystem.checkUserName(user)) {
        System.out.println("Username successfully captured");
    } else {
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
    System.out.println("\nSession ended. Thank you for using Sinakho App!");
    }     
    }
}
