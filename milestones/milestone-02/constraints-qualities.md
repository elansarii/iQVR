# 1. System Constraints
## 1.1 Technical Constraints
- **Constraint 1**: The use of qPay
- _Description_: The Qpay payment system will remain concected to the IQVR system which is used for all transactions in the IQVR system.
---
- **Constraint 2**: One system administrator
- _Description_: The IQVR should be managed by only 1 employe.
---
- **Constraint 3**: Online-only functionality
- _Description_: As the system works only online, it adds a requirement to the users to be constantly connected to the internet. As well as, the other external system that IQVR depends on, such as: Qpay.
---
- **Constraint 4**: Users scalability
- _Description_: The system must handle large users simultaneously using the system with different purposes.

---
- **Constraint 5**: Tight budget
- _Description_: The police department have a total money for not more than 10 new technicals for the system. Furthermore, the department allocated a budget for only 20 new servers for the project.

---
- **Constraint 6**: Programming languages used in the project
- _Description_: Most of the project should be built using Java and C as programming languages.
---

- **Constraint 7**: Data management
- _Description_: IQVR must use as an external software regarding the registration system which use Oracle database system.

---
## 1.2 Operational Guidelines Constraints
- **Constraint 1**: Required insurance policy
- _Description_: Each vehicle must have a unique insurance policy, by purchasing it from the insurance company.
---
- **Constraint 2**: Fitness certificate
- _Description_: Each vehicle over 2 years old, require a fitness certificate from an authorized workshop.
---
- **Constraint 3**: Paying fines
- _Description_: All fines and bills that are realted to a specific vehicle must be paied before the owner be ablle to register the vehicle, renewals, or trnsfer the ownership of the vehicle.
---
- **Constraint 4**: Accident disputes
- _Description_: If there is a disputes (between the owner and the victim) they have to go the police station, and they will not be able to solve it using the system.
***

## 1.3 Regulatory Constraints
- **Constraint 1**: Confidentiality of sensitive information
- _Description_: The system should provide security for the data, such as: owner QID, VIN.
---
- **Constraint 2**: Restricted access
- _Description_: Each user should have specific user interface for his/her role. For example, a vehicle owner will have a different access and a different privileges compared to an officer.
---
- **Constraint 3**: System deadline
- _Description_: The first version of IQVR should  be done in 3 months. And any other delay will cost the police department extra money as the system should operate after a year.

# 2. Quality Requirements (Non-Functional Requirements)
### ➡️ We can categorize these requirements into 6 groups: performance, security, reliability, usability, scalability, and maintainability.

### 2.1 Performance
- The system should be able to handle 10 million vehicles concurrently.
- The system must process the requests and handle them in 5 seconds for at least 90% of the users under normal conditions.
---

### 2.2 Security 
- All data transmited between the user and the the system must be secured from hackers or anyone who is not authorized. 
---
### 2.3 Reliabiity 
- The system by default should not crash, but in case of a failure happens, the system should recover and handle users requests within a couple of minutes.
- Backup modules should exits so the systesm are available for users regularly.
---
### 2.4 Usability
- The system should work in different operating systems such as: Mac, Linux, Windows. As well as, it should be responsive i.e. works with mobile phones, tablets\Ipdas, desktops, etc..
---
### 2.5 Scalability
- IQVR should handle more than 30 million vehicles in the next 10 years.
- IQVR system's component might be operate on different machines on several locations.
---
### 2.6 Maintainability
- The softwares in the system should not be highly depending on each other and they should be more precise on what they provide.

 ---
# 3 Additional Qualities

### ➡️ As we were doing the project, we have assumed that these qualities should exist in the the system.

#### 1. Security
- Confidential data like the owner's QID, owner's credit card must be encrypted between the system and the user using encryption algorithm such as: (SHA-256) algorithm.

---

#### 2. Reporting
- The system should generate detailed reports to the government, owners, and insurance companies. 
---
#### 3. User support 
- The system should offer to the users an AI chatbot to help vehicle owners and new employees who work on the sytsem and does not know how to use the system.