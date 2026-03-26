/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.vehicleregistration;

public class VehicleRegistration {
    protected String vehicleDetails;
    public String owner;
    private boolean isVerified = false;

    public void registerVehicle(String details, String ownerName) {
        this.vehicleDetails = details;
        this.owner = ownerName;
        System.out.println("Vehicle registered to: " + this.owner);
    }

    public boolean getDetailsAndVerifyDetails() {
        if (this.vehicleDetails != null && !this.vehicleDetails.isEmpty()) {
            this.isVerified = true;
            System.out.println("Vehicle details verified for: " + this.vehicleDetails);
            return true;
        }
        return false;
    }
}
