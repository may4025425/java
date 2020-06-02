package com.may.oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    String name;
    List<Student> students = new ArrayList<>();//放所有學生資料


    public void addStudent(Student stu){
        students.add(stu);
    }

    public void reportAll() {
        for (Student stu : students){
            stu.report();
        }
    }
}
