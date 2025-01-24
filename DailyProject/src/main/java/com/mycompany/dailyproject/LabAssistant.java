package com.mycompany.dailyproject;

// LabAssistant class
public class LabAssistant extends User {
    private String assignedLab;
    //by komy bire
public LabAssistant(String name, String id, String assignedLab) {
        super(name, id);
        this.assignedLab = assignedLab;
    }
 public void assistInLab() {
        System.out.println("Lab Assistant " + name + " is assisting in the " + assignedLab + " lab.");
    }

    // views which assistant is assigned to which lab  abenezer
     public void viewAssignedLab() {
        System.out.println("Lab Assistant " + name + " is assigned to the " + assignedLab + " lab.");
    }
    // the the method to display info edited by dawit
       @Override
    public void displayInfo() {
        System.out.println("Lab Assistant: " + name + ", ID: " + id + ", Assigned Lab: " + assignedLab);
    }
}
