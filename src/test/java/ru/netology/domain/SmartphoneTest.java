package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone = new Smartphone(3, "8.3", 49_990, "Sony");

    @Test
    void shouldNotMatchesSearch() {
        boolean actual = smartphone.matches("");
        assertFalse(actual);
    }

    @Test
    void shouldMatchesBookByTitle() {
        boolean actual = smartphone.matches("8.3");
        assertTrue(actual);
    }

    @Test
    void shouldMatchesBookByManufacturer() {
        boolean actual = smartphone.matches("Sony");
        assertTrue(actual);
    }

}