<div align="center">

# 🎓 Student Information System

**Software Design and Architecture (SDA) - Assignment 1**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![OOP](https://img.shields.io/badge/Architecture-OOP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-v1.0_Active-brightgreen?style=for-the-badge)

</div>

---

## 📝 About the Project

This project is designed to model a university's **Student Information System (SIS)**. It is developed in accordance with the provided database schema (ER Diagram) and follows **Object-Oriented Programming (OOP)** principles throughout the system.

> 💡 **Version Note:** This repository will be continuously updated throughout the semester with new assignments and features provided by our instructor, such as database integration and additional system functionality. The current version contains the project's basic infrastructure.

---

## 🌟 Features (Version 1.0)

The current version contains the core structure of the project:

* 🧱 **Full OOP Architecture:** All classes are implemented using private fields, getter/setter methods, and constructors in accordance with the requirements.
* 🔗 **Foreign Key Simulation:** Java's built-in `java.util.UUID` class is used to simulate foreign key relationships and provide realistic ID management between entities.
* 📜 **Separated Enum Structures:** Enums such as `Gender`, `CourseType`, and `StudentStatus` are defined as separate classes to ensure data consistency and type safety.
* 💻 **Interactive CLI Menu:** A user-friendly, switch-case-based terminal interface is provided for basic system operations.
* 👥 **Student Registration Simulation:** Students can be dynamically added to the system using an `ArrayList`, and registered students can be displayed in a clean, readable format.

---

## 📂 Project Structure

The project contains the following main entities and structures:

```text
📦 src
 ┣ 🏛️ Entity Classes
 ┃ ┣ 📄 AcademicTerm.java
 ┃ ┣ 📄 Course.java
 ┃ ┣ 📄 CoursePrerequisite.java
 ┃ ┣ 📄 Department.java
 ┃ ┣ 📄 Faculty.java
 ┃ ┣ 📄 Instructor.java
 ┃ ┣ 📄 Program.java
 ┃ ┣ 📄 ProgramCourse.java
 ┃ ┗ 📄 Student.java
 ┃
 ┣ 🏷️ Enums
 ┃ ┣ 📄 CourseType.java
 ┃ ┣ 📄 DegreeLevel.java
 ┃ ┣ 📄 Gender.java
 ┃ ┣ 📄 InstructorTitle.java
 ┃ ┣ 📄 PrerequisiteType.java
 ┃ ┣ 📄 Semester.java
 ┃ ┗ 📄 StudentStatus.java
 ┃
 ┗ 🚀 Entry Point
   ┗ 📄 Main.java
```

---

## 🚀 Installation & Usage

If you want to compile and run the project directly from your terminal without using an IDE, follow these steps:

**1. Compile the source code:**

```bash
javac -d out src/*.java
```

**2. Run the program:**

```bash
java -cp out Main
```

---

<div align="center">
See you in the upcoming updates! 🚀
</div>
