package com.company;

public class Book {
    private int pagesCount;
    private int currentPage;
    private String color;

    public Book() {
        this.pagesCount = 100;
        this.currentPage = 1;
        this.color = "red";
    }

    public Book(int pagesCount, int currentPage, String color) {
        this.pagesCount = pagesCount;
        this.currentPage = currentPage;
        this.color = color;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pagesCount=" + pagesCount +
                ", currentPage=" + currentPage +
                ", color='" + color + '\'' +
                '}';
    }
}
