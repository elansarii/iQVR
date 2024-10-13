## Registration section
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