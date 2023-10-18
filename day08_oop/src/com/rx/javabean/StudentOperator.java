package com.rx.javabean;

public class StudentOperator {
    private Student student;

    //堆内存中再保存了一个student信息副本,由operator指向
    //该student副本指向方法printPass
    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass() {
        if (student.getScore() >= 60) {
            System.out.println(student.getName() + "成绩及格");
        } else {
            System.out.println(student.getName() + "成绩不及格");
        }
    }

}
