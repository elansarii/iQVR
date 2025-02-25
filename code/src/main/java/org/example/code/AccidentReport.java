package org.example.code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class AccidentReport {
    private int counter=0000;
    private String reportId;
    private String ownerVin;
    private String victimVin;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String description;

    public AccidentReport(String description, String ownerVin,
                          String victimVin, String location) {
        this.reportId = generateReportId();
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.description = description;
        this.ownerVin = ownerVin;
        this.victimVin = victimVin;
        this.location = location;
    }




    private String generateReportId() {
        return UUID.randomUUID().toString();
    }

    public void generateAccidentReport() {
        String fileName = "AccidentReport_" + reportId + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Accident Report");
            writer.newLine();
            writer.write("================");
            writer.newLine();
            writer.newLine();
            writer.write("Report ID       : " + this.reportId);
            writer.newLine();
            writer.write("Date            : " + this.getDate().toString());
            writer.newLine();
            writer.write("Time            : " + this.getTime().toString());
            writer.newLine();
            writer.write("Location        : " + this.getLocation());
            writer.newLine();
            writer.write("Description     : " + this.getDescription());
//            writer.newLine();
//            writer.write("Owner Vehicle   : " + this.getOwnerVin());
            writer.newLine();
            writer.write("Owner VIN       : " + this.getOwnerVin());
            writer.newLine();
            writer.write("Victim VIN      : " + this.getVictimVin());
            writer.newLine();
            writer.write("================");
            writer.newLine();
            writer.write("End of Report");
        } catch (IOException e) {
            System.err.println("Error writing accident report: " + e.getMessage());
        }
    }



    public void sendReportToInsurance() {
        InsuranceCompany insuranceCompany = new InsuranceCompany();
        insuranceCompany.acknowledgeAccident(this);

    }


    public String getReportId() {
        return reportId;
    }

    public String getOwnerVin() {
        return ownerVin;
    }

    public String getVictimVin() {
        return victimVin;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

}