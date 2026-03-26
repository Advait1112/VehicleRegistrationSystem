/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.vehicleregistration;

public class VehicleLicensing {
    public int age;
    public String nameAddress;
    public String address;

    public boolean provideLicenseToDrive() {
        if (this.age >= 18) {
            System.out.println("Driving license provided to: " + this.nameAddress);
            return true;
        }
        System.out.println("License denied. Applicant must be 18 or older.");
        return false;
    }
}