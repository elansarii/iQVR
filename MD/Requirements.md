## Registration section

- New owner Aquire insurance policy
- Workshop issue multiple fitness certificate

###  Transfer new vehicle
- Generate an acknowledgment receipt for the company for the insured car
- register new vehicles requires 
	1. VIN 
	2. MAKE
	3. MODEL
	4. YEAR OF Manufacture
- Request new owner name and QID
- Verify with QTS using VIN and QID to check if the car is imported and retrieve IP (Insurance policy)
- records the vehicle to the owner 
	- QID
	- name
	- phone number
	- address
- generate a new registration sticker and create an invoice for the transfer fee 
### Transfer used vehicle
- Current owner enters VIN and QID
- Validate the details with the system
- Check for any unpaid bills
- New owner provides name, QID, mobile phone
- Assign the new owner as "Current owner" and the current owner to "Previous owner"
- The insurance policy remains the same
- Generate a registration sticker and transfer fee invoice
### Renew registration
- Check if the vehicle is over two years
- >2 years, the vehicle performs a fitness check
- Check if the insurance policy exists
- Check for outstanding fines
- The renewal is for the same period as the insurance policy
- Insurance policy and fitness certificate are attached with the vehicle registration
- Generate new sticker and invoice for renewal  



## Finance section 
- Pay unpaid invoices/fines with credit card
- Request credit car information (Number, cardholder name, validity)
- Validate if the vehicle details exist
- List unpaid invoices
- User selects the desired bills to pay
- The total amount is calculated
- User is forwarded to qPay to proceed with payment
- Check credit card validity with the bank
- iQVR system records the outcome of qPay
- Record the approval number
- Prepare a payment receipt
- Update the unpaid invoices for the respective vehicle


##  Penalty section

-  Retrieve and display penalties associated with vehicles.
-  Verify vehicle and owner credentials (VIN, QID).
-  Summarize outstanding penalties (e.g., fines for traffic violations).
-  Allow selection of penalties for settlement.
-  Forward total penalty amount for secure online payment processing.
-  Ensure real-time payment validation and authorization.
-  Confirm payment success and update penalty records.
-  Provide payment receipts and update vehicle history.
- Search filter 

   ### Assumptions 
- **Security and Authentication**:  
     - Assume the system implements strong encryption and authentication mechanisms to ensure secure processing of sensitive data (like credit card details) during payment.
- **User Notification**:  
	 - Assume the system sends automatic notifications (via email or SMS) to vehicle owners when a new penalty is added or when penalties are approaching their due dates.
- **Penalty Categorization**:  
	 - Assume penalties are categorized (e.g., parking violations, speeding, red-light offenses), and the system is capable of differentiating between penalty types for better user experience.

## Accident section
- Accident between two vehicles and one vehicle accepts his/her fault:
	- Require
		-  VIN of his vehicle
		-  VIN of victim vehicle
	- System find details and information of both vehicle
	- provide and record the following:
		- date, time, location and brief description of the accident
	- by default the one who entered the data is the offended vehicle owner 
	- ask for confirmation from offending owner and store information
	- find the insurance policy of offending car and create accident report with unique case number
	- send the report to the insurance company 
	- insurance company sends an acknowledgment receipt saved by iQVR
	- make report available for both parties (victim and offender)
	- any authorized company can retrieve the report by the case number
- if dispute from any parties:
	- no online reporting is allowed and must go to police station

## Technical section

- The system now handle 10M cars, in future it will be 30M.
- The data of the vehicles and the ownership details are
confidential from general user-level functions.
- The software could be portable (run on various machines like mobile, etc...)
- In the future the software can be distributed on different machines in different
locations.
- Backup modules will be exists to support the availability of the systems.
- Software components should be less dependent on each
other, and more focused in there job.
- The police department have budget only for 10 new technical staff for this project.
- And only 20 new servers.
- The system must run as a plug-in for
the registration system that uses the Oracle database ("plug-in" is a software extends the functionality of another system without requiring alot of redesigning of the main system.)
- Most functions were developed using Java and C.
- The first version should be completed within 3 months.
- The system is expected to start operating after 12 months.
light offence type from the system.
- The police can enter the period of time (day, week, month) and select the red light offence, which will list all cars that match these criteria.
- The police can select just a certin number of vehicle that exceed a specific number of red light offences during this period.
- Then the system will create a confiscating order for these vechils (high red light offences) and asks for confirmation from the police.
- If the system got the confirmation (will be saved) and then the system will cancel the registration of those vehicles, and inform the owner about the order of confiscating of his/her car.
- The system then broadcasts the order to all police departments.
- A one vehicle can have more than one order, and many confiscating order can be attached for only one vehicle (one-to-many).
- Role-Based Access Control (RBAC): implement RBAC to control system access and capabilities based on predefined user roles (Vehicle owner, Colonel, Captain, etc...).
- Role Definition: Define specific permissions for each role, such as querying, selecting, confirming orders, cancelling registrations, and broadcasting orders for traffic police all based on the rank.
- User Authentication and Authorization: the system should implement a secure login mechanisms to authenticate users and protect their information and authorization mechanism to make the user access the system based on their role.
- The system offer the user a various way of authentication, such as: Face ID, Fingerprint, password, or Multi-factor authentication (mfa).
- For more authentication during the transaction process (such as: paying violations) the system provide the vehicle owner with One-time password (OTP).
- Enable system administrators (senior engineer or high officer rank assuming) to create, modify, and delete user roles.
- Design the user interface to dynamically display information and actions based on the user's role and permissions.
- Notification system:
	- The violation is detected either by traffic cameras, police officers, renew the insurance policy, or renew fitness certificate.
	- If violation recorded the vehicle's registration number, violation type, and time/place of the incident is collected.
	- then vehicle's owner is identified through the vehicle registration database.
	- The system generates a message detailing the violation, includes fine amount, payment deadlines, legal consequences. Or a message Confirmation regarding renew the insurance policy or the fitness certificate. 
	- The message is automatically sent to the owner via (SMS, email, app notification).
- The system should be able to handle and store the vehicle fitness certificate which is issued by an authorized workshop.
