***Design pattern I***
- Factory method
	- Why factory method?
			The system has many classes that might be divided to different types and we need to control the creation of the object and reduce code duplication and easier to add a different type of the object in the factory method. 
			in our case we chose to apply the factory method on invoice class
	- Why Invoice class?
			we applied the factory method on the class Invoice due to the fact that the system deals with different invoice types  such as Transfer, Fine , Registration invoice, to ensure flexibility and scalability of the system 
			we must manage the logic of Invoice creation because the system provides many services that requires generating different types of Invoices.
			So applying the factory method will help us to improve many aspects 
			such as reducing the code , adding different types of invoice that could appear in the future.
