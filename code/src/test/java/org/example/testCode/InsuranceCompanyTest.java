package org.example.testCode;

import org.example.code.AccidentReport;
import org.example.code.InsuranceCompany;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCompanyTest {

    private InsuranceCompany insuranceCompany;

    @BeforeEach
    void setUp() {
        // Initialize a new InsuranceCompany object before each test
        insuranceCompany = new InsuranceCompany();
    }

    @AfterEach
    void tearDown() {
        // Clean up any files generated during the tests
        File folder = new File(".");
        File[] files = folder.listFiles((dir, name) -> name.startsWith("AccidentReport_") && name.endsWith(".txt"));
        if (files != null) {
            for (File file : files) {
                file.delete();
            }
        }
    }

    @Test
    void testAcknowledgeAccident() {
        // Create an AccidentReport
        AccidentReport accident = new AccidentReport(
                "Car collision at intersection",
                "OWNER123VIN",
                "VICTIM456VIN",
                "Downtown Street, City"
        );

        // Generate the accident report file
        accident.generateAccidentReport();

        // Acknowledge the accident via the InsuranceCompany
        insuranceCompany.acknowledgeAccident(accident);
    }
}

        // Verify the report file was up
