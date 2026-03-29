/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.vehicleregistration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing Vehicle Registration System...\n");

        LoginSignUp auth = new LoginSignUp();
        auth.signUp("Advait Bhore", "advait@test.com", "secure123");
        auth.login("advait@test.com", "secure123");
        
        System.out.println("\n--- Processing Registration ---");
        VehicleRegistration reg = new VehicleRegistration();
        reg.registerVehicle("MH-15-AB-1234", "Advait Bhore");
        reg.getDetailsAndVerifyDetails();

        System.out.println("\n--- Processing Permit ---");
        VehiclePermit permit = new VehiclePermit();
        permit.issuePermit(reg);

        System.out.println("\n--- Processing Finance ---");
        Finance finance = new Finance("jdbc:mysql://localhost:3306/finance_db");
        finance.poolingOfFunds(10000.0);
        finance.economicDevelopment(2500.0);
        finance.betterDecisionMaking();

        System.out.println("\n--- Processing Licensing ---");
        VehicleLicensing license = new VehicleLicensing();
        license.age = 24;
        license.nameAddress = "Advait Bhore, Vellore";
        license.provideLicenseToDrive();

        System.out.println("\n--- Processing Examination ---");
        Examination exam = new Examination();
        exam.name = "Advait Bhore";
        exam.figureOutEligibleCandidates(88);
        
        System.out.println("\nSystem execution completed successfully.");
    }
}