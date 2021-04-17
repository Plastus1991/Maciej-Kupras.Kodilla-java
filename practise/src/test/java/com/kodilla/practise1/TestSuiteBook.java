package com.kodilla.practise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSuiteBook {



    @Test
    void testBook() {
        //Given
        Library library = new Library();
        Book book1 = new Book("www", 2022);


        //Then
        library.addBook(book1);
        List<Book> newList = library.getBooksList();

        //Then
        assertEquals(1, newList.size());
    }
}
