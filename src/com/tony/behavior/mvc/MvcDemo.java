package com.tony.behavior.mvc;

import com.tony.behavior.mvc.controller.StudentController;
import com.tony.behavior.mvc.model.Student;
import com.tony.behavior.mvc.view.StudentView;

public class MvcDemo {
    public static void main(String[] args) {
        Student student = getStudent();

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(student, studentView);

        studentController.updateView();

        studentController.setModel("james", "110");

        studentController.updateView();
    }

    public static Student getStudent() {
        Student student = new Student();
        student.setName("tony");
        student.setRollNo("10");
        return student;
    }
}
