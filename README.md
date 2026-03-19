# Library Management System

## Project Overview

This project is a desktop-based **Library Management System (LMS)** developed as a final year university project. The application is designed to support the day-to-day operations of a library by digitizing core administrative tasks such as member registration, book catalog management, book issuing and returning, overdue tracking, and report generation.

The system is implemented as a **Java Swing** application using **NetBeans**, with **MySQL** as the backend database. It provides a user-friendly graphical interface for librarians and other authorized users to manage library records efficiently and accurately.

## Project Objectives

The main objective of this project is to develop a reliable and practical software solution that improves the efficiency of manual library operations. The system aims to:

- maintain accurate records of books and members
- simplify the issue and return process
- identify overdue and removed books
- support librarian authentication and account management
- provide reporting and database backup/restore support

## Key Features

- Librarian sign in and sign up interfaces
- Member registration, update, removal, and management
- Book registration, update, removal, and management
- Book issue and return handling
- View issued book records
- Defaulter list and due payment tracking
- Removed or damaged book monitoring
- Database backup and restore functionality
- JasperReports-based reporting support
- Desktop GUI built with Java Swing forms

## Technology Stack

- **Programming Language:** Java
- **GUI Framework:** Java Swing
- **IDE:** NetBeans
- **Database:** MySQL
- **Build Tool:** Apache Ant
- **UI Theme:** FlatLaf
- **Reporting:** JasperReports
- **Database Driver:** MySQL Connector/J

## Project Structure

```text
LMS/
├── src/
│   ├── gui/          # Swing user interfaces and application screens
│   ├── model/        # Database connectivity and backend support
│   ├── reports/      # JasperReports templates
│   └── resources/    # Icons, images, and static assets
├── nbproject/        # NetBeans project configuration
├── lib/              # External library dependencies
├── build.xml         # Ant build configuration
└── README.md
```

## Main Functional Modules

### 1. User Authentication

The system includes login and registration interfaces for librarians. Only authenticated users can access the main dashboard and system operations.

### 2. Member Management

This module allows the librarian to register new members, update existing member details, and remove members when necessary.

### 3. Book Management

The book management module supports adding new books, updating book details, searching records, and maintaining the availability of the collection.

### 4. Issue and Return Management

Users can issue books to registered members and process returns while maintaining issue dates and due dates.

### 5. Monitoring and Reports

The system provides views for issued books, defaulter lists, removed or damaged books, and printable reports for administrative use.

### 6. Database Management

Backup and restore features are included to help protect library data and support recovery when required.

## Prerequisites

Before running the project, make sure the following are installed:

- JDK 11 or later
- NetBeans IDE
- MySQL Server

## Setup Instructions

### 1. Clone or Download the Project

Place the project inside your local development workspace and open it with NetBeans.

### 2. Configure the Database

The application connects to a MySQL database named `libms`.

Update the database connection settings in [src/model/MySQL.java](/Users/kavishkasinhabahu/NetBeansProjects/LMS/src/model/MySQL.java) if your local MySQL username, password, or database name is different.

Current connection settings in the source file:

- database: `libms`
- host: `localhost`
- port: `3306`

### 3. Add the Required Libraries

This project already references the required `.jar` files through the NetBeans project configuration. Ensure the `lib/` directory is present and not missing any dependencies.

### 4. Open and Run the Project

Open the project in NetBeans and run the main class:

- [src/gui/StartPage.java](/Users/kavishkasinhabahu/NetBeansProjects/LMS/src/gui/StartPage.java)

The configured startup class in the NetBeans project is `gui.StartPage`.

## Build and Run

### Using NetBeans

1. Open the project in NetBeans.
2. Clean and build the project.
3. Run the project normally from the IDE.

### Using Ant

```bash
ant clean
ant run
```

## Academic Value of the Project

This project demonstrates practical knowledge in:

- object-oriented programming using Java
- event-driven desktop application development
- relational database integration with JDBC
- software interface design using Java Swing
- report generation for real-world business processes
- applying software engineering concepts to a university-level system

## Limitations

- The application currently depends on a local MySQL setup.
- Database credentials are defined directly in source code, which should be improved for production use.
- No automated test suite is currently included in the project.
- The project is designed as a desktop application and does not include web or mobile access.

## Future Improvements

- move database configuration to an external properties file
- add role-based access control
- introduce password hashing and stronger security practices
- add automated testing for core modules
- create a web-based or cloud-enabled version of the system
- include analytics dashboards for library usage trends

## Conclusion

The **Library Management System** is a practical academic software project developed to solve common library administration problems through automation. It provides a structured, user-friendly, and scalable foundation for managing books, members, and transactions in a library environment. As a final year university project, it reflects both technical implementation skills and an understanding of real-world information system requirements.
