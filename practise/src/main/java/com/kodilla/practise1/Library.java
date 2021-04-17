package com.kodilla.practise1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> booksList = new ArrayList<>();

    public void addBook(Book book) {
        booksList.add(book);
    }

    public List<Book> getBooksList() {
        return booksList;
    }
}
