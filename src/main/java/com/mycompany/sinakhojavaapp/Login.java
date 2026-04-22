/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinakhojavaapp;

/**
 *
 * @author sinakho
 */
public class Login {// These variables will "save" the user's info
    // 1. These variables save the info
    private String registeredUsername;
    private String registeredPassword;
    private String firstName;
    private String lastName;

    // 2. The Username Rule
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // 3. The Password Rule
    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;
        
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasDigit = true;
            if (!(Character.isLetterOrDigit(c))) hasSpecial = true;
        }
        
        return hasUpper && hasDigit && hasSpecial;
    } 
// RULE 3: The Phone Rule
    public boolean checkCellPhoneNumber(String phone) {
        // This is the "Magic Sentence" (Regex) for South Africa
        String regex = "^\\+27[0-9]{9}$";
        return phone.matches(regex);
    }
}//   