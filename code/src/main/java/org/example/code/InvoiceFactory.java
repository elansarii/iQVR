package org.example.code;

public class InvoiceFactory {

    public static Invoice createInvoice(String type, double amount, String ownerQid, String description) {
        switch (type) {
            case "Transfer":
                return new TransferInvoice(amount, ownerQid, description);
//            case "Fine":
//                return new FineInvoice(amount, ownerQid, description);
//            case "Registration":
//                return new RegistrationInvoice(amount, ownerQid, description);
            default:
                throw new IllegalArgumentException("Unknown invoice type: " + type);
        }
    }
}
