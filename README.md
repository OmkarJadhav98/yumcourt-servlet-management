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
1.  **Clone the repository**:
    ```bash
    git clone https://github.com/OmkarJadhav98/yumcourt-servlet-management.git
    cd yumcourt-servlet-management 
2.  **Configure the database**:
-    Create a MySQL database named yumcourt_db.
-    Run the provided SQL script to create the necessary tables.
  -    Update the database connection details in `src/main/resources/db.properties`.
 
3.  **Build the project using Maven**:
    ```bash
    mvn clean install
    ```
4. **Deploy the application**:
-    Copy the generated WAR file to the `webapp` directory of your servlet container (e.g., Apache Tomcat).
-    Start your servlet container.

## Configuration
### Database Configuration 
Update the following properties in `src/main/resources/db.properties`:
```properties
    db.url=jdbc:mysql://localhost:3306/yumcourt_db
    db.username=root
    db.password=spartans@9922
```

### Servlet Configuration
Ensure that the `web.xml` file is properly configured to map servlets and configure their initialization parameters.

## Running the Application
Once the project is built and deployed:
1.  Open a web browser and navigate to `http://localhost:8080/yumcourt-servlet-management`.
2.  Use the available forms to manage customers, restaurants, menus, orders, and more.

## Usage
### Accessing the Application
-   Address Management: Navigate to /address_form.html to manage addresses.
-   Customer Management: Navigate to /customer_form.html to manage customers.
-   Restaurant Management: Navigate to /restaurant_form.html to manage restaurants.
-   Order Management: Navigate to /order_form.html to manage orders.
-   Delivery Management: Navigate to /delivery_executive_form.html to manage delivery executives.

### Adding a New Customer
1.  Open `order_form.html`.
2.  Select the customer, restaurant, and menu items.
3.  Assign a delivery executive.
4.  Click "Place Order" to submit.