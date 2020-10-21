/*
 * Copyright (c) 2020.
 * creator - Chathuranga Mannapperuma
 * module - concurrent programming
 */

package model;

import java.util.ArrayList;

public class Course {

    private char ID;
    private String name;
    private Instructor instructor;
    private ArrayList<Instructor> instructorList;
    private Student student;
    private ArrayList<Student> studentList;

    public Course(char ID, String name, Instructor instructor, Student student) {
        this.ID = ID;
        this.name = name;
        this.instructor = instructor;
        this.student = student;
    }

    public char getID() {
        return ID;
    }

    public void setID(char ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(ArrayList<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }


}
