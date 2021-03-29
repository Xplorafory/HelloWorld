package com.it;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BookTest {

    public Book book3 = new Book("title", 5, "author");

    public com.it.Book testObjectCreation() {
        return new Book("title", 5, "author");
    }

    @Test
    void testGlobalBook() {
        assertEquals("title", testObjectCreation().getTitle());
    }

    @Test
    void testSetCreateBook() {
        Book book = new Book("hejsvejs", 200, "sven");
        assertEquals("hejsvejs", book.getTitle());
    }

    @Test
    void testSetTitleToNull() {
        Book book = new Book(null, 200, "sven");
        assertNull(null, book.getTitle());
    }



}