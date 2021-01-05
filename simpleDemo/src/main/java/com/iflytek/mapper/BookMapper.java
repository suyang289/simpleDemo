package com.iflytek.mapper;

import com.iflytek.pojo.Book;
import com.iflytek.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    User queryBook(Book book);


    List<Book> list();
}
