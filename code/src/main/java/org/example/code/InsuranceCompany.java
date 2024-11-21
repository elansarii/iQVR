package org.example.code;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class InsuranceCompany {

    private String companyName;
    private String phone;
    private String email;
    private List<InsurancePolicy> issuedPolicies;
    private String address;

    public InsuranceCompany() {
    }

    public void acknowledgeAccident(AccidentReport accident) {
        String fileName = "AccidentReport_" + accident.getReportId() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write("Status: Acknowledged");
        } catch (IOException e) {
            System.err.println("Error acknowledging accident report: " + e.getMessage());
        }
    }
}