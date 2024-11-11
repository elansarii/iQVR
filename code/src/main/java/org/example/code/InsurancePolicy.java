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

    public boolean validateInsurancePolicy() {
        Date today = new Date();
        return !today.before(issueDate) && !today.after(expiryDate);
    }

    public String getInsurancePolicyDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Policy Number: " + policyNumber + "\n" +
                "Insurance Company: " + insuranceCompany + "\n" +
                "Issue Date: " + sdf.format(issueDate) + "\n" +
                "Expiry Date: " + sdf.format(expiryDate) + "\n" +
                "VIN: " + vin;
    }

    public void updateInsurancePolicy() {
//        this.expiryDate = newExpiryDate;
    }
}