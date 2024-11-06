package org.example.code;

import java.io.*;
import java.util.*;

public class Owner {

    private String name;
    private String address;
    private String qid;
    private String phoneNumber;
    private ArrayList<String> ownedVehicles;

    public Owner(String name, String address, String qid, String phoneNumber, List<String> ownedVehicles) {
        this.name = name;
        this.address = address;
        this.qid = qid;
        this.phoneNumber = phoneNumber;
        this.ownedVehicles = new ArrayList<>(ownedVehicles);
    }


    public void listOwnedVehicles() {
        int counter = 1;
        for (String vehicle : ownedVehicles) {
            System.out.printf("%d- %s%n", counter++, vehicle);
        }
    }

    public void ownerDetails() {
        // TODO implement here
    }

    public void transferOwner() {
        // TODO implement here
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void setOwnedVehicles(ArrayList<String> ownedVehicles) {
        this.ownedVehicles = ownedVehicles;
    }
}

