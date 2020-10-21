/*
 * Copyright (c) 2020.
 * creator - Jonathan Chanuka Gurusinghe
 * module - concurrent programming
 */

package model;

public class User {

    public String firstname;
    public String lastname;
    public String username;
    public char password;
    public int ID;

    public User(String firstname, String lastname, String username, char password, int ID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.ID = ID;
    }

    public User(){

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
