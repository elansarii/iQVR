# Test Report: AccidentReportTest

### **Purpose**
This test to validates theAccidentReport class, ensuring its methods are working. including:
- Generate a unique report ID.
- Create a report file.
- Send the report to an insurance company.
- Access the object's data using getters.

---

## **Test Cases**

### 1. Test Case: **testGenerateReportId**
**What is being tested?**
- The AccidentReport class's ability to generate a non-null and non-empty report ID.

**Expected Result:**
- The generated report ID should:
  1. Not be null.
  2. Not be an empty string.

**Actual Result:**
- The test passed, confirming that the report ID was successfully generated and met the expected criteria.

---

### 2. Test Case: **testGenerateAccidentReport**
**What is being tested?**
- The generateAccidentReport method:
  1. Generates a text file named AccidentReport.txt
  2. The file should exist after execution.

**Expected Result:**
- A file with the correct name should be created and verified.

**Actual Result:**
- The test passed, confirming the file was generated successfully and later deleted during cleanup.

---

### 3. Test Case: **testSendReportToInsurance**
**What is being tested?**
- The sendReportToInsurance method:
  - It should execute without throwing exceptions.

**Expected Result:**
- The method should run without exceptions.

**Actual Result:**
- The test passed, indicating the method executed successfully without throwing exceptions.

---

### **4. Test Case: testGetters**
**What is being tested?**
- Getter methods for the following fields:
  - ownerVin
  - victimVin
  - location
  - description
  - date
  - time

**Expected Result:**
- The getters should return the following:
  1. ownerVin: "123"
  2. victimVin: "456"
  3. location: "Test Location"
  4. description: "Test Description"
  5. date: Current date (LocalDate.now()).
  6. time: Current hour (LocalTime.now().getHour()).

**Actual Result:**
- The test passed, confirming all getter methods returned the expected values, including dynamic ones like date and time.

---
![alt text](<Screenshot 2024-11-23 212513 1.png>)
# Test Report: InvoiceTest

## **Class Under Test**:  Invoice`

### **Purpose**
Testing functionality of the Invoice class, focusing on:
- Test invoices with and without provided IDs.
- Correct generation of invoice IDs and report files.
- Accurate  invoicet statuses.

---

## **Test Cases**

### 1. Test Case: test Invoice Constructor With Generated Id
  1. Automatically generate a unique invoice ID.
  2. Set default values for payment status unpaid, issue date, and due date (30 days from the issue date).

**Expected Result:**
- The invoice object should:
  - Have a non-null ID.
  - Default paymentStatus to unpaid.
  - Set issueDate to today's date.
  - Set dueDate to 30 days from today.

**Actual Result:**
- The test passed, confirming the expected behavior.

---

### 2. Test Case: testInvoiceConstructorWithProvidedId
- The Invoice constructor's behavior when an invoice ID is explicitly provided.

**Expected Result:**
- The object should correctly initialize all properties, including:
  - The provided ID.
  - Given  amount, issueDate, dueDate, ownerQid, paymentStatus, and description.

**Actual Result:**
- The test passed, indicating the constructor correctly handled provided data.

---

### 3. Test Case: testGenerateInvoiceId
- The Invoice class's ability to generate a valid UUID for the invoice ID.

**Expected Result:**
- The generated ID:
  1. Should not be null.
  2. Should be a valid UUID format.

**Actual Result:**
- The test passed, confirming the generated ID was valid and met the expected criteria.

---

### 4. Test Case: testGenerateInvoiceReport
- generateInvoiceReport:
  1. Generates a report file named Invoice.txt.
  2. The file content should match the invoice's details.

**Expected Result:**
- The file should:
  - Exist.
  - Contain all the invoice details in the expected format, including:
    - Invoice ID, Amount, Issue Date, Due Date, Owner QID, Payment Status, and Description.

**Actual Result:**
- The test passed, verifying the file was generated successfully and the content matched the expected structure.

---

### 5. Test Case: testSetPaymentStatus
- The behavior of the  setPaymentStatus method when updating the payment status.

**Expected Result:**
- The payment status should:
  - Initially default to unpaid.
  - Update to paid after invoking the method.

**Actual Result:**
- The test passed, confirming the payment status was correctly updated.

# **Test Report: DataLoaderTest**

