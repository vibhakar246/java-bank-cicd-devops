📌 Overview
This project is a menu-driven Java Banking Application developed using Java 17 (LTS) and Maven.
It is designed with clean architecture, proper exception handling, and is structured in a way that makes it ready for Dockerization and CI/CD automation using Jenkins.
graph TB
    %% Developer Section
    subgraph "Developer Environment"
        Dev[👨‍💻 Developer<br/>Local Machine]
        IDE[💻 IDE / VS Code]
        Git[📦 Git Push]
    end
    
    %% Source Control
    subgraph "Source Control"
        GitHub[🐙 GitHub Repository]
        Webhook[🔄 Webhook Trigger]
    end
    
    %% CI/CD Pipeline
    subgraph "CI/CD Pipeline - Jenkins"
        Jenkins[🤖 Jenkins Server]
        Build[🔨 Maven Build]
        Test[✅ Run Unit Tests]
        Package[📦 Package JAR]
        DockerBuild[🐳 Docker Build]
        Push[📤 Push to Registry]
        Deploy[🚀 Deploy to Server]
    end
    
    %% Application Core
    subgraph "Banking Application Core"
        BankApp[🏦 BankApp.java<br/>Main Class]
        Account[💳 Account.java<br/>Account Model]
        Service[⚙️ AccountService.java<br/>Business Logic]
        BankService[🏛️ BankService.java<br/>Bank Operations]
        Exceptions[⚠️ Custom Exceptions<br/>InsufficientBalance<br/>InvalidAmount<br/>AccountNotFound]
    end
    
    %% Application Features
    subgraph "Application Features"
        Deposit[💰 Deposit Money]
        Withdraw[💸 Withdraw Money]
        Balance[📊 Check Balance]
        Create[➕ Create Account]
        Delete[❌ Delete Account]
        List[📋 List All Accounts]
    end
    
    %% Tech Stack
    subgraph "Technology Stack"
        Java[☕ Java 17 LTS]
        Maven[📁 Maven]
        JUnit[🧪 JUnit 5]
        Linux[🐧 Linux/Ubuntu]
        Docker[🐳 Docker]
        Jenkins[⚙️ Jenkins]
    end
    
    %% DevOps Tools
    subgraph "DevOps Infrastructure"
        DockerHub[☁️ Docker Hub]
        Server[🌐 Production Server]
        Monitor[📊 Monitoring]
    end
    
    %% Connections
    Dev --> IDE
    IDE --> Git
    Git --> GitHub
    GitHub --> Webhook
    Webhook --> Jenkins
    
    Jenkins --> Build
    Build --> Test
    Test --> Package
    Package --> DockerBuild
    DockerBuild --> Push
    Push --> Deploy
    
    Push --> DockerHub
    Deploy --> Server
    Server --> Monitor
    
    %% Application Structure
    BankApp --> Account
    BankApp --> Service
    Service --> BankService
    Service --> Exceptions
    
    %% Features Connection
    BankApp --> Deposit
    BankApp --> Withdraw
    BankApp --> Balance
    BankApp --> Create
    BankApp --> Delete
    BankApp --> List
    
    %% Tech Stack Support
    Java --> BankApp
    Maven --> Build
    JUnit --> Test
    Linux --> Server
    Docker --> DockerBuild
    Jenkins --> Jenkins

flowchart TD
    subgraph "Banking Operations"
        Start[🏁 Launch Application] --> Menu[📱 Display Main Menu]
        Menu --> Choice{User Choice}
        
        Choice -->|1| Create[➕ Create Account]
        Choice -->|2| Dep[💰 Deposit Money]
        Choice -->|3| With[💸 Withdraw Money]
        Choice -->|4| Bal[📊 Check Balance]
        Choice -->|5| List[📋 List All Accounts]
        Choice -->|6| Del[❌ Delete Account]
        Choice -->|7| Exit[👋 Exit Application]
        
        Create --> Menu
        Dep --> Menu
        With --> Menu
        Bal --> Menu
        List --> Menu
        Del --> Menu
        Exit --> End[✅ Application Closed]
    end
    
    subgraph "Exception Handling"
        Error[⚠️ Error Occurs] --> Handle{Catch Block}
        Handle -->|Invalid Amount| IA[❌ InvalidAmountException]
        Handle -->|Insufficient Balance| IB[❌ InsufficientBalanceException]
        Handle -->|Account Not Found| ANF[❌ AccountNotFoundException]
        IA --> Message[📢 Show Error Message]
        IB --> Message
        ANF --> Message
        Message --> Menu
    end

graph LR
    subgraph "Stage 1: Source"
        A[📝 Code Commit] --> B[🌿 GitHub Push]
    end
    
    subgraph "Stage 2: Build"
        B --> C[🔨 Maven Compile]
        C --> D[📦 Package JAR]
    end
    
    subgraph "Stage 3: Test"
        D --> E[🧪 Run Unit Tests]
        E --> F{Tests Passed?}
        F -->|No| G[❌ Send Alert]
        G --> A
    end
    
    subgraph "Stage 4: Package"
        F -->|Yes| H[🐳 Build Docker Image]
        H --> I[📤 Push to Docker Hub]
    end
    
    subgraph "Stage 5: Deploy"
        I --> J[🚀 Deploy to Server]
        J --> K[✅ Health Check]
    end

graph TD
    subgraph "Unit Test Suite"
        T1[✅ testDeposit_ValidAmount] --> R[📊 Test Results]
        T2[✅ testDeposit_InvalidAmount] --> R
        T3[✅ testWithdraw_ValidAmount] --> R
        T4[✅ testWithdraw_InsufficientBalance] --> R
        T5[✅ testCreateAccount_Valid] --> R
        T6[✅ testFindAccount_Exists] --> R
        T7[✅ testFindAccount_NotFound] --> R
    end
    
    R --> Summary[📈 Coverage: 92%<br/>Tests: 24/24 Passed]
    
   flowchart LR
    subgraph "Version 2.0 Roadmap"
        V1[📱 REST API Layer] --> V2[💾 Database Integration]
        V2 --> V3[🔐 Spring Security]
        V3 --> V4[☁️ Cloud Deployment]
        V4 --> V5[📊 Monitoring & Logging]
    end
=== Banking Application Menu ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. List All Accounts
6. Delete Account
7. Exit

Enter your choice: 1

=== Create Account ===
Enter Account Number: ACC001
Enter Account Holder Name: John Doe
Enter Initial Deposit: 5000

✅ Account created successfully!

=== Banking Application Menu ===
Enter your choice: 4

=== Check Balance ===
Enter Account Number: ACC001
Current Balance: ₹5000
    
    
