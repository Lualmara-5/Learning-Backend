// "Nombrarla"
package com.myapp.students;

public class Student {

    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodo
    public void showInfo() {
        System.out.println("Name: " + name + ", Age:" + age);
    }
}
