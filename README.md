# Online Courier Service API

Welcome to the **Online Courier Service API**! This RESTful API allows you to manage products, orders, delivery details, and hub rates effectively.

## Table of Contents
- [Technologies](#technologies)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
  - [Courier Service](#courier-service)
  - [Delivery Details](#delivery-details)
  - [Hub Rates](#hub-rates)
  - [Orders](#orders)
  - [Products](#products)
- [Sample Requests](#sample-requests)
- [License](#license)

## Technologies
This project is built using the following technologies:
- Spring Boot
- MySQL
- Spring Security
- JWT
- JPA
- Hibernate

## Setup Instructions
1. **Clone the application:**
   ```bash
   git clone https://github.com/yourusername/OnlineCourierService.git
Create a MySQL database:
sql
Copy code
CREATE DATABASE online_courier_service;
Run the SQL script: Execute the SQL script located at src/main/resources/online_courier_service.sql to set up the database structure.
Update database credentials: Open src/main/resources/application.properties and modify the spring.datasource.username and spring.datasource.password properties to match your MySQL installation.
Run the application:
bash
Copy code
mvn spring-boot:run
The app will start running at http://localhost:8080.
API Endpoints
Courier Service
GET /api/courier
Welcome message and available endpoints information.

GET /api/courier/info
Lists all available API endpoints.

GET /api/courier/health
Checks if the API is up and running.

Delivery Details
GET /api/courier/deliverydetails
Retrieves all delivery details.

POST /api/courier/deliverydetails
Adds new delivery details.

DELETE /api/courier/deliverydetails/{trackingId}
Deletes delivery details by tracking ID.

Hub Rates
GET /api/hubrates
Retrieves all hub rates.

GET /api/hubrates/{location}
Retrieves hub rate by location.

POST /api/hubrates
Adds a new hub rate.

Orders
POST /api/courier/orders
Places a new order.

GET /api/courier/orders
Retrieves all orders.

PUT /api/courier/orders/{id}
Updates an existing order.

DELETE /api/courier/orders/{orderId}
Deletes an order by ID.

Products
GET /api/courier/products
Retrieves all products.

POST /api/courier/products
Adds a new product.

PUT /api/courier/products/{productId}
Updates an existing product.

DELETE /api/courier/products/{productId}
Deletes a product by ID.

Sample Requests
Sign Up
json
{
    "firstName": "Max",
    "lastName": "Power",
    "username": "maxpower",
    "password": "supersecurepassword",
    "email": "max.power@powersolutions.com"
}


Log In
json

{
    "usernameOrEmail": "maxpower",
    "password": "supersecurepassword"
}

Create Order
json

{
    "product": "Power Drill 3000",
    "deliveryAddress": "42 Electric Ave, Dynamo City"
}

Add Product
json

{
    "name": "Power Drill 3000",
    "price": 149.99
}

