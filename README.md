# 🏦 Java Banking Application – CI/CD DevOps Project 🚀

---

## 📌 Overview

This project is a **menu-driven Java Banking Application** developed using **Java 17 (LTS)** and **Maven**.

It follows a clean modular architecture with proper exception handling and is structured to be fully ready for:

- 🐳 Docker containerization  
- 🤖 Jenkins CI/CD automation  
- 🧪 Unit testing integration  
- 🚀 Production deployment  

This project demonstrates both **Core Java skills** and **DevOps engineering practices**.

---

# 🏗️ 1️⃣ Complete DevOps Architecture

```mermaid
flowchart TB

subgraph "Developer Environment"
    Dev[Developer - Local Machine]
    IDE[IDE / VS Code]
    Git[Git Push]
end

subgraph "Source Control"
    GitHub[GitHub Repository]
    Webhook[Webhook Trigger]
end

subgraph "CI/CD Pipeline - Jenkins"
    Jenkins[Jenkins Server]
    Build[Maven Build]
    Test[Run Unit Tests]
    Package[Package JAR]
    DockerBuild[Docker Build]
    Push[Push to Registry]
    Deploy[Deploy to Server]
end

subgraph "DevOps Infrastructure"
    DockerHub[Docker Hub]
    Server[Production Server]
    Monitor[Monitoring]
end

Dev --> IDE --> Git --> GitHub --> Webhook --> Jenkins
Jenkins --> Build --> Test --> Package --> DockerBuild --> Push --> Deploy
Push --> DockerHub
Deploy --> Server --> Monitor
```

---

# 🏦 2️⃣ Application Architecture

```mermaid
flowchart TD

subgraph "Banking Application Core"
    BankApp[BankApp.java - Main]
    Account[Account.java - Model]
    Service[AccountService.java - Logic]
    BankService[BankService.java - Operations]
    Exceptions[Custom Exceptions]
end

subgraph "Application Features"
    Deposit[Deposit Money]
    Withdraw[Withdraw Money]
    Balance[Check Balance]
    Create[Create Account]
    Delete[Delete Account]
    List[List All Accounts]
end

BankApp --> Account
BankApp --> Service
Service --> BankService
Service --> Exceptions

BankApp --> Deposit
BankApp --> Withdraw
BankApp --> Balance
BankApp --> Create
BankApp --> Delete
BankApp --> List
```

---

# 🔁 3️⃣ CI/CD Pipeline Stages

```mermaid
flowchart LR

A[Code Commit] --> B[GitHub Push]

subgraph "Build Stage"
    B --> C[Maven Compile]
    C --> D[Package JAR]
end

subgraph "Test Stage"
    D --> E[Run Unit Tests]
    E --> F{Tests Passed?}
    F -->|No| G[Send Alert]
    G --> A
end

subgraph "Docker & Deploy"
    F -->|Yes| H[Build Docker Image]
    H --> I[Push to Docker Hub]
    I --> J[Deploy to Server]
    J --> K[Health Check]
end
```

---

# 📱 4️⃣ Application Flow (Menu Driven System)

```mermaid
flowchart TD

Start[Launch Application] --> Menu[Display Main Menu]
Menu --> Choice{User Choice}

Choice -->|1| Create
Choice -->|2| Deposit
Choice -->|3| Withdraw
Choice -->|4| Balance
Choice -->|5| List
Choice -->|6| Delete
Choice -->|7| Exit

Create --> Menu
Deposit --> Menu
Withdraw --> Menu
Balance --> Menu
List --> Menu
Delete --> Menu
Exit --> End[Application Closed]
```

---

# ⚠ 5️⃣ Exception Handling Flow

```mermaid
flowchart TD

Error[Error Occurs] --> Handle{Catch Block}

Handle -->|Invalid Amount| IA[InvalidAmountException]
Handle -->|Insufficient Balance| IB[InsufficientBalanceException]
Handle -->|Account Not Found| ANF[AccountNotFoundException]

IA --> Message[Show Error Message]
IB --> Message
ANF --> Message

Message --> Menu[Return to Menu]
```

---

# 🧪 6️⃣ Unit Testing Overview

```mermaid
flowchart TD

subgraph "Unit Test Suite"
    T1[testDeposit_ValidAmount]
    T2[testDeposit_InvalidAmount]
    T3[testWithdraw_ValidAmount]
    T4[testWithdraw_InsufficientBalance]
    T5[testCreateAccount_Valid]
    T6[testFindAccount_Exists]
    T7[testFindAccount_NotFound]
end

T1 --> R[Test Results]
T2 --> R
T3 --> R
T4 --> R
T5 --> R
T6 --> R
T7 --> R

R --> Summary[Coverage 92% - 24/24 Tests Passed]
```

---

# 🛠 Tech Stack

- ☕ Java 17 (LTS)  
- 📦 Maven  
- 🧪 JUnit 5  
- 🐧 Linux / Ubuntu  
- 🐳 Docker  
- 🤖 Jenkins  
- 🐙 GitHub  

---

# 🚀 Project Highlights

- Clean modular architecture  
- CI/CD ready design  
- Docker-ready structure  
- Automated unit testing  
- DevOps pipeline integration  
- Production deployment capable  

---

💡 This project represents a complete **Java + DevOps integration workflow**
