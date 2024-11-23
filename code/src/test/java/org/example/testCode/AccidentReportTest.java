package org.example.testCode;

import org.example.code.AccidentReport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class AccidentReportTest {

    private AccidentReport accidentReport;

    @BeforeEach
    void setUp() {
        accidentReport = new AccidentReport("Test Description", "123", "456", "Test Location");
    }

    @Test
    void testGenerateReportId() {
        String reportId = accidentReport.getReportId();
        assertNotNull(reportId);
        assertFalse(reportId.isEmpty());
    }

    @Test
    void testGenerateAccidentReport() throws IOException {
        accidentReport.generateAccidentReport();
        String fileName = "AccidentReport_" + accidentReport.getReportId() + ".txt";
        File file = new File(fileName);
        assertTrue(file.exists());


        Files.deleteIfExists(Paths.get(fileName));
    }

    @Test
    void testSendReportToInsurance() {
        assertDoesNotThrow(() -> accidentReport.sendReportToInsurance());
    }

    @Test
    void testGetters() {
        assertEquals("123", accidentReport.getOwnerVin());
        assertEquals("456", accidentReport.getVictimVin());
        assertEquals("Test Location", accidentReport.getLocation());
        assertEquals("Test Description", accidentReport.getDescription());
        assertEquals(LocalDate.now(), accidentReport.getDate());
        assertEquals(LocalTime.now().getHour(), accidentReport.getTime().getHour());
    }
}