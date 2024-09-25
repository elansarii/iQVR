## Registration section

###  Transfer new vehicle
- Generate an  acknowledgment receipt for the company
- register new vehicles 
  - requires 
    1. VIN 
    2. MAKE
    3. MODEL
    4. YEAR OF Manufacture
- request owner name and QID if info matches with manufacture otherwise terminate the session
- checks with QTS using VIN and QID to check if the car is imported and retrieve IP (Insurance policy)
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
- <2 years, the vehicle performs a fitness check
- Check if the insurance policy exists
- Check for outstanding fines
- The renewal is for the same period as the insurance policy
- Insurance policy and fitness certificate are attached with the vehicle registration
- Generate new sticker and invoice for renewal  



## Finance section 
- 


##  Penalty section
- 


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

- To renew a registered vehicle:

	1. The vehicle owner enters the VIN into the system.
	2. The system retrieves the registration details and checks if the vehicle is over two years old.
		- If yes:
			1. The system finds
			the vehicle fitness certificate issued by an authorized workshop.
			2. The system retrieves the compulsory insurance policy of the vehicle issued by an
			insurance company.
			3. If a new insurance policy is available:
				- The system checks for any unpaid
				fines for traffic offences.
				- Otherwise:
					Terminate the system with the message “Get insurance policy”. 
			4. If there is any unpaid fine(s): 
				- Owner should pay the fine(s) with the message
				“Pay the bill first’’.
			5. Else:
				- The system creates a new registration with
					the same validation period as specified in the new insurance policy.
			6. The insurance policy and
			the fitness certificate are then attached with with the vehicle registration. 
			7. The system
			then prepares a new registration sticker with new validity. 
			8. The system finally creates an invoice for the
			registration renewal.

		- If no (else):
			- The system terminates with
			a message “Get fitness certificate first”.