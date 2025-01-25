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
import java.util.Scanner;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Database Connection (Singleton)
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();

        boolean running = true;

        while (running) {
            System.out.println("\nSelect your role:");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Admin");
            System.out.println("4. Department Head");
            System.out.println("5. Lab Assistant");
            System.out.println("6. Exit");

            int roleChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (roleChoice) {
                case 1: // Teacher
                    System.out.println("Enter Teacher's name: ");
                    String teacherName = scanner.nextLine();
                    System.out.println("Enter Teacher's ID: ");
                    String teacherID = scanner.nextLine();
                    System.out.println("Enter Teacher's department: ");
                    String teacherDept = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherName, teacherID, teacherDept);

                    // Teacher actions
                    System.out.println("Assigning a course to the teacher...");
                    System.out.println("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    System.out.println("Enter Course Code: ");
                    String courseCode = scanner.nextLine();
                    System.out.println("Enter Course Credits: ");
                    int courseCredits = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Course course = new Course(courseName, courseCode, courseCredits);
                    teacher.assignCourse(course);
                    teacher.displayInfo();
                    break;

                case 2: // Student
                    System.out.println("Enter Student's name: ");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter Student's ID: ");
                    String studentID = scanner.nextLine();
                    Student student = new Student(studentName, studentID);

                    // Student actions
                    System.out.println("Enrolling in a course...");
                    System.out.println("Enter Course Name: ");
                    String enrollCourseName = scanner.nextLine();
                    System.out.println("Enter Course Code: ");
                    String enrollCourseCode = scanner.nextLine();
                    System.out.println("Enter Course Credits: ");
                    int enrollCourseCredits = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Course enrollCourse = new Course(enrollCourseName, enrollCourseCode, enrollCourseCredits);
                    student.enrollCourse(enrollCourse);
                    student.viewCourses();
                    student.displayInfo();
                    break;

                case 3: // Admin
                    System.out.println("Enter Admin's name: ");
                    String adminName = scanner.nextLine();
                    System.out.println("Enter Admin's ID: ");
                    String adminID = scanner.nextLine();
                    Admin admin = new Admin(adminName, adminID);

                    // Admin actions
                    admin.manageSystemSettings();
                    admin.displayInfo();
                    break;

                case 4: // Department Head
                    System.out.println("Enter Department Head's name: ");
                    String deptHeadName = scanner.nextLine();
                    System.out.println("Enter Department Head's ID: ");
                    String deptHeadID = scanner.nextLine();
                    System.out.println("Enter Department Head's department: ");
                    String deptHeadDept = scanner.nextLine();
                    DepartmentHead deptHead = new DepartmentHead(deptHeadName, deptHeadID, deptHeadDept);

                    // Department Head actions
                    System.out.println("Approving a course...");
                    System.out.println("Enter Course Name: ");
                    String approveCourseName = scanner.nextLine();
                    System.out.println("Enter Course Code: ");
                    String approveCourseCode = scanner.nextLine();
                    System.out.println("Enter Course Credits: ");
                    int approveCourseCredits = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Course approveCourse = new Course(approveCourseName, approveCourseCode, approveCourseCredits);
                    deptHead.approveCourse(approveCourse);
                    deptHead.displayInfo();
                    break;

                case 5: // Lab Assistant
                    System.out.println("Enter Lab Assistant's name: ");
                    String labAssistantName = scanner.nextLine();
                    System.out.println("Enter Lab Assistant's ID: ");
                    String labAssistantID = scanner.nextLine();
                    System.out.println("Enter Lab Assistant's assigned lab: ");
                    String labAssistantLab = scanner.nextLine();
                    LabAssistant labAssistant = new LabAssistant(labAssistantName, labAssistantID, labAssistantLab);

                    // Lab Assistant actions
                    labAssistant.assistInLab();
                    labAssistant.viewAssignedLab();
                    labAssistant.displayInfo();
                    break;

                case 6: // Exit
                    running = false;
                    displaySummary();
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to display summary of all roles and their options
    private static void displaySummary() {
        System.out.println("\nSystem Summary:");
        System.out.println("1. Teacher: Assign courses, view assigned courses.");
        System.out.println("2. Student: Enroll in courses, view enrolled courses.");
        System.out.println("3. Admin: Manage users and system settings.");
        System.out.println("4. Department Head: Approve courses and manage department tasks.");
        System.out.println("5. Lab Assistant: Assist in labs, view assigned labs.");
        System.out.println("Thank you for using the College Management System!");
    }
}


