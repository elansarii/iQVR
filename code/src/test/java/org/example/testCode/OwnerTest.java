package org.example.testCode;

import org.example.code.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @BeforeEach
    void setUp() {
        iQVR.bills.clear();
        iQVR.vehicles.clear();
    }

    @Test
    void testOwnerConstructor() {
        Owner owner = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        assertEquals("John Doe", owner.getName());
        assertEquals("123 Main St", owner.getAddress());
        assertEquals("12345", owner.getQid());
        assertEquals("9876543210", owner.getPhoneNumber());
    }

    @Test
    void testOwnerDetails() {
        Owner owner = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        owner.ownerDetails(owner);

        String expectedOutput = String.format(
                "Name: %s%nQID: %s%nPhone number: %s%nAddress: %s%n",
                "John Doe", "12345", "9876543210", "123 Main St"
        );
        System.setOut(System.out);
        assertEquals(expectedOutput, outContent.toString(), "Expected ownerDetails to output correct details");
    }

    @Test
    void testFindOutstandingBills() {
        Owner owner = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        iQVR.bills.add(new Invoice("0001", 100.0, LocalDate.now(), LocalDate.now().plusDays(30), "12345", "unpaid", "Test Bill"));
        iQVR.bills.add(new Invoice("0002", 200.0, LocalDate.now(), LocalDate.now().plusDays(30), "67890", "paid", "Another Bill"));

        assertFalse(owner.findOutstandingBills("12345"), "Expected owner to have outstanding bills");
        assertTrue(owner.findOutstandingBills("67890"), "Expected owner to have no outstanding bills");
    }

    @Test
    void testTransferOwner() {
        Owner currentOwner = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        Owner newOwner = new Owner("Jane Smith", "456 Elm St", "67890", "1234567890");

        Vehicle vehicle = new Vehicle("1HGCM82633A123456", "Toyota", "Corolla", 2005, true, currentOwner, null, true, true);
        iQVR.vehicles.add(vehicle);

        boolean transferResult = currentOwner.transferOwner(newOwner, "1HGCM82633A123456");
        assertTrue(transferResult, "Expected ownership transfer to succeed");

        assertEquals(newOwner, vehicle.getOwner(), "Expected vehicle's owner to be updated");
        assertEquals(currentOwner, vehicle.getPrevOwner(), "Expected vehicle's previous owner to be updated");
        assertEquals(1, iQVR.bills.size(), "Expected a new invoice to be created for the transfer");
        Invoice transferInvoice = iQVR.bills.get(0);
        assertEquals("67890", transferInvoice.getOwnerQid(), "Expected invoice to be for the new owner");
        assertEquals("Transfer of ownership", transferInvoice.getDescription(), "Expected invoice description to match");
    }

    @Test
    void testEqualsAndHashCode() {
        Owner owner1 = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        Owner owner2 = new Owner("Jane Smith", "456 Elm St", "12345", "1234567890");
        Owner owner3 = new Owner("Alice Brown", "789 Oak St", "67890", "5555555555");
        assertEquals(owner1, owner2, "Expected owners with the same QID to be equal");
        assertNotEquals(owner1, owner3, "Expected owners with different QIDs to not be equal");
        assertEquals(owner1.hashCode(), owner2.hashCode(), "Expected hashCodes to match for equal objects");
    }
}
