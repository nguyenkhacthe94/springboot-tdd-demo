package com.sds.demo.service;

import java.util.Optional;

import com.sds.demo.model.Author;
import com.sds.demo.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(Integer id) {
        Optional<Author> authorOptional = authorRepository.findById(id);
        if(authorOptional.isPresent()) {
            return authorOptional.get();
        }
        return null;
    }

    @Override
    public Iterable<Author> findAllByName(String name) {
        return null;
    }
    
}
