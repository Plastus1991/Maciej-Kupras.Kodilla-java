package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void testMedian() {

        //Given
        HashSet<Book> books = new HashSet<>();

        Book book = new Book("Author1", "Title1", 2001, "1");
        Book book1 = new Book("Author1", "Title1", 2002, "2");
        Book book2 = new Book("Author1", "Title1", 2003, "3");
        Book book3 = new Book("Author1", "Title1", 2004, "4");
        Book book4 = new Book("Author1", "Title1", 2005, "5");


        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);
        System.out.println(median);

        //Then
        assertEquals(2003, median);
    }
}
