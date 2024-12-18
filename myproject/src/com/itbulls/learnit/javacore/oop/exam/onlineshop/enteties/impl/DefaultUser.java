package com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.enteties.UserRole;

//This file implements the User interface for regular users.

public class DefaultUser implements User {

    private static int userCounter = 0;

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private UserRole role; // Added role field

    {
        id = ++userCounter;
    }

    public DefaultUser() {
    }

    public DefaultUser(String firstName, String lastName, String password, String email, UserRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.role = role; // Initialize role
    }

    @Override
    public UserRole getRole() {
        return this.role;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "First Name: " + this.getFirstName() + "\t\t" +
                "Last Name: " + this.getLastName() + "\t\t" +
                "Role: " + this.getRole();
    }

    @Override
    public void setPassword(String password) {
        if (password == null) {
            return;
        }
        this.password = password;
    }

    @Override
    public void setEmail(String newEmail) {
        if (newEmail == null) {
            return;
        }
        this.email = newEmail;
    }

    @Override
    public int getId() {
        return this.id;
    }

    void clearState() {
        userCounter = 0;
    }
}
