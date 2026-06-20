package com.myapp.books;

public class Book {

    String title;
    String author;

    public Book(String title, String author) {

        this.title = title;
        this.author = author;

    }

    public void showInfo() {
        System.out.println("Title: " + title + ", Author:" + author);
    }

}
