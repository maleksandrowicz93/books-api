package com.github.maleksandrowicz93.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryBookService {

    private List<Book> list;

    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public Book getBook(long id) {

        List<Book> list = this.getList();
        for (Book book : list) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void editBook(long id, String isbn, String title, String author, String publisher, String type) {
        List<Book> list = this.getList();
        for (Book book : list) {
            if (book.getId() == id) {
                book = new Book(id, isbn, title, author, publisher, type);
            }
        }
    }

    public void removeBook(long id) {
        List<Book> list = this.getList();
        for (Book book : list) {
            if (book.getId() == id) {
                list.remove(book);
            }
        }
    }

}
