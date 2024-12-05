package org.example.testCode;

import org.example.code.Invoice;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void testInvoiceConstructorWithGeneratedId() {
        double amount = 150.0;
        String ownerQid = "12345";
        String description = "Transfer Fee";


        Invoice invoice = new Invoice("TransferInvoice",amount, ownerQid, description);
        assertNotNull(invoice.getInvoiceId(), "Invoice ID should not be null");
        assertEquals(amount, invoice.getAmount());
        assertEquals(ownerQid, invoice.getOwnerQid());
        assertEquals(description, invoice.getDescription());
        assertEquals("unpaid", invoice.getPaymentStatus());
        assertEquals(LocalDate.now(), invoice.getIssueDate(), "Issue date should be today");
        assertEquals(LocalDate.now().plusDays(30), invoice.getDueDate(), "Due date should be 30 days from today");
    }

    @Test
    void testInvoiceConstructorWithProvidedId() {
        String invoiceId = "0001";
        double amount = 150.0;
        LocalDate issueDate = LocalDate.of(2024, 7, 12);
        LocalDate dueDate = LocalDate.of(2024, 8, 12);
        String ownerQid = "12345";
        String paymentStatus = "paid";
        String description = "Registration Fee";

        Invoice invoice = new Invoice(invoiceId, amount, issueDate, dueDate, ownerQid, paymentStatus, description);

        assertEquals(invoiceId, invoice.getInvoiceId());
        assertEquals(amount, invoice.getAmount());
        assertEquals(issueDate, invoice.getIssueDate());
        assertEquals(dueDate, invoice.getDueDate());
        assertEquals(ownerQid, invoice.getOwnerQid());
        assertEquals(paymentStatus, invoice.getPaymentStatus());
        assertEquals(description, invoice.getDescription());
    }

    @Test
    void testGenerateInvoiceId() {
        Invoice invoice = new Invoice("TransferInvoice",100.0,  "12345", "Test Description");

        String invoiceId = invoice.getInvoiceId();
        assertNotNull(invoiceId, "Generated Invoice ID should not be null");
        assertDoesNotThrow(() -> UUID.fromString(invoiceId), "Generated Invoice ID should be a valid UUID");
    }

    @Test
    void testGenerateInvoiceReport() {
        String invoiceId = "0001";
        double amount = 150.0;
        LocalDate issueDate = LocalDate.of(2024, 7, 12);
        LocalDate dueDate = LocalDate.of(2024, 8, 12);
        String ownerQid = "12345";
        String paymentStatus = "paid";
        String description = "Registration Fee";
        Invoice invoice = new Invoice(invoiceId, amount, issueDate, dueDate, ownerQid, paymentStatus, description);
        invoice.generateInvoiceReport("TransferInvoice",invoiceId, amount, dueDate, issueDate, ownerQid, paymentStatus, description);

        String fileName = "Invoice_" + invoiceId + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder reportContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                reportContent.append(line).append(System.lineSeparator());
            }
            String report = reportContent.toString();
            assertTrue(report.contains("Invoice ID      : " + invoiceId));
            assertTrue(report.contains("Amount          : $" + String.format("%.2f", amount)));
            assertTrue(report.contains("Issue Date      : " + issueDate.toString()));
            assertTrue(report.contains("Due Date        : " + dueDate.toString()));
            assertTrue(report.contains("Owner QID       : " + ownerQid));
            assertTrue(report.contains("Payment Status  : " + paymentStatus));
            assertTrue(report.contains("Description     : " + description));
        } catch (IOException e) {
            fail("Failed to read the invoice report file: " + e.getMessage());
        }
    }

    @Test
    void testSetPaymentStatus() {
        String invoiceId = "0002";
        double amount = 200.0;
        LocalDate issueDate = LocalDate.of(2024, 9, 15);
        LocalDate dueDate = LocalDate.of(2024, 10, 15);
        String ownerQid = "54321";
        String paymentStatus = "unpaid";
        String description = "Insurance Fee";

        Invoice invoice = new Invoice(invoiceId, amount, issueDate, dueDate, ownerQid, paymentStatus, description);

        assertEquals("unpaid", invoice.getPaymentStatus());

        invoice.getPaymentStatus();
        assertEquals("unpaid", invoice.getPaymentStatus(), "Payment status should change to 'paid'");
    }
}
