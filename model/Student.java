
/*
 * Copyright (c) 2020.
 * creator - Jonathan Chanuka Gurusinghe
 * module - concurrent programming
 */

package model;

import java.util.ArrayList;

public class Student extends User {

    public Student(String firstname, String lastname, String username, char password, int ID) {
        super(firstname, lastname, username, password, ID);
    }

    public Student() {
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public void setFirstname(String firstname) {
        super.setFirstname(firstname);
    }

    @Override
    public String getLastname() {
        return super.getLastname();
    }

    @Override
    public void setLastname(String lastname) {
        super.setLastname(lastname);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public char getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(char password) {
        super.setPassword(password);
    }

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }
}
