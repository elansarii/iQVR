# 1. System Constraints
## 1.1 Technical Constraints
- Constraint 1: The use of qPay
- _Description_: The Qpay payment system will remain concected to the IQVR system which is used for all transactions in the IQVR system.
---
- Constraint 2: One system administrator
- _Description_: The IQVR should be managed by only 1 employe.
---
- Constraint 3: Online-only functionality
- _Description_: As the system works only online, it adds a requirement to the users to be constantly connected to the internet. As well as, the other external system that IQVR depends on, such as: Qpay.
---
- Constraint 4: Users scalability
- _Description_: The system must handle large users simultaneously using the system with different purposes.
---
## 1.2 Operational Guidelines Constraints
- Constraint 1: Required insurance policy
- _Description_: Each vehicle must have a unique insurance policy, by purchasing it from the insurance company.
---
- Constraint 2: Fitness certificate
- _Description_: Each vehicle over 2 years old, require a fitness certificate from an authorized workshop.
---
- Constraint 3: Paying fines
- _Description_: All fines and bills that are realted to a specific vehicle must be paied before the owner be ablle to register the vehicle, renewals, or trnsfer the ownership of the vehicle.
---
- Constraint 4: Accident disputes
- _Description_: If there is a disputes (between the owner and the victim) they have to go the police station, and they will not be able to solve it using the system.
***

## 1.3 Regulatory Constraints
- Constraint 1: Confidentiality of sensitive information
- _Description_: The system should provide security for the data, such as: owner QID, VIN.
---
- Constraint 2: Restricted access
 - _Description_: Each user should have specific user interface for his/her role. For example, a vehicle owner will have a different access and a different privileges compared to an officer.
---
# 2. Quality Requirements (Non-Functional Requirements)
### We can categorize these requirements into 6 groups: performance, security, reliability, usability, scalability, and maintainability.

### 2.1 Performance
- The system should be able to handle 10 million vehicles concurrently, and also be able to handle more that 30 million vehicles in the next 10 years.

