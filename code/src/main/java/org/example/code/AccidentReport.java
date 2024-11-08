package org.example.code;

import java.io.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.*;

public class AccidentReport {
    private Vehicle ownerv;
    private String reportId;
    private String ownerVin;
    private String victimVin;
    private LocalDate date;
    private Time time;
    private String location;
    private String description;

//finally works



    public AccidentReport() {
    }
    public void reportAccident(){
        Vehicle offending = ownerv.findVehicleByVin(ownerVin);
        Vehicle victim = ownerv.findVehicleByVin(victimVin);
        date= LocalDate.now();


    }

    public void generateReport() {

    }

    public void confirmFault() {

    }

    public void enterDetails() {
        // TODO implement here
    }

    public void retrieveReport() {
        // TODO implement here
    }

    public void sendReportToInsurance() {
        // TODO implement here
    }
}