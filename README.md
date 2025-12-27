Password Strength Analysis – Security Risk Scoring System

📖 Project Overview

This project is a **Java-based Password Strength Checker** integrated with **Data Science and Machine Learning analysis**, following **DevOps best practices**.

The system evaluates password strength using rule-based feature engineering, generates structured security data, performs exploratory data analysis and visualization using Python, and trains a machine learning model to classify password strength.

GitHub version control, branching, and merging are used to manage development workflows.

---

🎯 Objectives

- Build a password strength checker using **Core Java and Maven**
- Evaluate passwords using **feature-based scoring**
- Generate a structured dataset (`CSV`) for analysis
- Perform **data analysis, visualization, and ML modeling** using Python
- Demonstrate **DevOps practices** such as Git branching and merging
- Maintain clean project structure and documentation

---

Technologies Used

Programming & Build
- Java (JDK)
- Maven

Data Science & Machine Learning
- Python
- Pandas
- Matplotlib
- Scikit-learn
- Jupyter Notebook

DevOps & Tools
- Git & GitHub
- Command Line (Windows)
- Git branching & merging

---

📂 Project Structure

```text
password-checker/
│
├── analysis/
│   └── password_analysis.ipynb      # Data analysis, visualization & ML
│
├── screenshots/
│   ├── maven_build.png              # Maven build execution
│   ├── cmd_run.png                  # Java program execution
│   ├── jupyter_dataframe.png        # Dataset preview
│   └── jupyter_graph.png            # Visualization output
│
├── src/
│   └── main/
│       └── java/
│           └── com/example/
│               └── PasswordChecker.java
│
├── password_data.csv                # Generated dataset
├── pom.xml                          # Maven configuration
├── .gitignore                       # DevOps hygiene
└── README.md
```

⚙️ Java Application Logic

The Java application performs the following steps:

1.Accepts password input from the user

2.Extracts password features:

-Length

-Uppercase characters

-Digits

-Special characters

3.Assigns weighted scores to each feature

4.Classifies password strength as:

-Weak

-Medium

-Strong

5.Stores results in a CSV file for analysis

---

🔢 Feature-Based Scoring (Example)

| Feature            | Weight |
| --------------------------- |
| Length             | 30     |
| Uppercase Letters  | 15     |
| Lowercase Letters  | 15     |
| Digits             | 20     |
| Special Characters | 20     |

---

▶️ Command Line Execution

The application is built and executed using Maven and the command line.

---

📊 Dataset Generation

Each execution appends one row to password_data.csv, which is later used for Data Science and Machine Learning analysis.

---

📈 Data Science & Visualization

The generated dataset is analyzed using Pandas and visualized using Matplotlib to understand password strength distribution and feature impact.

---

🤖 Machine Learning Model

-Model Used: Decision Tree Classifier

-Features: Length, uppercase, digit, special character, score

-Target: Password strength category

-Purpose: Predict password strength based on extracted features

This demonstrates how rule-based systems can be extended into predictive models.

---

🔀 DevOps Practices Used

-Git version control

-Separate branch for ML analysis (ml-analysis)

-Merging ML branch into main

-.gitignore to exclude build artifacts and checkpoints

-Clean commit history

---

🎓 Learning Outcomes

-Java + Maven project structuring

-Feature engineering for security analysis

-Dataset creation and preprocessing

-Data visualization and ML modeling

-GitHub branching and merging workflow

-End-to-end integration of DevOps + Data Science

---

🚀 Future Enhancements

-Add OWASP password policy rules

-Improve ML model with larger datasets

-Integrate Jenkins CI pipeline

-Deploy as a REST API

---

👩‍💻 Author

Riddhima Rai
Engineering Student
Domain: Data Science • DevOps • Machine Learning

---

📌 Conclusion

This project demonstrates how a traditional Java application can be enhanced with Data Science and Machine Learning techniques while following modern DevOps practices, making it suitable for academic evaluation and real-world learning.
