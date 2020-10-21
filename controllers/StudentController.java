/*
 * Copyright (c) 2020.
 * creator - Jonathan Chanuka Gurusinghe
 * module - concurrent programming
 */

package controllers;

import model.Course;
import model.Student;

import java.util.ArrayList;

public class StudentController extends Student {

    private ArrayList<Course> cwList = new ArrayList<Course>();

    public StudentController(String firstname, String lastname, String username, char password, int ID) {
        super(firstname, lastname, username, password, ID);
    }

    public StudentController() {
    }

    public void submitCw(Course c){
        cwList.add(c);
    }

    public void removeCw(Course c){
        cwList.remove(c);
    }

    public void viewCw(){
        cwList.toString();
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "courseworkList=" + cwList +
                '}';
    }





}
