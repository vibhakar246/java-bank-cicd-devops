
# Java Banking Application – CI/CD DevOps Project 🚀
```md
## 📌 Overview
This project is a **menu-driven Java Banking Application** developed using **Java 17 (LTS)** and **Maven**.  
It is designed with **clean architecture**, proper **exception handling**, and is structured in a way that makes it **ready for Dockerization and CI/CD automation** using Jenkins.


```mermaid
flowchart TD

    %% =============================
    %% DEVELOPER
    %% =============================
    subgraph Developer
        A[Developer - Local Machine]
    end

    %% =============================
    %% CI/CD PIPELINE
    %% =============================
    subgraph CI_CD_Pipeline
        B[GitHub Repository]
        C[Maven Build]
        D[Run Unit Tests]
        E[Build Artifact - JAR]
    end

    %% =============================
    %% APPLICATION CORE
    %% =============================
    subgraph Banking_Application
        F[BankApp.java]
        G[Account.java]
        H[AccountService.java]
        I[BankService.java]
        J[Custom Exceptions]
    end

    %% =============================
    %% TECH STACK
    %% =============================
    subgraph Tech_Stack
        K[Java 17 LTS]
        L[Maven]
        M[Linux Ubuntu]
        N[Jenkins - Upcoming]
        O[Docker - Upcoming]
    end

    %% =============================
    %% FEATURES
    %% =============================
    subgraph Application_Features
        P[Deposit Money]
        Q[Withdraw Money]
        R[Check Balance]
        S[Exception Handling]
        T[Modular Architecture]
    end

    %% =============================
    %% MAIN FLOW (TOP TO BOTTOM)
    %% =============================
    A -->|Git Push| B
    B --> C
    C --> D
    D --> E
    E --> F

    %% Core Internal Flow
    F --> G
    F --> H
    F --> I
    I --> J

    %% Stack Supporting App
    K --> F
    L --> C
    M --> C
    N --> B
    O --> E

    %% Features from Core
    F --> P
    F --> Q
    F --> R
    F --> S
    F --> T
```
