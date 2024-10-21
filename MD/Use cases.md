## Registration section
### Use-case 1
- **Name**: Register New Vehicle
- **Description**: The owner registers a new, unregistered vehicle in the iQVR system, ensuring it is properly documented and insured before use.
- **Primary actor**: Vehicle Owner
- **Goal**: Successfully register the new vehicle in the iQVR system.
- **Triggers**: The owner has taken delivery of a new vehicle and needs to register it.
- **Preconditions**:
    - The vehicle owner must have a valid insurance policy for the vehicle.
    - The manufacturer must verify and confirm the legitimacy of the vehicle.
    - Qatar Trade Service (QTS) must confirm whether the vehicle was imported from overseas.
- **Postconditions**:
    - The vehicle is registered in the iQVR system.
    - A new registration sticker is generated.
    - An invoice for the registration fee is generated.
    - The new registration appears in the owner's list of registered vehicles, and unpaid bills are updated on the owner's page.
- **Main scenario**:
    1. The owner purchases an insurance policy from a registered insurance company, which is automatically recorded in iQVR.
    2. The owner enters the vehicle's VIN, make, model, and year of manufacture into the iQVR system.
    3. iQVR sends the vehicle information to the manufacturer's system to validate the VIN and confirm the vehicle’s legitimacy.
    4. iQVR communicates with Qatar Trade Service to confirm whether the vehicle was imported from overseas.
    5. If both checks are successful, the system generates a unique registration number for the vehicle.
    6. The owner enters their personal information (name and QID).
    7. The system generates a registration sticker for the vehicle and creates an invoice for the registration fee.
    8. The registration details, including the sticker and due invoice, are available for the owner to view and pay.
- **Extensions**:
    - 3a. **Manufacturer Does Not Confirm Vehicle**: The system terminates with the message “Incorrect vehicle information,” and no registration occurs.
    - 4a. **QTS Does Not Confirm Ownership**: The system terminates with the message “Incorrect ownership,” and no registration occurs.
    - 2a. **Insurance Policy Not Found**: The system prompts the user to purchase a valid insurance policy before proceeding.
- **Special requirements**:
    - The iQVR system must be seamlessly integrated with the manufacturer’s system and QTS for real-time validation.
    - Clear, user-friendly error messages should be displayed if any external validation fails, guiding the user on how to resolve the issue.


### Use-case 2

- **Name**: Transfer Ownership of Vehicle
- **Description**: This use case describes the process of transferring vehicle ownership from one person to another in the iQVR system.
- **Primary actor**: Current Owner (Previous Owner) and New Owner
- **Goal**: To transfer the vehicle registration and ownership to a new owner.
- **Triggers**: The current owner decides to sell the vehicle to a new owner.
- **Preconditions**:
    - The vehicle must be registered in the iQVR system.
    - The current owner must be the registered owner of the vehicle.
- **Postconditions**:
    - The current owner is set as the “previous owner” in the system.
    - The new owner is registered as the “current owner” in the system.
    - The insurance remains attached to the vehicle, but the new owner can update it later.
- **Main scenario**:
    1. The current owner enters the vehicle's VIN and their QID into the iQVR system.
    2. The system retrieves the registration details for the vehicle.
    3. The current owner confirms the vehicle details are correct.
    4. The new owner's name and QID are entered into the system.
    5. The system assigns the vehicle to the new owner, updates the registration, and records the current owner as the "previous owner."
    6. The insurance policy remains unchanged, but the system provides the option to update the insurance details later.
    7. The system generates a new registration sticker for the new owner and creates an invoice for the transfer fee.
- **Extensions**:
    - 3a. **Unpaid Bills or Fines**: If the current owner has unpaid invoices or fines, the system terminates with the message “Pay the bills first,” directing the owner to the payment portal.
    - 2a. **Incorrect Information**: If the system detects discrepancies between the registration details and the provided information, it terminates with the message “Incorrect information.”
- **Special requirements**:
    - The system should display a confirmation summary before finalizing the transfer, giving the current owner a last chance to review details.

### Use-case 3

- **Name**: Renew Vehicle Registration
- **Description**: The vehicle owner renews the registration of an expired or about-to-expire vehicle.
- **Primary actor**: Vehicle Owner
- **Goal**: To renew the registration of a registered vehicle in compliance with legal requirements.
- **Triggers**: The vehicle's registration is expired or approaching expiration.
- **Preconditions**:
    - The vehicle must already be registered in the iQVR system.
    - If the vehicle is over two years old, it must have a valid fitness certificate.
    - All unpaid bills and fines must be cleared.
    - The vehicle must have a valid insurance policy.
- **Postconditions**:
    - The vehicle registration is renewed for the duration of the insurance policy.
    - A new registration sticker is generated.
    - An invoice for the renewal fee is created and added to the owner’s unpaid bills.