## **Class Under Test**: `DataLoader`

### **Purpose**
Testing functionality of the `DataLoader` class, focusing on:
- Loading owners, vehicles, and invoices.
- Ensuring correct relationships between entities.
- Validating data integrity and correctness.

---

## **Test Cases**

### 1. Test Case: `testLoadOwners`
- Test the ability to load owner data from the data source.

**Expected Result:**
- The owners list:
  - Should not be null.
  - Should contain exactly 4 owners.
- For the first owner:
  - Name: Mohamed
  - Address: Doha - Wadi Al Sail Street
  - QID: 1000
  - Phone Number: 11223344
- For the second owner:
  - Name: Hamza
  - Address: Al Rayyan - Al Sadd Road
  - QID: 2000
  - Phone Number: 22334455

**Actual Result:**
- The test passed, confirming the owners were correctly loaded with expected values.

---

### 2. Test Case: `testLoadVehicles`
- Test the ability to load vehicle data from the data source.

**Expected Result:**
- The vehicles list:
  - Should not be null.
  - Should contain exactly 8 vehicles.
- For the first vehicle:
  - VIN: 1HGCM82633A123456
  - Make: Toyota
  - Model: Corolla
  - Year: 2005
  - Registered: True
  - Owner and Previous Owner: Not null

**Actual Result:**
- The test passed, confirming the vehicles were correctly loaded with expected values.

---

### 3. Test Case: `testLoadInvoices`
- Test the ability to load invoice data from the data source.

**Expected Result:**
- The invoices list:
  - Should not be null.
  - Should contain exactly 8 invoices.
- For the first invoice:
  - Invoice ID: 0001
  - Amount: 150.0
  - Issue Date: 2024-07-12
  - Due Date: 2024-08-12
  - Owner QID: 1000
  - Payment Status: unpaid
  - Description: transfer fee

**Actual Result:**
- The test passed, confirming the invoices were correctly loaded with expected values.

---

### 4. Test Case: `testOwnersHaveVehicles`
- Validate that all owners are associated with at least one vehicle.

**Expected Result:**
- Each owner in the owners list:
  - Should have at least one vehicle in the vehicles list with a matching owner reference.

**Actual Result:**
- The test passed, confirming all owners were associated with at least one vehicle.

---

### 5. Test Case: `testInvoicesBelongToOwners`
- Validate that all invoices are associated with a valid owner.

**Expected Result:**
- Each invoice in the invoices list:
  - Should have an owner QID that matches the QID of an owner in the owners list.

**Actual Result:**
- The test passed, confirming all invoices were correctly associated with valid owners.
![[Pasted image 20241123224104.png]]
---
# **Test Report: InsuranceCompanyTest**

## **Class Under Test**: `InsuranceCompany`

### **Purpose**
Testing functionality of the `InsuranceCompany` class, focusing on:
- Acknowledging accidents and generating appropriate accident report files.
- Ensuring the setup and teardown processes cleanly handle test files.

---

## **Test Cases**

### 1. Test Case: `testAcknowledgeAccident`
- Validate the `acknowledgeAccident` method's ability to:
  - Process an `AccidentReport`.
  - Generate an accident report file.

**Expected Result:**
- The method should:
  - Create a file named `AccidentReport_<unique_id>.txt`.
  - Include details about the accident in the file:
    - Description: Car collision at intersection.
    - Owner's VIN: OWNER123VIN.
    - Victim's VIN: VICTIM456VIN.
    - Location: Downtown Street, City.

**Actual Result:**
- The test passed, confirming the accident was acknowledged and the report file was successfully generated with the expected content.

---

### Setup and Teardown Processes
- **Setup:** 
  - A new `InsuranceCompany` object is initialized before each test.

- **Teardown:** 
  - Any files starting with `AccidentReport_` and ending with `.txt` are deleted after each test to maintain a clean testing environment.

**Result:**
- The setup and teardown processes executed successfully, ensuring isolation and cleanliness between test runs.
![[Pasted image 20241123224318.png]]
---
# **Test Report: OwnerTest**

## **Class Under Test**: `Owner`

### **Purpose**
Testing functionality of the `Owner` class, focusing on:
- Constructor initialization.
- Displaying owner details.
- Managing bills and outstanding payments.
- Transferring vehicle ownership.
- Validating equality and hash codes for owners.

