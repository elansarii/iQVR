package org.example.code;

import java.util.*;

public class Owner{

    private String name;
    private String address;
    private String qid;
    private String phoneNumber;
    private ArrayList<Vehicle> ownedVehicles = new ArrayList<>();
    private ArrayList<Invoice> bills = new ArrayList<>();
    private static ArrayList<Owner> owners = new ArrayList<>();
    public Owner(String name, String address, String qid, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.qid = qid;
        this.phoneNumber = phoneNumber;
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

        if(!checkBills(currentOwner)){
            System.out.println("You have unpaid bills");
            return;
        }

        if (currentOwner == null || newOwner == null) {
            System.out.println("Owner information not correct");
            return;
        }

        Vehicle vehicle = findVehicleByVin(currentOwner, vin);

        if (vehicle == null) {
            System.out.println("Vehicle information not correct");
            return;
        }

        currentOwner.getOwnedVehicles().remove(vehicle);
        newOwner.getOwnedVehicles().add(vehicle);
        vehicle.setOwner(newOwner);
        vehicle.setPrevOwner(currentOwner);
        System.out.printf("Vehicle with VIN %s has been transferred from %s to %s%n", vin, currentOwner.getName(), newOwner.getName());
        newOwner.getInvoices().add(new Invoice(100, vin, newOwnerId, "Transfer of ownership").generateInvoice());
        //new Invoice(100, vin, newOwnerId, "Transfer of ownership").generateInvoice();
    }
    private Boolean checkBills(Owner owner){
        for (Invoice bill : owner.getInvoices()) {
            if (bill.getPaymentStatus().equals("unpaid")) {
                return false;
            }
        }
        return true;
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
    public ArrayList<Invoice> getInvoices() {
        return bills;
    }
}

