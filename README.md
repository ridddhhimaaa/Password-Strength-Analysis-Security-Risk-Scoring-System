Password Strength Checker using Java, Maven, and Git (DevOps Oriented)



Project Overview  

This project demonstrates the development of a simple Password Strength Checker application using Java and Maven, implemented following DevOps principles.  

The project focuses not only on application logic but also on version control practices, build automation, and collaborative development using Git and GitHub.



The application evaluates a user-entered password based on standard security rules and classifies it as Weak, Medium, or Strong.



This project is designed to align with the DevOps syllabus by showcasing Git workflows, branching and merging strategies, and Maven build lifecycle concepts.



---



Objectives  

\- Develop a Java-based password strength validation tool  

\- Apply DevOps concepts such as version control and feature-based development  

\- Demonstrate Git branching and merging workflows  

\- Use Maven for project structure and build automation  

\- Maintain a clean and professional GitHub repository  



---



Problem Statement  

Weak passwords are a major cause of security vulnerabilities in software systems.  

Many users create passwords that lack sufficient length and character diversity, making them susceptible to attacks.



This project addresses the problem by providing a command-line utility that evaluates password strength and encourages secure password practices while following DevOps development workflows.



---



Features  

\- Accepts password input from the user via command line  

\- Evaluates password based on:

&nbsp; - Minimum length

&nbsp; - Uppercase letters

&nbsp; - Lowercase letters

&nbsp; - Digits

&nbsp; - Special characters  

\- Displays detailed password analysis  

\- Classifies password strength as Weak, Medium, or Strong  

\- Implements feature-based Git branching  

\- Uses Maven for build and packaging  



---



Technologies and Tools Used  

\- Java (Core Java)  

\- Apache Maven  

\- Git and GitHub  

\- Command Line Interface (CLI)  



---



DevOps Workflow Followed  



The project follows a simplified DevOps workflow:



1\. Code development using Java  

2\. Version control using Git  

3\. Feature-based branching strategy  

4\. Merging feature branches into main branch  

5\. Build automation using Maven  

6\. Continuous integration concept demonstrated through repeated builds  



---



Git Branching Strategy  



The repository uses multiple branches to demonstrate Advanced Git concepts:



\- main  

&nbsp; Stable branch containing production-ready code  



\- feature/password-strength-logic  

&nbsp; Contains the implementation of password validation logic  



\- feature/devops-readme  

&nbsp; Used for documentation and DevOps-related updates  



This approach reflects real-world DevOps and software development practices.



---



Project Structure  

password-checker

├── pom.xml

├── README.md

├── src

│ └── main

│ └── java

│ └── com

│ └── example

│ └── PasswordChecker.java





How to Build and Run the Project  



Step 1: Build the project using Maven  

-> mvn clean package



Step 2: Run the application  

-> java -cp target/password-checker-1.0.0.jar com.example.PasswordChecker





---



Sample Output  

Enter your password: Hello@123



Password Analysis:

Length >= 8: true

Uppercase Letter: true

Lowercase Letter: true

Digit: true

Special Character: true



Password Strength:

STRONG





---



Learning Outcomes  

\- Understanding of DevOps concepts and workflows  

\- Hands-on experience with Git branching and merging  

\- Practical use of Maven build lifecycle  

\- Improved knowledge of password security principles  

\- Experience maintaining a structured GitHub repository  



---



Future Enhancements  

\- Add unit testing using JUnit  

\- Integrate CI tools such as Jenkins  

\- Containerize the application using Docker  

\- Improve password rules using OWASP guidelines  



---



Project Repository  

The complete source code and development history of this project is available on GitHub:  

https://github.com/ridddhhimaaa/Password-strength-checker-java











