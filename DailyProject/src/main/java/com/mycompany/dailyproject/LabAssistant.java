package com.mycompany.dailyproject;

// LabAssistant class
public class LabAssistant extends User {
    private String assignedLab;
public LabAssistant(String name, String id, String assignedLab) {
        super(name, id);
        this.assignedLab = assignedLab;
    }
 public void assistInLab() {
        System.out.println("Lab Assistant " + name + " is assisting in the " + assignedLab + " lab.");
    }

    // views which assistant is assigned to which lab
     public void viewAssignedLab() {
        System.out.println("Lab Assistant " + name + " is assigned to the " + assignedLab + " lab.");
    }
}
