🏡 Airbnb Clone – Full Stack Booking Backend

A production-ready Airbnb Clone Backend built using Java 25 and Spring Boot 4.0.0, designed to handle real-world hotel booking workflows with secure authentication, Stripe payments, dynamic pricing strategies, inventory management, and advanced hotel search capabilities.

Deployed on AWS and built with scalability, performance, and clean architecture in mind.

🔗 Postman API Documentation:
https://documenter.getpostman.com/view/48807283/2sBXcAJNtT

🚀 Tech Stack

Language: Java 25

Framework: Spring Boot 4.0.0

Database: PostgreSQL

ORM: Hibernate + Advanced JPQL

Authentication: JWT (Stateless)

OAuth: Google OAuth2 Integration

Payment Gateway: Stripe

Deployment: AWS

API Testing: Postman

🏗 Architecture

Monolithic Architecture

Layered Structure:

Controller Layer

Service Layer

Repository Layer

Stateless JWT Security

Clean separation of concerns

Production-grade error handling & validation

🔐 Authentication & Authorization

User Signup & Login

JWT-based Stateless Authentication

Refresh Token Mechanism

Role-Based Access Control

Google OAuth2 Integration

Secure Password Encryption

🏨 Hotel & Booking Features

Create & Manage Hotel Listings

Image Upload for Hotels

Room & Inventory Management

Availability Calendar

Advanced Hotel Search with Filters:

Location

Date Range

Price Range

Amenities

Room Type

Sorting by price, rating & availability

Double Booking Prevention Logic

Smart Room Allocation System

💳 Payment Integration (Stripe)

Payment Initialization

Payment Capture

Booking Confirmation After Payment

Secure Transaction Handling

Booking Cancellation with Refund Support

📈 Advanced Features

Dynamic Pricing Strategy

Surge pricing

Occupancy-based pricing

Seasonal adjustments

Optimized JPQL Queries

Database Indexing for Fast Search

Secure Environment Configuration

Production-Ready Deployment Setup

🗄 Database Entities

Users

Hotels

Rooms

Bookings

Payments

Refresh Tokens

Pricing Configuration

☁ Deployment

The application is deployed on AWS with:

Managed PostgreSQL database

Secure environment variables

Production configuration setup

⚙️ Running Locally
1️⃣ Clone Repository
git clone <your-repository-url>
cd airbnb-clone

2️⃣ Configure Environment Variables
SPRING_DATASOURCE_URL=
SPRING_DATASOURCE_USERNAME=
SPRING_DATASOURCE_PASSWORD=
JWT_SECRET=
STRIPE_SECRET_KEY=
GOOGLE_CLIENT_ID=
GOOGLE_CLIENT_SECRET=

3️⃣ Run Application
mvn spring-boot:run

📌 API Documentation

Complete API documentation with request/response examples:

👉 https://documenter.getpostman.com/view/48807283/2sBXcAJNtT

🎯 Project Goals

Build a real-world scalable booking backend

Implement secure JWT & OAuth authentication

Integrate real payment gateway (Stripe)

Handle concurrency & prevent double booking

Implement dynamic pricing algorithms

Deploy on cloud infrastructure

📜 License

This project is licensed under the MIT License.
