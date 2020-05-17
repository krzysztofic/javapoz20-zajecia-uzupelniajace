package com.sda.adapter.domain;

import java.util.List;

public class BookApplication {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        BooksFromTextFileAdapter booksFromTextFileAdapter = new BooksFromTextFileAdapter(
                "C:\\Users\\Krzys\\OneDrive\\Documents\\Projects\\Zajecia uzupelniajace\\javapoz20-zajecia-uzupelniajace\\src\\main\\resources\\books\\book.txt"
        );

        List<Book> books = booksFromTextFileAdapter.readBooks();

        bookService.showBooks(books);
    }
}
