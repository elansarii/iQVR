## Registration section
### Use-case 1

- Name: Register new vehicle
- Description: The new owner is registering a vehicle that has not been registered before
- Primary actor: Owner
- Goal: Register the car in iQVR system
- Triggers: The owner took delivery of a new vehicle
- Preconditions: 
	- Insurance policy
	- The manufacturer confirms the legitimacy the car
	- Confirm if the car is from overseas with QTS
- Postconditions:
	- Register the car in iQVR system
	- Generate registration sticker
	- Generate invoice for the registration fee
	- Update the due bills in the owners page
- Main scenario:
  1. Owner purchases insurance policy
  2. Owner enters VIN, make, model, year of manufacturing 
  3. Data is validated with the manufacturer 
  4. Car is checked if its from overseas 
  5. Displays the generated registration number
  6. Owner enters their name and QID
  7. Owner receives the registration sticker and transfer invoice 
- Extensions:
	- Manufacturer Does Not Confirm Vehicle
	- QTS Does Not Confirm Ownership
	- Insurance Policy Not Found
- Special requirements:
	- The iQVR system must be integrated with the manufacturer's system and the QTS system for real-time validation of vehicle information.
	- Clear error messages and guidance should be provided to the user if any validations fail.


### Use-case 2

- Name: Transfer ownership from one to another
- Description: Transferring the ownership of the car from one owner to another
- Primary actor: Previous owner, new owner
- Goal: Transferring the registration info to the new owner
- Triggers: The pervious owner is selling his/her car
- Preconditions: 
	- The car is registered previously in iQVR
- Postconditions:
	- The current owner is set as "Previous owner"
	- The new owner is set as "Current owner"
- Main scenario:
  1. Current owner enters VIN and his QID
  2. The system retrieves registration info of the car
  4. New owner QID and name is provided to the system
  5. Insurance is transferred  
- Extensions:
	- There are unpaid bills/fines by the current owner
	- The information of the car doesn't match with the owners info
- Special requirements:
	- none

### Use-case 3

- Name: Renew Registration
- Description: The owner renews his/her expired registration
- Primary actor: Owner
- Goal: Renewing the registration
- Triggers: The registration is expired
- Preconditions:
	- The car is registered in iQVR previously
	- The car has a fitness check if its >2 years old
	- All bills/fees are paid
- Postconditions: Registration is renewed for the duration of the insurance policy
- Main scenario:
  1. Owner Enters VIN
  2. Retrieve registration  details 
  3. Insurance policy and fitness certificate are attached
  4. Receive a new registration sticker
  5. Receive an invoice for the renewal
- Extensions:
	- The car doesn't have fitness certificate and is more than 2 years old
	- There are unpaid bills and the owner is forwarded to the payment portal to pay their bills
- Special requirements:
	- Integration with the mechanic shop to validate fitness certificates 

## Finance section
### Use-case 1
- Name:
- Description:
- Primary actor:
- Goal:
- Triggers:
- Preconditions:
- Postconditions:
- Main scenario:
  1.
  2.
- Extensions:
- Special requirements:



## Penalty section
### Use-case 1

- Name:
- Description:
- Primary actor:
- Goal:
- Triggers:
- Preconditions:
- Postconditions:
- Main scenario:
  1.
  2.
- Extensions:
- Special requirements:


## Accident section
### Use-case 1
Name: Start Report Accident
- Description: Owner Start the report when he accepts his fault
- Primary actor: Owner
- Goal: Create accident report 
- Triggers: Owner starts the report
- Preconditions: 
	- owner accepts his fault
	- the VIN of both parties are known
- Postconditions: 
	- Create accident report
	- both parties can retrieve accident report
	- authorized company can retrieve the report
- Main scenario:
  1. the owner log in to the system and selects to report the accident
  2. the owner enter the VIN of both parties 
  3. System checks the provided VINs
  4. System call provide accident details method 
  5. system save the details
  6. system call confirm fault method
  7. owner confirm his fault
  8. system call generate report to create the report for the accident
- Extensions:
	- 3a. if system did not retrieve VIN , owner should enter VIN again
	- 8a. if owner did not confirm no report will be generated
- Special requirements:


### Use-case 2

- Name: Send report to insurance company
- Description: System sends the report after creating it to the insurance company
- Primary actor: 
	- System (iQVR) 
	- insurance company
- Goal: successfully send report to insurance company 
- Triggers: report gets created 
- Preconditions:
	- system created the report successfully 
- Postconditions: 
	- report get sent to insurance company
- Main scenario:
  1. System retrieve report 
  2. System send report to insurance company
  3. insurance company sends an acknowledgment
  4. system call Record acknowledgment receipt method to save insurance receipt 
  5. system make the report available for both parties after receiving acknowledgment 
- Extensions:
- Special requirements:
### Use-case 3

- Name: Retrieve Accident Report
- Description: Accident report is available for authorized companies to retrieve 
- Primary actor:
	- authorized company
- Goal: authorized company can retrieve accident report by case number
- Triggers: Authorized company request to retrieve accident report
- Preconditions:
	- accident report have already been created
	- Authorized company has access 
	- Authorized company has the case number
- Postconditions:
	- Authorized company retrieve the report
- Main scenario:
  1. Authorized company enter the case number
  2. system send the report with matching case number
- Extensions:
	- 1a. If non-valid case number tell the authorized company case number is not valid and ask the Authorized company to enter the case number again
- Special requirements:
	- System insure the company has the access to retrieve the report 
## Technical section
### Use-case 1
- Name: Get violated red-light cars
- Description: The policeman can select the time period and the red-light violation and it will list the vehicles that match these conditions.
- Primary actor: Policeman
- Goal: To get all vehicles that violated the red-light traffic.
- Triggers: The policeman wants to list all vehicles that violated the red-light traffic for specific time.
- Preconditions: 
	- There is at least a vehicle that violated the red-light traffic
- Postconditions:
	- Create a confiscating order for the violated vechils
- Main scenario:
  1. The policeman will enter a period time and choose the red-light violation.
  2. If the system got the the confirmation from the policeman/officer --> they system will cancel the registration of those vehicles.
  3. The violated car's owner will be informed about the order.
  4. The system broadcasts the confiscating order for all police departments.
- Extensions:
	- The violated cars will have a high red-light offences.
- Special requirements:
	- The confirmation of order for confiscating the car will be saved.

### Use-case 2

- Name: Send Notification to owner
- Description: This use case is responsible for sending a notification for the vehicle owner.
- Primary actor: Owner
- Goal: The owner gets a notification about his/her vehicle (violation or no violation).
- Triggers: An update to the vechile. 
- Preconditions:
	- The vechile is registered in IQVR system.
- Postconditions:
	- The vechile owner receives a notification.
- Main scenario:
  1. 
  2.
- Extensions:
- Special requirements:
	- The registered vechile should be connected with the owner's contact information.