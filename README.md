# 📚 Library Management System

A Java Swing desktop application for managing a small library: books, members, borrowing and returns. Built with NetBeans and MySQL as an Object-Oriented Programming university project (2024).

## Features

- Login screen for the librarian
- **Books**: add, update, delete and search books
- **Members**: register and manage library members
- **Borrowing**: issue one or more books to a member with a due date (date picker via JCalendar)
- **Returns**: return books and track late returns / penalty payments

## Architecture

The code follows an MVC-style structure:

```
src/
├── View/                     # Swing JFrames (Login, Home, Book, Member, Borrow, Return)
├── controller/               # Business logic for books, members, borrowing and returns
├── model/                    # Data models (Book, Member, Borrower, BorrowBooks)
│   └── db/                   # MySQL connection + shared DB helpers
└── librarymanagementsystem/  # Application entry point
```

## Database

MySQL database `library` with tables `book`, `member`, `borrow`, `borrow_book`, `panelty_payment` and `user`.
A schema with sample data is in [`DatabaseBackup/library_management_system_database_backup.sql`](DatabaseBackup/library_management_system_database_backup.sql).

## Run locally

1. Install **JDK 8+**, **MySQL** and **NetBeans**.
2. Create the database and import the backup:
   ```bash
   mysql -u root -p -e "CREATE DATABASE library"
   mysql -u root -p library < DatabaseBackup/library_management_system_database_backup.sql
   ```
3. Check the connection details in `src/model/db/DBconnect.java` (default: `root`, no password, `localhost:3306`).
4. Add the MySQL Connector/J JAR and `libs/jcalendar-1.4.jar` to the project libraries.
5. Open the project in NetBeans and run it.

Sample login: `admin` / `admin`

## Tech

Java · Swing · MySQL · JDBC · JCalendar · NetBeans
