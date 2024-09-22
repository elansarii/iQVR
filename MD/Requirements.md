## Registration section
- Generate an  acknowledgment receipt for the company
- register new vehicles 
  - requires 
    1. VIN 
    2. MAKE
    3. MODEL
    4. YEAR OF Manufacture
- request owner name and QID if info matches with manufacture otherwise terminate the session
- checks with QTS using VIN and QID to check if the car is imported and retreive IP (Insurance policy)
- records the vehicle to the owner 
	- QID
	- name
	- phone number
	- address
- generate a new registration sticker 
- and create an invoice for the transfer fee 




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
