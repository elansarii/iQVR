***Design pattern I***
- Factory method
	- Why factory method?
			The system has many classes that might be divided to different types and we need to control the creation of the object and reduce code duplication and easier to add a different type of the object in the factory method. 
			in our case we chose to apply the factory method on invoice class
	- Why Invoice class?
			we applied the factory method on the class Invoice due to the fact that the system deals with different invoice types  such as Transfer, Fine , Registration invoice, to ensure flexibility and scalability of the system we must manage the logic of Invoice creation so applying the factory method will help us to improve many aspects such as reducing the code , adding different types of invoice that could appear in the future.
	- Future Recommendation 
			Factory method could be applied to several use cases in our project 
			such as Violation (Red Traffic, speeding, etc.) 
			Creating Singleton pattern on Database (When implementing database in future).
***Design pattern II***
 - Observer
	 - Why Observer?
		    Observer was implemented to allow different objects to receive updates from another objects when anything changes, which makes the interactions dynamic in the system.
	- Why Accident Report class?
			Accident report class involves more than one actor that are directly related to the use case such as owner and insurance company.
			Wherefore the actors need to be dynamically updated whenever changes occur after an accident report. So implementing the observer will play the role on updating both of the actors and managing notification. 
    - Future Recommendation
		    Implementing Command pattern for use cases such as transfer car, accident report and car registration.
		    implementing behavioral patterns is beneficial in many ways that will make the system flexible, dynamic and maintainability by reducing coupling.    
		   
