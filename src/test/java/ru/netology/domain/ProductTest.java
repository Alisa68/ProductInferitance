package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product = new Product(1, "Think and decide", 1199);

    @Test
    void shouldNotMatchesProduct() {
        boolean actual = product.matches("");
        assertFalse(actual);
    }

    @Test
    void shouldMatchesProduct() {
        boolean actual = product.matches("Think and decide");
        assertTrue(actual);
    }
}