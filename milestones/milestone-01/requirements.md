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

### Use-case 3
- **Name**: **Retrieve and Display Vehicle Penalties**
- **Description**: Allows vehicle owners to retrieve and view penalties associated with their vehicles, categorized by type.
- **Primary actor**: Vehicle Owner, Traffic Policeman
- **Goal**: To provide vehicle owners with an organized view of their penalties for easier management.
- **Triggers**: Vehicle owner requests to view penalties.
- **Preconditions**: 
  - Vehicle owner is authenticated.
  - Vehicle VIN is provided.
- **Postconditions**: Vehicle owner can see penalties linked to their vehicle.
- **Main scenario**:
  1. Vehicle owner logs into the system.
  2. Owner enters their vehicle's VIN.
  3. System verifies the VIN and retrieves associated penalties.
  4. If valid, system displays the penalties.
  5. Vehicle owner can filter penalties by type.
- **Extensions**: 
  - If the VIN is invalid, display an error message and prompt for re-entry.
  - If the credit card validation fails, display an error message and prompt for re-entry.
- **Special requirements**: 
  - The system must ensure real-time data retrieval and secure handling of credit card information.

### Use-case 4

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


### Use-case 5

- **Name**: Check fitness certificate status
- **Description**: This use case will make the owner able to view and check the fitness certificate status and check the details of the workshop that issued the certificate using the application.
- **Primary actor**: Vehicle owner
- **Goal**: The Vehicle owner can view the current information about the fitness certificate of the Vehicle. 
- **Triggers**: The vehicle owner and selects the option to view the fitness certificate status.
- **Preconditions**:
	- The vehicle must be registered in the iQVR system.
  - The vehicle owner must have a fitness certificate issued for their vehicle. 
- **Postconditions**:
	- The system displays the current status of the fitness certificate, such as: valid or not, Expiration date. 
- **Main scenario**:
  1. The vehicle owner logs into his account.
  2. Select the opion of check the fitness certificate information
  3. The system displays the current status.
- **Extensions**:
	- 3a. If the owner vechile does not have a fitness certificate, a the system will prompt a message asking the owner to get a fitness certificate.

- **Special requirements**:
	- Any updates on the fitness certificate by the authorized workshop should be reflected on the fitness certificate information for the owner to check it.