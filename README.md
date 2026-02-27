
# Java Banking Application – CI/CD DevOps Project 🚀
```md
## 📌 Overview
This project is a **menu-driven Java Banking Application** developed using **Java 17 (LTS)** and **Maven**.  
It is designed with **clean architecture**, proper **exception handling**, and is structured in a way that makes it **ready for Dockerization and CI/CD automation** using Jenkins.

## 🏦 Java Banking Application – Complete DevOps Overview

```mermaid
flowchart TD

    %% =========================
    %% CI/CD PIPELINE
    %% =========================
    subgraph CI_CD_Pipeline
        A[Developer - Local Machine]
        B[GitHub Repository]
        C[Maven Build - Ubuntu]
        D[Run Unit Tests]
        E[Build Artifact - JAR]
        F[Manual Run / Future Automation]

        A -->|Git Push| B
        B --> C
        C --> D
        D --> E
        E --> F
    end

    %% =========================
    %% APPLICATION STRUCTURE
    %% =========================
    subgraph Application_Core
        G[BankApp.java]
        H[Account.java]
        I[AccountService.java]
        J[BankService.java]
        K[Custom Exceptions]

        G --> H
        G --> I
        G --> J
        J --> K
    end

    %% =========================
    %% TECH STACK
    %% =========================
    subgraph Tech_Stack
        L[Java 17 LTS]
        M[Maven]
        N[Linux Ubuntu]
        O[Jenkins - Upcoming]
        P[Docker - Upcoming]
    end

    %% =========================
    %% FEATURES
    %% =========================
    subgraph Application_Features
        Q[Deposit Money]
        R[Withdraw Money]
        S[Check Balance]
        T[Exception Handling]
        U[Modular Architecture]
    end

    %% Linking Stack to Core
    L --> G
    M --> C
    N --> C
    O --> B
    P --> E

    %% Linking Features to Core
    G --> Q
    G --> R
    G --> S
    G --> T
    G --> U
```
