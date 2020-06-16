package com.may.oo;

public class StudentTester {
    public static void main(String[] args) {
        Student joe = new Student("1234567","Joe");
        Student jerry = new Student("7654321","Jerry");
        Student jason = new Student("1357989","Jason");
        Teacher teacher = new Teacher();
        teacher.addStudent(joe);
        teacher.addStudent(jerry);
        teacher.addStudent(jason);

 /*點名       for (int i = 0; i < teacher.students.size(); i++) {
            teacher.students.get(i).report();

            fori+tab鍵＝快速形成for迴圈
        }*/
        teacher.reportAll();
    }
}
