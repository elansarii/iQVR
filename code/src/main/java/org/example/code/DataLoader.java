package org.example.code;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.List;

public class DataLoader {

    public static ArrayList<Owner> loadOwners() {
        ArrayList<Owner> owners= new ArrayList<>();
        Owner o1= new Owner("Mohamed","Doha - Wadi Al Sail Street","1000","11223344");
        Owner o2= new Owner("Hamza","Al Rayyan - Al Sadd Road","2000","22334455");
        Owner o3= new Owner("Yazan","Doha - Corniche Street","3000","33445566");
        Owner o4= new Owner("Ahmed","Doha - Corniche Street","4000","44556677");

        owners.add(o1);
        owners.add(o2);
        owners.add(o3);
        owners.add(o4);
        return owners;
    }

    public static ArrayList<Vehicle> loadVehicles() {
        ArrayList<Owner> owners = loadOwners();
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle v1 = new Vehicle("1HGCM82633A123456", "Toyota", "Corolla", 2005,
                true, owners.get(0), owners.get(1), true, true);
        Vehicle v2 = new Vehicle("23456789012345678", "Nissan", "Sunny", 2018,
                true, owners.get(1), owners.get(2), false, true);
        Vehicle v3 = new Vehicle("34567890123456789", "Honda", "Civic", 2017,
                true, owners.get(2), owners.get(3), true, false);
        Vehicle v4 = new Vehicle("45678901234567890", "Ford", "Fusion", 2016,
                true, owners.get(3), owners.get(0), false, false);
        Vehicle v5 = new Vehicle("12345678901234567", "Toyota", "Camry", 2019,
                true, owners.get(0), owners.get(2), true, true);
        Vehicle v6 = new Vehicle("23456789012345678", "Nissan", "Sunny", 2018,
                true, owners.get(1), owners.get(3), false, true);
        Vehicle v7 = new Vehicle("34567890123456789", "Honda", "Civic", 2017,
                true, owners.get(2), owners.get(0), true, false);
        Vehicle v8 = new Vehicle("45678901234567890", "Ford", "Fusion", 2016,
                true, owners.get(3), owners.get(1), false, false);

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        vehicles.add(v4);
        vehicles.add(v5);
        vehicles.add(v6);
        vehicles.add(v7);
        vehicles.add(v8);
        return vehicles;
    }



    public static ArrayList<Invoice> loadInvoices() {
        ArrayList<Owner> owners = loadOwners();
        ArrayList<Vehicle> vehicles = loadVehicles();
        ArrayList<Invoice> invoices = new ArrayList<>();


        // Since the date format is ISO (yyyy-MM-dd), we can parse it directly
        Invoice i1 = new Invoice("0001", 150.0, LocalDate.parse("2024-07-12"),
                LocalDate.parse("2024-08-12"), "1000", "not paid", "transfer fee");
        Invoice i2 = new Invoice("0002", 100.0, LocalDate.parse("2024-02-12"),
                LocalDate.parse("2024-03-12"), "2000", "paid", "registration fee");
        Invoice i3 = new Invoice("0003", 120.0, LocalDate.parse("2024-09-12"),
                LocalDate.parse("2024-10-12"), "3000", "not paid", "speeding violation");
        Invoice i4 = new Invoice("0004", 200.0, LocalDate.parse("2024-10-15"),
                LocalDate.parse("2024-11-15"), "4000", "paid", "insurance");
        Invoice i5 = new Invoice("0005", 150.0, LocalDate.parse("2024-07-12"),
                LocalDate.parse("2024-08-12"), "1000", "not paid", "parking fee");
        Invoice i6 = new Invoice("0006", 100.0, LocalDate.parse("2024-02-12"),
                LocalDate.parse("2024-03-12"),"2000", "paid", "transfer fee");
        Invoice i7 = new Invoice("0007", 120.0, LocalDate.parse("2024-09-12"),
                LocalDate.parse("2024-10-12"), "3000", "not paid", "speeding violation");
        Invoice i8 = new Invoice("0008", 200.0, LocalDate.parse("2024-10-15"),
                LocalDate.parse("2024-11-15"), "4000", "paid", "fitness check");

        invoices.add(i1);
        invoices.add(i2);
        invoices.add(i3);
        invoices.add(i4);
        invoices.add(i5);
        invoices.add(i6);
        invoices.add(i7);
        invoices.add(i8);

        return invoices;
    }

}