---

## **Test Cases**

### 1. Test Case: `testOwnerConstructor`
- Validate the `Owner` constructor's ability to correctly initialize an owner object.

**Expected Result:**
- The `Owner` object should:
  - Name: John Doe
  - Address: 123 Main St
  - QID: 12345
  - Phone Number: 9876543210

**Actual Result:**
- The test passed, confirming the constructor correctly initialized the `Owner` object with the expected values.

---

### 2. Test Case: `testOwnerDetails`
- Validate the `ownerDetails` method's ability to display the correct owner information.

**Expected Result:**
- The method should output:
Name: John Doe QID: 12345 Phone number: 9876543210 Address: 123 Main St

**Actual Result:**
- The test passed, confirming the `ownerDetails` method output the expected information.

---

### 3. Test Case: `testFindOutstandingBills`
- Validate the `findOutstandingBills` method's ability to identify unpaid bills for the owner.

**Expected Result:**
- For the owner with QID `12345`:
- Expected to have outstanding bills.
- For the owner with QID `67890`:
- Expected to have no outstanding bills.

**Actual Result:**
- The test passed, confirming the method correctly identified outstanding and paid bills.

---

### 4. Test Case: `testTransferOwner`
- Validate the `transferOwner` method's ability to transfer vehicle ownership from one owner to another.

**Expected Result:**
- The transfer should:
- Succeed.
- Update the vehicle's owner to Jane Smith.
- Update the vehicle's previous owner to John Doe.
- Create a new invoice with:
  - Owner QID: 67890
  - Description: Transfer of ownership.

**Actual Result:**
- The test passed, confirming the ownership transfer was successful, and the invoice was generated correctly.

---

### 5. Test Case: `testEqualsAndHashCode`
- Validate the `equals` and `hashCode` methods for the `Owner` class.

**Expected Result:**
- Owners with the same QID should:
- Be equal.
- Have matching hash codes.
- Owners with different QIDs should:
- Not be equal.
- Have different hash codes.

**Actual Result:**
- The test passed, confirming the `equals` and `hashCode` methods behave as expected.

---

### Setup and Teardown Processes
- **Setup:** 
- Clear `iQVR.bills` and `iQVR.vehicles` before each test to ensure a clean testing environment.

**Result:**
- The setup process executed successfully, ensuring no interference between test runs.
![[Pasted image 20241123224602.png]]
---
# **Test Report: VehicleTest**

## **Class Under Test**: `Vehicle`

### **Purpose**
Testing functionality of the `Vehicle` class, focusing on:
- Constructor initialization.
- Proper functioning of getters and setters.
- Displaying vehicle details in a formatted output.

---

## **Test Cases**

### 1. Test Case: `testVehicleConstructor`
- Validate the `Vehicle` constructor's ability to correctly initialize a vehicle object with all its properties.

**Expected Result:**
- The `Vehicle` object should have:
  - VIN: 1HGCM82633A123456
  - Make: Toyota
  - Model: Corolla
  - Year: 2005
  - Registered: True
  - Owner: John Doe
  - Previous Owner: Jane Doe
  - Insurance Policy: True
  - Fitness Certificate: True

**Actual Result:**
- The test passed, confirming the constructor correctly initialized the `Vehicle` object with the expected values.

---

### 2. Test Case: `testGettersAndSetters`
- Validate the `setOwner` and `setPrevOwner` methods' ability to update owner-related properties.

**Expected Result:**
- After invoking `setOwner`:
  - The new owner should be Alice Smith.
- After invoking `setPrevOwner`:
  - The previous owner should be updated to John Doe.

**Actual Result:**
- The test passed, confirming the setters updated the owner and previous owner properties as expected.

---

### 3. Test Case: `testVehicleDetails`
- Validate the `vehicleDetails` method's ability to output correctly formatted vehicle details.

**Expected Result:**
- The method should output:
VIN: 1HGCM82633A123456 Make: Toyota Model: Corolla Year: 2005 Registered: true Owner: John Doe Previous Owner: Jane Doe Insurance Policy: true Fitness Certificate: false

**Actual Result:**
- The test passed, confirming the `vehicleDetails` method output the details in the expected format.
![[Pasted image 20241123224753.png]]
---
