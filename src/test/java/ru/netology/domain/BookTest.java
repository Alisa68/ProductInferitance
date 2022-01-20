package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "Alice’s Adventures in Wonderland", 1228, "Lewis Carroll");

    @Test
    void shouldNotMatchesSearch() {
        boolean actual = book.matches("");
        assertEquals(false, actual);
    }

    @Test
    void shouldMatchesBookByTitle() {
        boolean actual = book.matches("Alice’s Adventures in Wonderland");
        assertEquals(true, actual);
    }

    @Test
    void shouldMatchesBookByAuthor() {
        boolean actual = book.matches("Lewis Carroll");
        assertEquals(true, actual);
    }
}