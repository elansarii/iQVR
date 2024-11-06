package org.example.code;

import java.util.*;
import java.time.LocalDate;

public class Invoice {

    private String invoiceId;
    private double amount;
    private LocalDate dueDate;
    private LocalDate issueDate;
    private String vehicleVin;
    private String ownerQid;
    private String paymentStatus;
    private String description;

    public Invoice(double amount, String vehicleVin,
                   String ownerQid, String description) {
        this.invoiceId = generateInvoiceId();
        this.amount = amount;
        this.issueDate = LocalDate.now();
        this.dueDate = this.issueDate.plusDays(30);
        this.vehicleVin = vehicleVin;
        this.ownerQid = ownerQid;
        this.paymentStatus = "unpaid";
        this.description = description;
    }

    private String generateInvoiceId() {
        return UUID.randomUUID().toString();
    }
    public Invoice generateInvoice() {

        System.out.println("Invoice generated with ID: " + this.invoiceId);
        return this;
    }

    public void sendInvoice() {
        // TODO implement here
    }

    public void checkUnpaid() {
        // TODO implement here
    }

    public void checkPaid() {
        // TODO implement here
    }
}