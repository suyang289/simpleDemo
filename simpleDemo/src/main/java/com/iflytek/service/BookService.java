package com.iflytek.service;

import com.iflytek.pojo.Book;
import com.iflytek.pojo.User;
import com.iflytek.utils.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface BookService {

    Book queryBook(Book book);

    Book addBook(Book book);

    ResultUtil updateBName(Book book);

    ResultUtil updateBPhone(Book book);

    List<Book> list();

}
