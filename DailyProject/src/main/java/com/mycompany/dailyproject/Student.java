/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dailyproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devao
 */
// Student class
class Student extends User {
    private List<Course> enrolledCourses;

    public Student(String name, String id) {
        super(name, id);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println("Student " + name + " enrolled in course: " + course.getCourseName());
    }

    public void viewCourses() {
        System.out.println("Courses for Student: " + name);
        for (Course course : enrolledCourses) {
            course.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}
