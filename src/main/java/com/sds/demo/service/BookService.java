package com.sds.demo.service;

import com.sds.demo.model.Author;
import com.sds.demo.model.Book;

public interface BookService extends CommonService<Book>{
    Iterable<Book> findAllByAuthor(Author author);
}
