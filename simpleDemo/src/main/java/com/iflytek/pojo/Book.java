package com.iflytek.pojo;

public class Book {
    private int bid;
    private String book_name;
    private String borrower_name;
    private String borrower_phone;

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", book_name='" + book_name + '\'' +
                ", borrower_name='" + borrower_name + '\'' +
                ", borrower_phone='" + borrower_phone + '\'' +
                '}';
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBorrower_name() {
        return borrower_name;
    }

    public void setBorrower_name(String borrower_name) {
        this.borrower_name = borrower_name;
    }

    public String getBorrower_phone() {
        return borrower_phone;
    }

    public void setBorrower_phone(String borrower_phone) {
        this.borrower_phone = borrower_phone;
    }
}
