package com.sds.demo.repository;

import com.sds.demo.model.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
}
