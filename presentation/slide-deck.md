---
marp: true
theme: rose-pine
# theme: rose-pine-dawn
# theme: rose-pine-moon
---
<style lang=css> /* @theme rose-pine-dawn */
/*
Rosé Pine theme create by RAINBOWFLESH
> www.rosepinetheme.com
MIT License https://github.com/rainbowflesh/Rose-Pine-For-Marp/blob/master/license

palette in :root
*/

@import "default";
@import "schema";
@import "structure";

:root {
    --base: #faf4ed;
    --surface: #fffaf3;
    --overlay: #f2e9e1;
    --muted: #9893a5;
    --subtle: #797593;
    --text: #575279;
    --love: #b4637a;
    --gold: #ea9d34;
    --rose: #d7827e;
    --pine: #286983;
    --foam: #56949f;
    --iris: #907aa9;
    --highlight-low: #f4ede8;
    --highlight-muted: #dfdad9;
    --highlight-high: #cecacd;

    font-family: Pier Sans, ui-sans-serif, system-ui, -apple-system,
        BlinkMacSystemFont, Segoe UI, Roboto, Helvetica Neue, Arial, Noto Sans,
        sans-serif, "Apple Color Emoji", "Segoe UI Emoji", Segoe UI Symbol,
        "Noto Color Emoji";
    font-weight: initial;

    background-color: var(--base);
}
/* Common style */
h1 {
    color: var(--rose);
    padding-bottom: 2mm;
    margin-bottom: 12mm;
}
h2 {
    color: var(--rose);
}
h3 {
    color: var(--rose);
}
h4 {
    color: var(--rose);
}
h5 {
    color: var(--rose);
}
h6 {
    color: var(--rose);
}
a {
    color: var(--iris);
}
p {
    font-size: 20pt;
    font-weight: 600;
    color: var(--text);
}
code {
    color: var(--text);
    background-color: var(--highlight-muted);
}
text {
    color: var(--text);
}
ul {
    color: var(--subtle);
}
li {
    color: var(--subtle);
}
img {
    background-color: var(--highlight-low);
}
strong {
    color: var(--text);
    font-weight: inherit;
    font-weight: 800;
}
mjx-container {
    color: var(--text);
}
marp-pre {
    background-color: var(--overlay);
    border-color: var(--highlight-high);
}

/* Code blok */
.hljs-comment {
    color: var(--muted);
}
.hljs-attr {
    color: var(--foam);
}
.hljs-punctuation {
    color: var(--subtle);
}
.hljs-string {
    color: var(--gold);
}
.hljs-title {
    color: var(--foam);
}
.hljs-keyword {
    color: var(--pine);
}
.hljs-variable {
    color: var(--text);
}
.hljs-literal {
    color: var(--rose);
}
.hljs-type {
    color: var(--love);
}
.hljs-number {
    color: var(--gold);
}
.hljs-built_in {
    color: var(--love);
}
.hljs-params {
    color: var(--iris);
}
.hljs-symbol {
    color: var(--foam);
}
.hljs-meta {
    color: var(--subtle);
}</style>


## **iQVR System Overview**

### **Team Members:**
1. Mohamed Elansari  
2. Hamza Aljaji  
3. Ahmed Almashhadani  
4. Yazan Alsaleh  

---

## **Milestone 1: Ideation & Modeling**

### **Ideation:**
- **Extracting Requirements:**  
  - Carefully analyzed and extracted both functional and non-functional requirements from the project documentation.
  
- **Functional Requirements:**
  - List of system features and behaviors required for operation.

---

- **Non-Functional Requirements:**
  - System performance, security, scalability, and usability standards.

- **Use Case Specification:**  
  - Defined the use cases for the critical parts of the program to ensure a clear understanding of user interactions.

---

### **Modeling:**

- **Level 0 and 1 Data Flow Diagrams (DFD):**  
  - Created clear and detailed DFDs to visualize the data processing within the system at a high level.

- **Use Case Diagram:**  
  - Developed a diagram to capture the interactions between users and the system.

- **Class Diagram:**  
  - Designed a cohesive and maintainable class diagram.

---

## **Milestone 2: Planning & Implementation**

### **Planning:**

- **Sequence Diagram:**  
  - Designed a sequence diagram to detail the flow of the system’s interactions, focusing on the order of operations.

- **Identifying Key Features:**  
  - Determined core features and functionalities required for successful implementation.

---

### **Implementation:**

- **Use Case Implementation (Java & JavaFX):**  
  - Developed the program's use cases using Java and JavaFX for front-end development, focusing on clean user interfaces.

- **Styling with CSS:**  
  - Applied CSS to enhance the visual appeal and improve the user experience.

- **Icons Integration:**  
  - Integrated free-to-use icons to increase visual clarity and improve interface intuitiveness.

---

### **Potential Improvements in Implementation:**

1. **SQL Database Integration:**
   - **Improve Data Reliability:** Replace file-based storage with an SQL database (e.g., Oracle DB) for persistent, secure data storage and scalable data management.

2. **Enhanced Visual Libraries:**
   - Use advanced JavaFX libraries like **JFoenix** or **ControlsFX** to achieve a modern and polished design with better UI controls and visuals.

3. **UI/UX Enhancements:**
   - Implement responsive design and intuitive navigation.

---

### **Testing:**
1. **Tested Functional Features:**
    - Ensured the functionality of the GUI.
    - Tested for correct output and invoices.
2. **Testing Non-Functional Features:**
    - Tested the portability of the program.

---

## **Challenges & Outcomes**

### **Challenges:**
- **Modern Design with FX Libraries:**  
  - Faced difficulties in using FX libraries.

- **Scene Builder Issues:**  
  - Encountered limitations with Scene Builder.

---

- **Class Responsibility Distribution:**  
  - Struggled with effectively assigning responsibilities.

- **Issues with Dataflow Diagram:**  
  - Too complicated to read/do.  
  - Doesn't provide much information on the system.

---

### **Outcomes:**
- **Chatbots Are Impressive (Not Really):**
  - Helpful to get things initiated.  
  - A good friend to talk to.  
  - Very annoying.

- **Got a Peek of What's to Come:**  
  - Gained insight into how software is developed.  
  - Learned project management tools.  

