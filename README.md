# Ticket Booking System - LLD Basics - Core Java Implementation

This project is a **Low-Level Design (LLD)** implementation of a **Ticket Booking System Entities and Services** using **Core Java**. The system simulates a train ticket booking application and utilizes various **Java 8 features** such as **Streams**, **Lambda functions**, **Maps**, etc. The backend uses a simple **JSON file-based offline database** (similar to MongoDB) to store user and ticket data.

## Features

The system provides the following features:

1. **Sign Up** - User can create an account by providing a name and password.
2. **Login** - Existing users can log in using their credentials.
3. **Fetch Bookings** - Users can view their existing bookings.
4. **Search Trains** - Users can search for trains based on source and destination.
5. **Book a Seat** - Users can book a seat on an available train.
6. **Cancel Booking** - Users can cancel their existing booking.
7. **Exit** - Exit the application.

## Technologies Used

- **Core Java** (Java 8)
  - Streams
  - Lambda Functions
  - Maps
  - Collections (Lists, Sets, Maps, etc.)
- **JSON** for Offline Database (stored in `.json` files)
- **Jackson & TypeReference** for JSON parsing and to map json data with entities and object serialization/deserialization

## Setup and Installation

### 1. Clone the repository:

```bash
git clone https://github.com/Jainish-Prajapati/IRCTC-Ticket-Booking-System-LLD-Basics-Java-8.git
```

### 2. Build the project:
```bash
gradle build
```

### 3. Run the project:
```bash
gradle run
```

## Collaboration

If you are willing to help, learn more in-depth about Java topics and this project, I encourage you to consider collaborating with me on this project. Feel free to reach out if you're interested in contributing, learning, or exploring more about Core Java, Low-Level Design (LLD), and backend technologies.