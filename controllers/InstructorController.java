/*
 * Copyright (c) 2020.
 * creator - Chathuranga Mannapperuma
 * module - concurrent programming
 */

package controllers;

import model.Instructor;

public class InstructorController extends Instructor {

    public InstructorController(String firstname, String lastname, String username, char password, int ID) {
        super(firstname, lastname, username, password, ID);
    }

    public InstructorController() {
    }

    //view all the coursework of students
    public void viewCw(){
        StudentController sc = new StudentController();
        sc.viewCw();
    }

    //view coursework of student
    //saarch function from the instrucotr on main method --> enter the student ID
    public void viewSingleCw(){
        StudentController sc = new StudentController();
        sc.viewCw();
    }
}
