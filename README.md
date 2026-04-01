# 📘 Address Book App (Spring Boot)

## 🚀 Project Overview

This is a RESTful Address Book application built using Spring Boot.
It allows users to perform CRUD operations (Create, Read, Update, Delete) on address data.

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Maven
* Lombok
* MySQL (optional)
* REST API

---

## 📂 Project Structure

```
src/main/java/com/bridgelabz/addressbookapp
│
├── controller
│     └── AddressBookController.java
│
├── service
│     └── AddressBookService.java
│
├── dto
│     └── AddressBookDTO.java
│
├── model
│     └── AddressBook.java
│
├── exception
│     ├── AddressBookException.java
│     └── GlobalExceptionHandler.java
│
└── AddressBookApplication.java
```

---

## 📌 Features (UC-wise)

### ✅ UC1 - Project Setup

* Created Spring Boot project using Spring Initializer

### ✅ UC2 - REST Controller

* Implemented GET, POST, PUT, DELETE APIs

### ✅ UC3 - DTO & Model

* Introduced DTO and Model classes

### ✅ UC4 - Service Layer

* Moved business logic to service layer
* Used Dependency Injection

### ✅ UC5 - In-Memory Storage

* Stored data using List
* Implemented unique ID generation

### ✅ UC6 - Lombok

* Used Lombok to reduce boilerplate code

### ✅ UC7 - Logging & Profiles

* Added logging using `@Slf4j`
* Configured `dev` and `prod` profiles

### ✅ UC8 - Validation & Exception Handling

* Added validation using `@Valid`, `@NotEmpty`, `@Pattern`
* Implemented global exception handling

---

## 🔗 API Endpoints

| Method | Endpoint                   | Description     |
| ------ | -------------------------- | --------------- |
| GET    | `/addressbook/`            | Get all records |
| GET    | `/addressbook/{id}`        | Get by ID       |
| POST   | `/addressbook/create`      | Create new      |
| PUT    | `/addressbook/update/{id}` | Update          |
| DELETE | `/addressbook/delete/{id}` | Delete          |

---

## 🧪 Sample Request

### 🔹 Create

```
POST /addressbook/create
Content-Type: application/json

{
  "name": "Barnam",
  "city": "Chennai"
}
```

---

## ⚠️ Validation Rules

* Name must start with a capital letter and be at least 3 characters
* City cannot be empty

---

## ⚙️ Application Properties

### application.properties

```
spring.application.name=addressbookapp
spring.profiles.active=dev
```

---

### application-dev.properties

```
server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/addressbook_db_springboo
spring.datasource.username=root
spring.datasource.password=*****

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

logging.level.com.bridgelabz=DEBUG
```

---

### application-prod.properties

```
server.port=8081
spring.jpa.hibernate.ddl-auto=validate
logging.level.root=ERROR
```

---

## ▶️ How to Run

1. Clone repository
2. Open in IntelliJ
3. Run `AddressBookApplication.java`
4. Server starts at:

```
http://localhost:8080
```

---

## 🧠 Key Concepts Used

* REST API Development
* Dependency Injection
* DTO Pattern
* Layered Architecture
* Validation
* Exception Handling
* Logging
* Profiles

---

## 👨‍💻 Author

**Barnam Das**
