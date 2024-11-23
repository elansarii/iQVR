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
  1. Generates a text file named AccidentReport_<reportId>.txt.
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