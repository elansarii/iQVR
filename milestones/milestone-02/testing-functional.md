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
![alt text](<Screenshot 2024-11-23 212513.png>)
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

