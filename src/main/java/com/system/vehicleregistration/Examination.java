/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.vehicleregistration;

public class Examination {
    public String name;
    protected String signature;

    public void figureOutEligibleCandidates(int testScore) {
        if (testScore >= 75) {
            System.out.println(this.name + " is an eligible candidate.");
            this.signature = "Approved_Examiner";
        } else {
            System.out.println(this.name + " is not eligible.");
        }
    }
}