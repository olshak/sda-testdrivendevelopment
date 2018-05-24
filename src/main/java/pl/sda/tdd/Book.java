package pl.sda.tdd;

import java.time.LocalDate;

public class Book {
    private String author;
    private String title;
    private int price;
    private LocalDate date;

    public Book(String author, String title, int price, LocalDate date) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
