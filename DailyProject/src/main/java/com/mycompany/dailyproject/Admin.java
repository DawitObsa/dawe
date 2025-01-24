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
// Admin class
class Admin extends User {
    public Admin(String name, String id) {
        super(name, id);
    }

    public void manageUser(User user) {
        System.out.println("Admin managing user: " + user.getName());
    }

    public void manageSystemSettings() {
        System.out.println("Admin managing system-wide configurations.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + name + ", ID: " + id);
    }
}