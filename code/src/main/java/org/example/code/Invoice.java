package org.example.code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.time.LocalDate;

public class Invoice {

    private final String invoiceId;
    private final double amount;
    private final LocalDate dueDate;
    private final LocalDate issueDate;
    private final String ownerQid;
    private String paymentStatus;
    private final String description;

    public Invoice(double amount, String vehicleVin,
                   String ownerQid, String description) {
        this.invoiceId = generateInvoiceId();
        this.amount = amount;
        this.issueDate = LocalDate.now();
        this.dueDate = this.issueDate.plusDays(30);
        this.ownerQid = ownerQid;
        this.paymentStatus = "unpaid";
        this.description = description;
    }

    public Invoice(String invoiceId, double amount, LocalDate issueDate, LocalDate dueDate,
                   String ownerQid, String paymentStatus, String description) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.dueDate = dueDate;
        this.issueDate = issueDate;
        this.ownerQid = ownerQid;
        this.paymentStatus = paymentStatus;
        this.description = description;
    }

    private String generateInvoiceId() {
        return UUID.randomUUID().toString();
    }
    public void generateInvoiceReport(String invoiceId, double amount, LocalDate dueDate, LocalDate issueDate,
                                             String ownerQid, String paymentStatus, String description) {
        String fileName = "Invoice_" + invoiceId + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Invoice Report");
            writer.newLine();
            writer.write("==============");
            writer.newLine();
            writer.newLine();
            writer.write("Invoice ID      : " + invoiceId);
            writer.newLine();
            writer.write("Amount          : $" + String.format("%.2f", amount));
            writer.newLine();
            writer.write("Issue Date      : " + issueDate.toString());
            writer.newLine();
            writer.write("Due Date        : " + dueDate.toString());
            writer.newLine();
            writer.write("Owner QID       : " + ownerQid);
            writer.newLine();
            writer.write("Payment Status  : " + paymentStatus);
            writer.newLine();
            writer.write("Description     : " + description);
            writer.newLine();
            writer.write("==============");
            writer.newLine();
            writer.write("End of Report");
        } catch (IOException e) {
            System.err.println("Error writing invoice report: " + e.getMessage());
        }
    }



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