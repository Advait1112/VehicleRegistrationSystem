/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.vehicleregistration;

public class VehiclePermit {
    public boolean issuePermit(VehicleRegistration registration) {
        if (registration != null && registration.owner != null) {
            System.out.println("Permit issued to: " + registration.owner);
            return true;
        }
        return false;
    }
}