package org.example.code;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsurancePolicy {

    private String policyNumber;
    private String insuranceCompany;
    private Date issueDate;
    private Date expiryDate;
    private String vin;

    public InsurancePolicy() {
    }

    public InsurancePolicy(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public boolean validateInsurancePolicy() {
        Date today = new Date();
        return !today.before(issueDate) && !today.after(expiryDate);
    }




}