package com.may.oo;

public class Student {
    String id;
    String name;
    Teacher teacher;
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public void report() {
        System.out.println(id + "/" + name);
    }
}