- **Main scenario**:
    1. The owner enters the vehicle’s VIN into the iQVR system.
    2. The system retrieves the current registration details of the vehicle.
    3. If the vehicle is over two years old, the system checks for a valid fitness certificate from an authorized workshop.
    4. The system retrieves the vehicle's insurance policy from the insurance company.
    5. The system checks for any unpaid fines or bills.
    6. If all conditions are met, the system generates a new registration sticker and updates the registration for the duration of the insurance policy.
    7. The system generates an invoice for the registration renewal fee.
    8. The owner can view and download the new registration sticker and pay the renewal invoice.
- **Extensions**:
    - 3a. **No Fitness Certificate**: If the vehicle is over two years old and there is no fitness certificate, the system terminates with the message “Get fitness certificate first.”
    - 5a. **Unpaid Bills**: If the vehicle owner has unpaid bills or fines, the system directs the user to the payment portal with the message “Pay the bills first.”
- **Special requirements**:
    - The iQVR system must be integrated with the authorized workshops to verify the validity of fitness certificates.
    - The user interface should clearly notify the owner of any pending steps (such as obtaining a fitness certificate) required before renewal can be completed.

## Finance section
### Use-case 1
- **Name**: Pay Unpaid Invoices or Fines
- **Description**: Pay any unpaid invoices or fines for their vehicle using a credit card through the iQVR system.
- **Primary actor**: Vehicle Owner
- **Goal**: To allow the vehicle owner to settle unpaid invoices or fines associated with their vehicle.
- **Triggers**: The vehicle owner wants to pay an outstanding invoice or fine.
- **Preconditions**:
    - The vehicle owner must have a valid credit card.
    - The vehicle owner must be logged into the iQVR system.
    - The vehicle must have unpaid invoices or fines associated with it.
- **Postconditions**:
    - The unpaid invoices or fines are marked as paid.
    - A payment receipt is generated and displayed to the vehicle owner.
    - The invoice/fine details are updated in the system.
- **Main scenario**:
    1. The vehicle owner enters the VIN of the vehicle into the iQVR system.
    2. The system retrieves the vehicle registration details and verifies if there are any unpaid invoices or fines associated with the vehicle.
    3. If there are no unpaid invoices, the system terminates with the message “No unpaid invoices or fines.”
    4. If there are unpaid invoices or fines, the system lists them for the owner to review.
    5. The vehicle owner selects which invoices or fines they wish to pay.
    6. The system computes the total amount due and prompts the vehicle owner to enter credit card details.
    7. The vehicle owner enters the credit card details (number, name on the card, and expiration date).
    8. The system forwards the payment request to the qPay system for approval.
    9. qPay verifies the credit card’s validity by contacting the credit card provider (bank).
    10. If the card is valid, qPay returns an approval, and the system processes the payment.
    11. If the card is invalid, the system terminates with the message “Invalid credit card details. Please try again.”
    12. The system generates a payment receipt and marks the selected invoices or fines as paid.
    13. The vehicle owner can view and print the receipt.
- **Extensions**:
    - 8a. If qPay is unavailable or unresponsive, the system shows the message “Payment system unavailable. Please try again later.”
    - 9a. If the credit card is declined, the system prompts the vehicle owner to re-enter valid credit card details.
- **Special requirements**:
    - The system must ensure secure transmission of credit card details using encryption.
    - The system must handle timeout scenarios when communicating with qPay and display appropriate messages to the user.

## Penalty Section

### Use-case 1
- **Name**: **Retrieve and Display Vehicle Penalties**
- **Description**: Allows vehicle owners to retrieve and view penalties associated with their vehicles, categorized by type.
- **Primary actor**: Vehicle Owner, Traffic Policeman
- **Goal**: To provide vehicle owners with an organized view of their penalties for easier management.
- **Triggers**: Vehicle owner requests to view penalties.
- **Preconditions**: 
  - Vehicle owner is authenticated.
  - Vehicle VIN is provided.
  - Credit card details are entered for verification.
- **Postconditions**: Vehicle owner can see penalties linked to their vehicle.
- **Main scenario**:
  1. Vehicle owner logs into the system.
  2. Owner enters their vehicle's VIN.
  3. System verifies the VIN and retrieves associated penalties.
  4. Vehicle owner enters their credit card details for validation.
  5. System validates the credit card information.
  6. If valid, system displays the penalties.
  7. Vehicle owner can filter penalties by type.
- **Extensions**: 
  - If the VIN is invalid, display an error message and prompt for re-entry.
  - If the credit card validation fails, display an error message and prompt for re-entry.
- **Special requirements**: 
  - The system must ensure real-time data retrieval and secure handling of credit card information.

---

### Use-case 2
- **Name**: **Notify Vehicle Owners of New or Due Penalties**
- **Description**: Sends notifications to vehicle owners about new penalties or approaching due dates for existing penalties.
- **Primary actor**: Owner
- **Goal**: To keep vehicle owners informed about their penalties.
- **Triggers**: New penalty is added or an existing penalty's due date is approaching.
- **Preconditions**: 
  - New penalty is in the system or an existing penalty is nearing its due date.
