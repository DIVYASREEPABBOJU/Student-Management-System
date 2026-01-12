# Student Management System

A Java-based web application for managing student records with role-based access control.  
Built using Java Servlets, JSP, JDBC, and MySQL, and deployed on Apache Tomcat.

---

## 📌 Project Overview

The **Student Management System** is a web application that allows administrators to manage student details through a secure authentication system.  
The application supports full CRUD operations and uses session-based access control to restrict functionalities based on user roles.

---

## 🚀 Features

- User Registration, Login & Logout
- Role-based access (Admin & User)
- Admin Dashboard
- Add Student
- Edit & Update Student
- Delete Student
- Session management using HttpSession
- Clean and centered UI using HTML & CSS

---

## 🎥 Application Demo Video

A complete walkthrough of the application demonstrating:
- Signup & Login
- Admin Dashboard
- Add, Edit, Update, and Delete Student
- Logout functionality


## 🛠️ Technologies Used

- **Frontend:** HTML, CSS, JSP  
- **Backend:** Java Servlets, JDBC  
- **Database:** MySQL (XAMPP)  
- **Server:** Apache Tomcat 8.5  
- **IDE:** Eclipse  

---

upload demo video for the application

https://github.com/user-attachments/assets/71ad99e3-8fec-40fd-acc2-bcb080169ad3

---

## 🧩 Database Design

### Users Table
| Column | Description |
|------|------------|
| user_id | Primary Key |
| fname | First Name |
| lname | Last Name |
| email | User Email |
| password | Password |
| role | User Role (admin/user) |

### Students Table
| Column | Description |
|--------|-------------|
| student_id | Primary Key |
| name | Student Name |
| email | Student Email |
| course | Course |
| year | Academic Year |

---

## 🔐 Security & Session Handling

- Authentication handled using Login Servlet
- Role-based authorization using HttpSession
- Unauthorized access redirects users to the login page

---

## ▶️ How to Run the Project

1. Install **XAMPP** and start Apache & MySQL
2. Create the database and required tables in MySQL
3. Import the project into **Eclipse**
4. Configure **Apache Tomcat 8.5**
5. Run the project on the server
6. Open browser and visit:


http://localhost:8080/StudentWebApp


