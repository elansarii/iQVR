package org.example.code;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer {
    private String manufacturerId;
    private String manufacturerName;
    private String manufacturerCountry;
    private List<Vehicle> vehiclesProduced;

    // Constructor
    public Manufacturer(String manufacturerId, String manufacturerCountry, String manufacturerName) {
        this.manufacturerId = manufacturerId;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerName = manufacturerName;
        this.vehiclesProduced = new ArrayList<>();
    }


    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public List<Vehicle> getVehiclesProduced() {
        return vehiclesProduced;
    }


    public void addVehicle(Vehicle vehicle) {
        this.vehiclesProduced.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehiclesProduced.remove(vehicle);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturerId='" + manufacturerId + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", vehiclesProduced=" + vehiclesProduced +
                '}';
    }
}
