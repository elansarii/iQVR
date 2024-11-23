1- Testing Reliability :
testing the validation of Report Accident
	1- First case if we do not provide VIN for the owner
![[Pasted image 20241123194247.png]]
Error will occur for not providing an integer
![[Pasted image 20241123194300.png]]
	 2- Second case if we provide string for the VIN
![[Pasted image 20241123194320.png]]
Error occurred for not providing an integer
![[Pasted image 20241123194333.png]]
	 3 - Third case if we provided valid VIN for the Responsible car and kept vin of victim empty
![[Pasted image 20241123194402.png]]
Error occurred for not providing an integer 
![[Pasted image 20241123194418.png]]
	 4- fourth case if we provided valid VIN for the Responsible car and string for vin of victim empty
![[Pasted image 20241123194443.png]]
Error occurred for not providing an integer
![[Pasted image 20241123194454.png]]
	 5- fifth case if we did not provide a location
![[Pasted image 20241123194529.png]]
error for not providing a location
![[Pasted image 20241123194541.png]]
	6- sixth case if we did not provide a Description 
![[Pasted image 20241123194703.png]]
Error for not providing a Description

![[Pasted image 20241123194722.png]]
	7- last case when we provide all valid inputs 
![[Pasted image 20241123202934.png]]
all valid and then the asked to confirm
![[Pasted image 20241123203024.png]]
After confirming we will return back to the main menu
![[Pasted image 20241123203139.png]]
Testing Reliability for transfer use case:
	we have already data installed in data loader
		with names: Mohammed, Hamza, Yazan, Ahmad
		 and QIDs: 1000, 2000, 3000, 4000
	1- first case if we provide a wrong QID and tried to check pills
	![[Pasted image 20241123211201.png]]
	 2- second if we entered a valid QID:
	 ![[Pasted image 20241123211325.png]]
	 3- if did not enter a valid VIN and tried to transfer the car:
	 ![[Pasted image 20241123211522.png]]
	 4- fourth case if we tried to transfer a valid car to invalid QID:
	 ![[Pasted image 20241123211646.png]]
	 7- if we entered a phone number with more than 8 digits or Strings instead of integer:
	 ![[Pasted image 20241123211821.png]]
	 ![[Pasted image 20241123211855.png]]
	 8- if all information are valid:
		 ![[Pasted image 20241123211944.png]]
		 after hitting ok:
		 ![[Pasted image 20241123212009.png]]
2- Testing Portability:
	Testing if it works in Windows
	![[Pasted image 20241123212930.png]]