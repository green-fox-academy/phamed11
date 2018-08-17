package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
//        Create Student and Teacher classes
//            Student
//        learn()
//        question(teacher) -> calls the teachers answer method
//            Teacher
//        teach(student) -> calls the students learn method
//        answer()

        Student jancsi = new Student();
        Teacher teacher = new Teacher();

        String question = jancsi.question("What is this?");
      
    }
}
