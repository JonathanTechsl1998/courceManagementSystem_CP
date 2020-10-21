/*
 * Copyright (c) 2020.
 * creator - Ruvi Watawana
 * module - concurrent programming
 */

package controllers;

import model.Admin;
import model.User;

import java.util.ArrayList;

public class AdminController extends Admin {

    private ArrayList<User> usersList = new ArrayList<User>();
    public AdminController(String firstname, String lastname, String username, char password, int ID) {
        super(firstname, lastname, username, password, ID);
    }

    public AdminController() {
        super();
    }

    void addUser(User c){
        try {
            usersList.add(c);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    void removeUser(User c){
        usersList.remove(c);
    }

    void viewUser(){
        usersList.toString();

    }

    @Override
    public String toString() {
        return "AdminController{" +
                "users List=" + usersList +
                '}';
    }

    void killSwitch(){

    }
}
