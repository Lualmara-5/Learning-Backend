package com.myapp.app;

import com.myapp.students.Student;
import com.myapp.books.Book;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alejo", 21);
        Book book1 = new Book("Title1", "Author1");

        student1.showInfo();
        book1.showInfo();
    }
}
