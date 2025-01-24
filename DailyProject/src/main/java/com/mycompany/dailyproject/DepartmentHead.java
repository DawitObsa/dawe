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
// Department Head class
class DepartmentHead extends Teacher {
    public DepartmentHead(String name, String id, String department) {
        super(name, id, department);
    }

    public void approveCourse(Course course) {
        System.out.println("Department Head approved course: " + course.getCourseName());
    }

    public void monitorProgress() {
        System.out.println("Department Head monitoring progress of the department.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Department Head: " + name + ", ID: " + id + ", Department: " + getDepartment());
    }
}
