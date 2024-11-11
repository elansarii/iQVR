package org.example.code;

import java.io.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class AccidentReport {
    private Vehicle ownerv;
    private String reportId;
    private String ownerVin;
    private String victimVin;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String description;
    private boolean confirmationStatus;


    public AccidentReport(String description, Vehicle ownerv, LocalTime time,
                          String reportId, String ownerVin, String victimVin, String location) {
        this.date = LocalDate.now();
        this.description = description;
        this.ownerv = ownerv;
        this.time = time;
        this.reportId = reportId;
        this.ownerVin = ownerVin;
        this.victimVin = victimVin;
        this.location = location;
    }
    public void reportAccident(){
        Vehicle offending = ownerv.findVehicleByVin(ownerVin);
        Vehicle victim = ownerv.findVehicleByVin(victimVin);
        date= LocalDate.now();


    }

    public void generateReport() {

        String report = String.format(
                "Accident Report ID: %s\nDate: %s\nTime: %s\nLocation: %s\nDescription: %s\nOwner Vehicle: %s\nOwner VIN: %s\nVictim VIN: %s",
                reportId, date, time, location, description, ownerv, ownerVin, victimVin
        );
        System.out.println(report);
    }

    public boolean confirmFault() {
    // if(confirmFault()){return true;}

    }

    public void enterDetails() {

    }

    public void retrieveReport() {

    }

    public void sendReportToInsurance() {

    }
}