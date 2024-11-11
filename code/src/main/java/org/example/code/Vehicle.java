package org.example.code;

import java.io.*;
import java.util.*;

public class Vehicle {

    private String vin;
    private String make;
    private String model;
    private int year;
    private Registration registration;
    private boolean isRegistered;
    private Owner owner;
    private Owner prevOwner;
    private InsurancePolicy insurancePolicy;
    private FitnessCertificate fitnessCertificate;
    private ArrayList<Vehicle> vehicles;

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

    public Registration getRegNumber() {
        return registration;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public Owner getOwner() {
        return owner;
    }

    public Owner getPrevOwner() {
        return prevOwner;
    }

    public InsurancePolicy getInsurancePolicyNum() {
        return insurancePolicy;
    }

    public FitnessCertificate getFitnessCertNum() {
        return fitnessCertificate;
    }

    public void setOwner(Owner newOwner) {
        this.owner = newOwner;
    }

    public void setPrevOwner(Owner currentOwner) {
        this.prevOwner = currentOwner;
    }
    public Vehicle findVehicleByVin( String vin) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                return vehicle;
            }
        }
        return null;
    }
}