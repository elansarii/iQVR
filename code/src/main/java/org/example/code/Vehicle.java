package org.example.code;

import java.io.*;
import java.util.*;

public class Vehicle {

    private String vin;
    private String make;
    private String model;
    private int year;
    private boolean isRegistered;
    private Owner owner;
    private Owner prevOwner;
    private boolean insurancePolicy;
    private boolean fitnessCertificate;

    public Vehicle(String vin, String make, String model, int year, boolean isRegistered, Owner owner, Owner prevOwner, boolean insurancePolicy, boolean fitnessCertificate) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRegistered = isRegistered;
        this.owner = owner;
        this.prevOwner = prevOwner;
        this.insurancePolicy = insurancePolicy;
        this.fitnessCertificate = fitnessCertificate;
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

    public boolean isRegistered() {
        return isRegistered;
    }

    public Owner getOwner() {
        return owner;
    }

    public Owner getPrevOwner() {
        return prevOwner;
    }

    public boolean getInsurancePolicyNum() {
        return insurancePolicy;
    }

    public boolean getFitnessCertNum() {
        return fitnessCertificate;
    }

    public void setOwner(Owner newOwner) {
        this.owner = newOwner;
    }

    public void setPrevOwner(Owner currentOwner) {
        this.prevOwner = currentOwner;
    }
    public Vehicle findVehicleByVin( String vin) {
        for (Vehicle vehicle : iQVR.vehicles) {
            if (vehicle.getVin().equals(vin)) {
                return vehicle;
            }
        }
        return null;
    }
}