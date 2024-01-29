package com.tony.behavior.mvc.controller;

import com.tony.behavior.mvc.model.Student;
import com.tony.behavior.mvc.view.StudentView;

import java.util.Objects;

public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void updateView() {
        studentView.print(student.getName(), student.getRollNo());
    }

    public void setModel(String name, String rollNo) {
        if (Objects.nonNull(name)) {
            this.student.setName(name);
        }
        if (Objects.nonNull(rollNo)) {
            this.student.setRollNo(rollNo);
        }
    }
}
