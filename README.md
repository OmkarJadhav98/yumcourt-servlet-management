# YumCourt Servlet Management

**YumCourt-Servlet-Management** is a Java-based web application that manages an online food ordering system. This project uses Java Servlets, JSP, and JDBC for backend processing, along with HTML and CSS for the frontend interface.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
The **YumCourt-Servlet-Management** project is designed to facilitate an online food ordering system where customers can browse restaurant menus, place orders, and have their food delivered by delivery executives. The system supports CRUD operations for managing customers, restaurants, menus, orders, addresses, and more.

## Features
-   Address Management: Manage customer delivery addresses  
-   Customer Management: Add, update, and delete customer details.
-   Restaurant Management: Manage restaurant information and menus.
-   Order Management: Place, update, and cancel orders.
-   Delivery Management: Assign and track delivery executives for orders.

## Technologies Used
-   Java: Core programming language.
-   Servlets & JSP: Used for handling HTTP requests and responses.
-   JDBC: For database connectivity and operations.
-   HTML/CSS: Frontend design and layout.
-   Maven: Build automation tool.
-   Git: Version control system.
-   IntelliJ IDEA: Preferred IDE for development.
-   MySQL: Database for storing application data.

## Installation
### Prerequisites
-   Java 8 or higher
-   Maven 3.6.0 or higher
-   MySQL 5.7 or higher
-   IntelliJ IDEA (optional, but recommended)

### Steps
1.  Clone the repository:
    ```bash
    git clone https://github.com/OmkarJadhav98/yumcourt-servlet-management.git
    cd yumcourt-servlet-management 
2.  Configure the database:
-    Create a MySQL database named yumcourt_db.
-    Run the provided SQL script to create the necessary tables.
-    Update the database connection details in `src/main/resources/db.properties`.

