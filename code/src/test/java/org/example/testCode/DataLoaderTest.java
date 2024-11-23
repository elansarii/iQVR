package org.example.testCode;

import org.example.code.DataLoader;
import org.example.code.Invoice;
import org.example.code.Owner;
import org.example.code.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataLoaderTest {

    @Test
    void testLoadOwners() {
        ArrayList<Owner> owners = DataLoader.loadOwners();

        assertNotNull(owners, "Owners list should not be null");
        assertEquals(4, owners.size(), "Expected 4 owners to be loaded");

        Owner firstOwner = owners.get(0);
        assertNotNull(firstOwner, "First owner should not be null");
        assertEquals("Mohamed", firstOwner.getName());
        assertEquals("Doha - Wadi Al Sail Street", firstOwner.getAddress());
        assertEquals("1000", firstOwner.getQid());
        assertEquals("11223344", firstOwner.getPhoneNumber());

        Owner secondOwner = owners.get(1);
        assertNotNull(secondOwner, "Second owner should not be null");
        assertEquals("Hamza", secondOwner.getName());
        assertEquals("Al Rayyan - Al Sadd Road", secondOwner.getAddress());
        assertEquals("2000", secondOwner.getQid());
        assertEquals("22334455", secondOwner.getPhoneNumber());
    }

    @Test
    void testLoadVehicles() {
        ArrayList<Vehicle> vehicles = DataLoader.loadVehicles();
        assertNotNull(vehicles, "Vehicles list should not be null");
        assertEquals(8, vehicles.size(), "Expected 8 vehicles to be loaded");
        Vehicle firstVehicle = vehicles.get(0);
        assertNotNull(firstVehicle, "First vehicle should not be null");
        assertEquals("1HGCM82633A123456", firstVehicle.getVin());
        assertEquals("Toyota", firstVehicle.getMake());
        assertEquals("Corolla", firstVehicle.getModel());
        assertEquals(2005, firstVehicle.getYear());
        assertTrue(firstVehicle.isRegistered(), "Expected the vehicle to be registered");
        assertNotNull(firstVehicle.getOwner(), "Expected the vehicle to have an owner");
        assertNotNull(firstVehicle.getPrevOwner(), "Expected the vehicle to have a previous owner");
    }

    @Test
    void testLoadInvoices() {
        ArrayList<Invoice> invoices = DataLoader.loadInvoices();

        assertNotNull(invoices, "Invoices list should not be null");
        assertEquals(8, invoices.size(), "Expected 8 invoices to be loaded");

        Invoice firstInvoice = invoices.get(0);
        assertNotNull(firstInvoice, "First invoice should not be null");
        assertEquals("0001", firstInvoice.getInvoiceId());
        assertEquals(150.0, firstInvoice.getAmount());
        assertEquals("2024-07-12", firstInvoice.getIssueDate().toString());
        assertEquals("2024-08-12", firstInvoice.getDueDate().toString());
        assertEquals("1000", firstInvoice.getOwnerQid());
        assertEquals("unpaid", firstInvoice.getPaymentStatus());
        assertEquals("transfer fee", firstInvoice.getDescription());
    }

    @Test
    void testOwnersHaveVehicles() {
        ArrayList<Owner> owners = DataLoader.loadOwners();
        ArrayList<Vehicle> vehicles = DataLoader.loadVehicles();

        assertNotNull(owners, "Owners list should not be null");
        assertNotNull(vehicles, "Vehicles list should not be null");

        for (Owner owner : owners) {
            assertTrue(
                    vehicles.stream().anyMatch(vehicle -> vehicle.getOwner().equals(owner)),
                    String.format("Expected owner '%s' to have at least one vehicle", owner.getName())
            );
        }
    }

    @Test
    void testInvoicesBelongToOwners() {
        ArrayList<Owner> owners = DataLoader.loadOwners();
        ArrayList<Invoice> invoices = DataLoader.loadInvoices();

        assertNotNull(owners, "Owners list should not be null");
        assertNotNull(invoices, "Invoices list should not be null");

        for (Invoice invoice : invoices) {
            assertNotNull(invoice, "Invoice should not be null");
            assertTrue(
                    owners.stream().anyMatch(owner -> owner.getQid().equals(invoice.getOwnerQid())),
                    String.format("Expected invoice '%s' to belong to a valid owner", invoice.getInvoiceId())
            );
        }
    }
}
