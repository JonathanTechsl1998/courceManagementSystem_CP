/*
 * Copyright (c) 2020.
 * creator - Jonathan Chanuka Gurusinghe
 * module - concurrent programming
 */

import model.Admin;
import model.Instructor;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);
    static Admin admin = new Admin();
    static Student student = new Student();
    static Instructor ins = new Instructor();
    static ArrayList<Student> stulist;
    static ArrayList<Instructor> insList;
    public static void main(String[] args) {
        run();
    }

    static void run(){
        System.out.println("================ COURSE MANAGEMENT SYSTEM =====================");
        System.out.println("Developed by Chathuranga, Jonathan, Nameesha, Ruvi");
        System.out.println(" LOGIN \n ");
        System.out.println("[1]. ADMIN ");
        System.out.println("[2]. INSTRUCTOR");
        System.out.println("[3]. STUDENTS");

        int x = sc.nextInt();

        switch (x){
            case 1:
                adminLogin();
                break;

            case 2:
                instructorLogin();
                break;

            case 3:
                studentLogin();
                break;
        }
    }

    static boolean login(){
        System.out.println();
        return true;
    }

    static void adminLogin(){
        System.out.println(" ADMIN LOGIN ");
        System.out.println("Enter username");
        String x = sc.next();
        System.out.println("Enter password");
        char pass = sc.next().charAt(0);
        if(x.equals(admin.getUsername()) && pass == admin.getPassword()){
            System.out.println("Success");
            adminLoginaccess();
        }else {
            System.out.println("username and password is incorrect \n");
            run();
        }
    }

    static void adminLoginaccess(){
        System.out.println("Select Option");
        System.out.println("[1].Add a Student");
        System.out.println("[2].View Student");
        System.out.println("[3].Add an Instructor");
        System.out.println("[4].View Instructor");
        System.out.println("[0].Exit System");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("[1].Add a Student");
                System.out.println("Enter Student first name");
                String fname = sc.next();
                student.setFirstname(fname);
                System.out.println("Enter Student last name");
                String lname = sc.next();
                student.setLastname(lname);
                System.out.println("Enter Student username");
                String username = sc.next();
                student.setUsername(username);
                System.out.println("Enter Student password");
                char password = sc.next().charAt(0);
                student.setPassword(password);
                int ID = 1;
                Student s = new Student(fname, lname, username, password, ID);
                stulist.add(s);
                break;

            case 2:
                System.out.println("[2].View Student");
                System.out.println(stulist.toString());
                break;

            case 3:
                System.out.println("[3].Add an Instructor");
                System.out.println("Enter Instructor first name");
                String ifname = sc.next();
                ins.setFirstname(ifname);
                System.out.println("Enter Instructor last name");
                String ilname = sc.next();
                ins.setLastname(ilname);
                System.out.println("Enter Instructor username");
                String iusername = sc.next();
                ins.setUsername(iusername);
                System.out.println("Enter Instructor password");
                char ipassword = sc.next().charAt(0);
                ins.setPassword(ipassword);
                int iID = (int) (Math.random()*1000);
                Instructor a = new Instructor(ifname, ilname, iusername, ipassword, iID);
                insList.add(a);
                break;

            case 4:
                System.out.println("[4].View Instructor");
                System.out.println(insList.toString());
                break;

            case 0:
                System.exit(0);
                break;
        }

    }

    static void instructorLogin(){

    }

    static void studentLogin(){

    }




}
