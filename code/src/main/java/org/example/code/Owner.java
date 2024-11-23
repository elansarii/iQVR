package org.example.code;

import java.util.*;

public class Owner {

    private String name;
    private String address;
    private String qid;
    private String phoneNumber;

    public Owner(String name, String address, String qid, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.qid = qid;
        this.phoneNumber = phoneNumber;
    }

    public void ownerDetails(Owner owner) {

        System.out.printf("Name: %s%nQID: %s%nPhone number: %s%nAddress: %s%n",
                owner.getName(),
                owner.getQid(),
                owner.getPhoneNumber(),
                owner.getAddress()
        );
    }

    public boolean findOutstandingBills(String qid) {
        for (Invoice bill : iQVR.bills) {
            if (bill.getPaymentStatus().equals("unpaid") && qid.equals(bill.getOwnerQid())) {
                return false;
            }
        }
        return true;
    }

    public boolean transferOwner(Owner newOwner, String vin) {
        Vehicle vehicle = null;
        for (Vehicle v : iQVR.vehicles) {
            if (v.getVin().equals(vin)) {
                vehicle = v;
            }
        }
        if (vehicle == null) {
            return false;
        }

        vehicle.setOwner(newOwner);
        vehicle.setPrevOwner(this);
        Invoice bill=new Invoice(150.0, vin, newOwner.getQid(), "Transfer of ownership");
        iQVR.bills.add(bill);
        bill.generateInvoiceReport(bill.getInvoiceId(), bill.getAmount(), bill.getDueDate(),
                bill.getIssueDate(), bill.getOwnerQid(), bill.getPaymentStatus(), bill.getDescription());

        vehicle.vehicleDetails();
        return true;
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Owner owner = (Owner) obj;
        return Objects.equals(qid, owner.qid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qid);
    }

}

