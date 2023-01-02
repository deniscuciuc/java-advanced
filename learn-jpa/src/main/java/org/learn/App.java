package org.learn;

import org.learn.dao.StudentDAO;
import org.learn.dao.impl.StudentDAOImpl;
import org.learn.model.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();

        List<Student> foundStudents = studentDAO.findAll();

        System.out.println(foundStudents.toString());
    }
}
