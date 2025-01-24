README for College Management System

Overview
This is a Java-based College Management System designed using Object-Oriented Programming (OOP) principles and adhering to SOLID principles. The system demonstrates the use of design patterns like Singleton and Factory to manage different functionalities effectively.

Features
1. Teacher Management:
   - Create and manage teacher profiles.
   - Assign or reassign courses to teachers.

2. Course Management:
   - Add, update, or delete courses.
   - Assign courses dynamically to teachers and students.

3. Student Management:
   - Maintain student records, including enrolled courses and grades.
   - Provide a dashboard to view enrolled courses and grades.

4. Admin Module:
   - Manage system users (students, teachers, department heads).
   - Configure system-wide settings like evaluation criteria.

5. Department Head:
   - Approve and monitor courses, teachers, and student progress.

Design Principles and Patterns
1. SOLID Principles:
   - Single Responsibility: Each class handles one specific responsibility (e.g., Student manages student-specific actions).
   - Open/Closed: Classes are open for extension but closed for modification, supporting maintainability.
   - Liskov Substitution: Subclasses like Teacher and DepartmentHead are substitutable where their parent User is used.
   - Interface Segregation: Responsibilities are broken down into smaller, specific classes to avoid forcing large interfaces.
   - Dependency Inversion: High-level modules depend on abstractions, not implementations.

2. Design Patterns:
   - Singleton: Used for a shared database connection.
   - Factory Pattern: Could be implemented further for object creation (e.g., creating users dynamically).
   - Observer Pattern (Future Scope): Notify changes to dashboards when evaluations are updated.

Dependencies
- JDK 11.

How to Run
1. Setup:
   - Ensure Java is installed on your system.
   - Clone the repository or copy the code files.

2. Compile and Run:
   - Compile the CollegeManagementSystem class