- **Postconditions**: Vehicle owner receives timely notifications regarding penalties.
- **Main scenario**:
  1. System detects a new penalty or an approaching due date.
  2. System retrieves the contact information of the vehicle owner.
  3. System sends an automated notification to the vehicle owner.
- **Extensions**: 
  - If the contact information is missing, log an error for manual follow-up.
- **Special requirements**: 
  - Notifications must be sent via email and/or SMS, depending on user preference.


### Use-case 3
- **Name**: **Manage Confiscating Orders**
- **Description**: Allows traffic police to identify vehicles with excessive red-light offenced, create confiscating orders, confirm them, and broadcast these orders to all relevant police departments.
- **Primary actor**: Traffic Policeman
- **Goal**: To enforce confiscation of vehicles that exceed a specified number of red-light offences and ensure proper communication with police departments.
- **Triggers**: Traffic police requests to manage confiscating orders based on vehicle offences.
- **Preconditions**: 
  - Traffic police are authenticated.
  - Vehicle offence data is available in the system.
- **Postconditions**: 
  - Confiscating orders are created, confirmed, and broadcast to relevant police departments.
  - Vehicle registrations are cancelled, and owners are informed.
- **Main scenario**:
  1. Traffic police enters the desired time period and selects the red-light offence type.
  2. System retrieves vehicles with red-light offences within the specified timeframe.
  3. Traffic police selects vehicles that exceed the designated number of offences.
  4. System creates a confiscating order for each selected vehicle.
  5. System prompts traffic police for confirmation of the confiscating orders.
  6. Traffic police confirms the orders.
  7. System saves the confirmation and cancels the registrations of the vehicles.
  8. System informs the vehicle owners about the confiscating orders.
  9. System broadcasts the confirmed confiscating orders to all relevant police departments.
- **Extensions**: 
  - If no vehicles exceed the offence threshold, display a message indicating this.
  - If confirmation is not received from the traffic police, the orders remain pending.
  - If broadcasting fails, log the error for manual follow-up.
- **Special requirements**: 
  - The system must ensure secure data handling, accurate tracking of offences, and timely communication of orders.



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
  8. system call generate report to create the report for the accident method
  9. system call send report to insurance company method 
- Extensions:
	- 3a. if system did not retrieve VIN , owner should enter VIN again
	- 8a. if owner did not confirm no report will be generated
- Special requirements:
### Use-case 2

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
- **Name**: Get violated red-light cars
- **Description**: The policeman can select the time period and the red-light violation and it will list the vehicles that match these conditions.
- **Primary actor**: Policeman
- **Goal**: To get all vehicles that violated the red-light traffic.
- **Triggers**: The policeman wants to list all vehicles that violated the red-light traffic for specific time.
- **Preconditions**: 
	- There is at least a vehicle that violated the red-light traffic
- **Postconditions**:
	- Create a confiscating order for the violated vechils
- **Main scenario**:
  1. The policeman will enter a period time and choose the red-light violation.
  2. If the system got the the confirmation from the policeman/officer --> they system will cancel the registration of those vehicles.
  3. The violated car's owner will be informed about the order.
  4. The system broadcasts the confiscating order for all police departments.
- **Extensions**:
	- If the system did not receive a confirmation from the policeman/officer the registration of these vechils will **Not** be cancelled. 
- **Special requirements**:
	- The confirmation of order for confiscating the car will be saved.

### Use-case 2

- **Name**: Send notification to owner
- **Description**: This use case is responsible for sending a notification for the vehicle owner.
- **Primary actor**: Owner
- **Goal**: The owner gets a notification about his/her vehicle (violation or no violation).
- **Triggers**: An update to the vechile. 
- **Preconditions**:
	- The vechile is registered in IQVR system.
- **Postconditions**:
	- The vechile owner receives a notification.
- **Main scenario**:
  1. An update happens to the owner's vechile account (whether it is a violation or not).
  2. An SMS/email message will be generated describing the latest update.
  3. Send the message to the owner contact information.
- **Extensions**:
	- If the system does not have the contact information of the vechile's owner, The system will display a message to the owner to update his/her contact information.
  - If the message failed to be deliverd to the owner, the system will send the message again.
- **Special requirements**:
	- The registered vechile information should be connected/related with the owner's contact information (e.g. phone number).

### Use-case 3

- **Name**: Send fitness certificate reminders
- **Description**: This use case will remind/alert the vehile owner about the fitness certificate from the authorized workshop.
- **Primary actor**: Vechile owner, authorized workshop
- **Goal**: To remind the owner about expiration date of the fitness certificate. 
- **Triggers**: When the fitness certificate of the vechile become close.
- **Preconditions**:
	- The vehicle must be registered in the iQVR system.
- **Postconditions**:
	- 
- **Main scenario**:
  1. 
  2. 
  3. 
- **Extensions**:
	- 
  - 
- **Special requirements**:
	- 