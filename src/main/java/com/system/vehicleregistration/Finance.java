/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.vehicleregistration;

public class Finance {
    private double balance;
    private String database;

    public Finance(String databaseConnection) {
        this.database = databaseConnection;
        this.balance = 0.0;
    }

    public void poolingOfFunds(double amount) {
        this.balance += amount;
        System.out.println("Funds pooled. Current balance: " + this.balance);
    }

    public void economicDevelopment(double allocation) {
        if (this.balance >= allocation) {
            this.balance -= allocation;
            System.out.println("Allocated " + allocation + " for economic development.");
        }
    }

    public void betterDecisionMaking() {
        System.out.println("Analyzing financial database: " + this.database);
    }
}