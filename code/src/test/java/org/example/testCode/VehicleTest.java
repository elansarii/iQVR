package org.example.testCode;

import org.example.code.Vehicle;
import org.example.code.Owner;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testVehicleConstructor() {
        Owner owner = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        Owner prevOwner = new Owner("Jane Doe", "456 Elm St", "67890", "1234567890");
        Vehicle vehicle = new Vehicle(
                "1HGCM82633A123456", "Toyota", "Corolla", 2005, true, owner, prevOwner, true, true
        );


        assertEquals("1HGCM82633A123456", vehicle.getVin());
        assertEquals("Toyota", vehicle.getMake());
        assertEquals("Corolla", vehicle.getModel());
        assertEquals(2005, vehicle.getYear());
        assertTrue(vehicle.isRegistered());
        assertEquals(owner, vehicle.getOwner());
        assertEquals(prevOwner, vehicle.getPrevOwner());
        assertTrue(vehicle.getInsurancePolicyNum());
        assertTrue(vehicle.getFitnessCertNum());
    }

    @Test
    void testGettersAndSetters() {
        Owner owner = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        Owner prevOwner = new Owner("Jane Doe", "456 Elm St", "67890", "1234567890");
        Vehicle vehicle = new Vehicle(
                "1HGCM82633A123456", "Toyota", "Corolla", 2005, true, owner, prevOwner, true, true
        );


        Owner newOwner = new Owner("Alice Smith", "789 Oak St", "54321", "0987654321");
        vehicle.setOwner(newOwner);
        assertEquals(newOwner, vehicle.getOwner(), "Expected the owner to be updated");


        vehicle.setPrevOwner(owner);
        assertEquals(owner, vehicle.getPrevOwner(), "Expected the previous owner to be updated");
    }

    @Test
    void testVehicleDetails() {
        Owner owner = new Owner("John Doe", "123 Main St", "12345", "9876543210");
        Owner prevOwner = new Owner("Jane Doe", "456 Elm St", "67890", "1234567890");
        Vehicle vehicle = new Vehicle(
                "1HGCM82633A123456", "Toyota", "Corolla", 2005, true, owner, prevOwner, true, false
        );


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        vehicle.vehicleDetails();

        String expectedOutput = String.format(
                "VIN: %s%nMake: %s%nModel: %s%nYear: %d%nRegistered: %b%nOwner: %s%nPrevious Owner: %s%nInsurance Policy: %b%nFitness Certificate: %b%n",
                "1HGCM82633A123456", "Toyota", "Corolla", 2005, true, "John Doe", "Jane Doe", true, false
        );


        System.setOut(System.out);


        assertEquals(expectedOutput, outContent.toString(), "Expected vehicleDetails to output correctly formatted details");
    }
}
