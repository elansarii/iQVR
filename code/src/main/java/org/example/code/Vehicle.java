package org.example.code;

import java.io.*;
import java.util.*;

public class Vehicle {

    private String vin;
    private String make;
    private String model;
    private int year;
    private String regNumber;
    private boolean isRegistered;
    private String owner;
    private String prevOwner;
    private String insurancePolicyNum;
    private String fitnessCertNum;

    public Vehicle() {
    }

    public void vehicleDetails() {
        // TODO implement here
    }

    public void validateDetails() {
        // TODO implement here
    }

    public void updateOwner() {
        // TODO implement here
    }

    public String getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public String getOwner() {
        return owner;
    }

    public String getPrevOwner() {
        return prevOwner;
    }

    public String getInsurancePolicyNum() {
        return insurancePolicyNum;
    }

    public String getFitnessCertNum() {
        return fitnessCertNum;
    }
}