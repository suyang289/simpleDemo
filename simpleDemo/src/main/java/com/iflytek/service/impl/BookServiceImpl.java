package com.iflytek.service.impl;

import com.iflytek.mapper.BookMapper;
import com.iflytek.mapper.UserMapper;
import com.iflytek.pojo.Book;
import com.iflytek.pojo.User;
import com.iflytek.service.BookService;
import com.iflytek.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book queryBook(Book book) {
        return null;
    }

    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public ResultUtil updateBName(Book book) {
        return null;
    }

    @Override
    public ResultUtil updateBPhone(Book book) {
        return null;
    }

    @Override
    public List<Book> list() {
        return bookMapper.list();
    }
}
