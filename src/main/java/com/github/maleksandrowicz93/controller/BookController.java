package com.github.maleksandrowicz93.controller;

import com.github.maleksandrowicz93.pojo.Book;
import com.github.maleksandrowicz93.pojo.MemoryBookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private MemoryBookService memoryBookService = new MemoryBookService();

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "{hello: world}";
    }

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L,"9788324631766","Thinking in Java",
                "Bruce Eckel","Helion","programming");
    }

    @RequestMapping("/getBookList")
    public List<Book> getList() {
        return memoryBookService.getList();
    }

}
