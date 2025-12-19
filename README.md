
# Java Banking Application – CI/CD DevOps Project 🚀

## 📌 Overview
This project is a **menu-driven Java Banking Application** developed using **Java 17 (LTS)** and **Maven**.  
It is designed with **clean architecture**, proper **exception handling**, and structured in a way that makes it **ready for Dockerization and CI/CD automation** using Jenkins.

The goal of this project is to demonstrate **core Java skills** along with **DevOps-oriented application design**.
----
## 🔁 CI Pipeline Flow Diagram

```mermaid
flowchart TD
    A[Developer - Local Machine] -->|Git Commit & Push| B[GitHub Repository]
    B --> C[Maven Build on Ubuntu]
    C --> D[Run Unit Tests]
    D --> E[Build Artifact Ready - JAR]
    E --> F[Manual Run or Future Automation]
----
java-bank-cicd-devops
├── src
│   └── main
│       └── java
│           └── com
│               └── nit
│                   └── hk
│                       ├── BankApp.java
│                       ├── Account.java
│                       ├── AccountService.java
│                       ├── BankService.java
│                       └── exceptions
├── pom.xml
├── .gitignore
└── README.md


✅ TECH STACK & FEATURES (THIRD SECTION)


## 🛠 Tech Stack
- Java 17 (LTS)
- Maven
- Git & GitHub
- Linux (Ubuntu)
- Jenkins *(CI/CD – upcoming)*
- Docker *(Containerization – upcoming)*


## ✨ Features
- Deposit money
- Withdraw money
- Check account balance
- Custom exception handling
- Clean, modular architecture

