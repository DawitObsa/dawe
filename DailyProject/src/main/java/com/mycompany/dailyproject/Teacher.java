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
// Teacher class
class Teacher extends User {
    private String department;

    public Teacher(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    

    public String getDepartment() {
        return department;
    }

    public void assignCourse(Course course) {
        System.out.println("Assigned course: " + course.getCourseName() + " to Teacher: " + name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + name + ", ID: " + id + ", Department: " + department);
    }
}

