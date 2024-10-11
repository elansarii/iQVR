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
  4. owner enters the accident details 
  5. owner confirm his fault
  6. system generate the report
- Extensions:
	- 3a. if system did not retrieve VIN , owner should enter VIN again
	- 5a. if owner did not confirm no report will be generated
- Special requirements:
### Use-case 2
- Name: Record Accident details
- Description: Owner put the details after applying for accident report
- Primary actor: Owner
- Goal: Save the details about the accident
- Triggers: Owner started the report
- Preconditions: owner start the report 
- Postconditions: save the details of the accident
- Main scenario:
  1. After creating a report owner put the details of the accident
  2. system saves the details of the accident
- Extensions:
- Special requirements:
### Use-case 3
- Name: Confirm fault
- Description: Owner confirm by this option that it is his fault car
- Primary actor: owner
- Goal: Send confirmation to create the report
- Triggers: Owner start the report and enter the details
- Preconditions:
	- applied for the report
	- entered the accident details
- Postconditions: send confirmation to create the report
- Main scenario:
  1. owner confirm that it is his fault
  2. system save the answer 
- Extensions: 1a. if owner did no confirm no report will be created
- Special requirements:
### Use-case 4

- Name: Create Report
- Description: System create the report after saving all the details and the confirmation from owner
- Primary actor: System (iQVR)
- Goal: create a unique report containing all information 
- Triggers: owner put all the details and confirm his fault
- Preconditions: 
	- owner entered details
	- owner confirm his fault
- Postconditions:
	- successfully create report containing all accident information
- Main scenario:
  1. System saves the details entered by the owner
  2. create report with all relevant information
- Extensions:
- Special requirements:
### Use-case 5

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
- Extensions:
- Special requirements:
### Use-case 6

- Name: Record acknowledgment receipt
- Description: insurance company send acknowledgment receipt to the system and save it
- Primary actor: 
	- insurance company 
	- System (iQVR)
- Goal: System successfully save the acknowledgment receipt received from the insurance company
- Triggers: System send accident report to insurance company
- Preconditions: 
	- system creates report
	- system send report to insurance company
- Postconditions:
	- save acknowledgment receipt in system
- Main scenario:
  1. system send report accident to insurance company
  2. insurance company send acknowledgment receipt to system
- Extensions:
- Special requirements:
### Use-case 7
- Name: make report available for both parties
- Description: System make the report available for both parties after getting acknowledgment  
- Primary actor:
	- Owner 
	- victim
- Goal: make the report available for both parties
- Triggers: insurance company acknowledge report sent by system
- Preconditions:
	- System creates the report
	- insurance company acknowledge report 
	- System gets acknowledgment receipt
- Postconditions:
	- report will be available for both parties to retrieve 
- Main scenario:
  1. system gets acknowledgment receipt 
  2. system make the report available 
- Extensions:
- Special requirements:
### Use-case 8

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