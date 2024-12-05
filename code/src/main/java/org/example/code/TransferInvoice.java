package org.example.code;

import java.time.LocalDate;

public class TransferInvoice extends Invoice {
    public TransferInvoice(double amount, String ownerQid, String description) {
        super("TransferInvoice",amount,  ownerQid, description);
        generateInvoiceReport("TransferInvoice",getInvoiceId(), amount, getDueDate(), getIssueDate(), ownerQid, getPaymentStatus(), description);
    }

    @Override
    public void generateInvoiceReport(String type,String invoiceId, double amount,
                                      LocalDate dueDate, LocalDate issueDate,
                                      String ownerQid, String paymentStatus, String description) {
        super.generateInvoiceReport("TransferInvoice",invoiceId, amount, dueDate, issueDate, ownerQid, paymentStatus, description);
    }
}
