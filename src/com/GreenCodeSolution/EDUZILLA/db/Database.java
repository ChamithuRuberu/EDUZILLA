package com.GreenCodeSolution.EDUZILLA.db;

import com.GreenCodeSolution.EDUZILLA.model.Program;
import com.GreenCodeSolution.EDUZILLA.model.Student;
import com.GreenCodeSolution.EDUZILLA.model.Teacher;
import com.GreenCodeSolution.EDUZILLA.model.User;
import com.GreenCodeSolution.EDUZILLA.util.security.PasswordManager;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> userTable
            = new ArrayList();
    public static ArrayList<Student> studentTable
            = new ArrayList();
    public static ArrayList<Teacher> teacherTable
            = new ArrayList();
    public static ArrayList<Program> programTable
            = new ArrayList();

    static {
        userTable.add(
                new User("Hasika","sandaruwan",
                        "h@gmail.com",
                        new PasswordManager().encrypt("1234"))
        );
    }

}
