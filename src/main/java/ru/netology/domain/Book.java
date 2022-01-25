package ru.netology.domain;

public class Book extends Product {
    private String autor;

    public Book() {
        super();
    }

    public Book(int id, String name, int price, String autor) {
        super(id, name, price);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
