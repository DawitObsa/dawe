/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dailyproject;

/**
 *
 * @author devao
 */
// Main Class to Demonstrate the System
public class CollegeManagementSystem {
    public static void main(String[] args) {
        // Database Connection (Singleton)
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();

        // Users
        Teacher teacher = new Teacher("Abebe Bekele", "T101", "Computer Science");
        Student student = new Student("Mihiratu Kebede", "S202");
        Admin admin = new Admin("Admin User", "A303");
        DepartmentHead deptHead = new DepartmentHead("Dr. Green", "DH404", "Mathematics");

        // Courses
        Course course1 = new Course("OOP Principles", "CS101", 3);
        Course course2 = new Course("Data Structures", "CS102", 4);

        // Operations
        teacher.assignCourse(course1);
        student.enrollCourse(course1);
        student.viewCourses();
        deptHead.approveCourse(course2);
        admin.manageUser(teacher);
        admin.manageSystemSettings();

        // Display User Info
        teacher.displayInfo();
        student.displayInfo();
        deptHead.displayInfo();
    }
}
