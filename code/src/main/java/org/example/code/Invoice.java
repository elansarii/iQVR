package org.example.code;

import java.util.*;
import java.time.LocalDate;

public class Invoice {

    private final String invoiceId;
    private final double amount;
    private final LocalDate dueDate;
    private final LocalDate issueDate;
    //private final String vehicleVin;
    private final String ownerQid;
    private String paymentStatus;
    private final String description;

    public Invoice(double amount, String vehicleVin,
                   String ownerQid, String description) {
        this.invoiceId = generateInvoiceId();
        this.amount = amount;
        this.issueDate = LocalDate.now();
        this.dueDate = this.issueDate.plusDays(30);
        //this.vehicleVin = vehicleVin;
        this.ownerQid = ownerQid;
        this.paymentStatus = "unpaid";
        this.description = description;
    }

    private String generateInvoiceId() {
        return UUID.randomUUID().toString();
    }
    public Invoice generateInvoice() {

        System.out.println("Invoice generated with ID: " + getInvoiceId());
        return this;
    }

//    public void sendInvoice() {
//        // TODO implement here
//    }

    public String getPaymentStatus() {
        return paymentStatus;
    }


    public String getInvoiceId() {
        return invoiceId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

//    public String getVehicleVin() {
//        return vehicleVin;
//    }

    public String getOwnerQid() {
        return ownerQid;
    }

    public String getDescription() {
        return description;
    }
}