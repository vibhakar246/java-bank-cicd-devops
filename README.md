
# Java Banking Application – CI/CD DevOps Project 🚀

## 📌 Overview
This project is a **menu-driven Java Banking Application** developed using **Java 17 (LTS)** and **Maven**.  
It is designed with **clean architecture**, proper **exception handling**, and structured in a way that makes it **ready for Dockerization and CI/CD automation** using Jenkins.

The goal of this project is to demonstrate **core Java skills** along with **DevOps-oriented application design**.

---

## 🛠 Tech Stack
- **Java 17 (LTS)**
- **Maven**
- **Linux (Ubuntu)**
- **Git & GitHub**
- **Docker** *(CI/CD phase – upcoming)*
- **Jenkins** *(CI/CD phase – upcoming)*

---

## ✨ Features
- Deposit money into an account
- Withdraw money with balance validation
- Check current account balance
- Custom exception handling for invalid operations
- Modular and clean code structure

---

CI/CD Architecture Diagram
flowchart TD
    A[Developer<br/>Local Machine] -->|Git Push| B[GitHub Repository]
    B -->|Webhook Trigger| C[Jenkins CI Server]
    C --> D[Maven Build & Tests]
    D --> E[Docker Image Build]
    E --> F[Docker Compose]
    F --> G[Java Banking Application]


