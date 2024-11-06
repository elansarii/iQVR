package org.example.code;

import java.util.*;

public class Owner {

    private String name;
    private String address;
    private String qid;
    private String phoneNumber;
    private ArrayList<Vehicle> ownedVehicles;
    private ArrayList<Owner> owners;

    public Owner(String name, String address, String qid, String phoneNumber, List<Vehicle> ownedVehicles) {
        this.name = name;
        this.address = address;
        this.qid = qid;
        this.phoneNumber = phoneNumber;
        this.ownedVehicles = new ArrayList<>(ownedVehicles);
    }


    public void listOwnedVehicles() {
        int counter = 1;
        for (Vehicle vehicle : ownedVehicles) {
            System.out.printf("%d- %s%n", counter++, vehicle);
        }
    }

    public void ownerDetails(Owner owner) {

        System.out.printf("Name: %s%nQID: %s%nPhone number: %s%nAddress: %s%n",
                owner.getName(),
                owner.getQid(),
                owner.getPhoneNumber(),
                owner.getAddress()
        );
    }

    public void transferOwner(String currentOwnerId, String vin, String newOwnerId) {
        Owner currentOwner = findOwnerById(currentOwnerId);
        Owner newOwner = findOwnerById(newOwnerId);

        if (currentOwner == null || newOwner == null) {
            System.out.println("Owner not found");
            return;
        }

        Vehicle vehicle = findVehicleByVin(currentOwner, vin);

        if (vehicle == null) {
            System.out.println("Vehicle not found");
            return;
        }

        currentOwner.getOwnedVehicles().remove(vehicle);
        newOwner.getOwnedVehicles().add(vehicle);
        vehicle.setOwner(newOwner);
        vehicle.setPrevOwner(currentOwner);
    }

    private Owner findOwnerById(String ownerId) {
        for (Owner owner : owners) {
            if (owner.getQid().equals(ownerId)) {
                return owner;
            }
        }
        return null;
    }

    private Vehicle findVehicleByVin(Owner owner, String vin) {
        for (Vehicle vehicle : owner.getOwnedVehicles()) {
            if (vehicle.getVin().equals(vin)) {
                return vehicle;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getQid() {
        return qid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }
}

