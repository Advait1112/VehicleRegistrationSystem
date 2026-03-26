/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
package com.system.vehicleregistration;

public class LoginSignUp {
    protected String name;
    public String emailId;
    private String password;

    public void signUp(String name, String emailId, String password) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        System.out.println("User signed up successfully: " + this.name);
    }

    public boolean login(String email, String pass) {
        if (this.emailId != null && this.emailId.equals(email) && this.password.equals(pass)) {
            System.out.println("Login successful.");
            return true;
        }
        System.out.println("Login failed.");
        return false;
    }
}