package com.sds.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sds.demo.model.Author;
import com.sds.demo.service.AuthorService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableConfigurationProperties
public class AuthorRepositoryTest {
    @Autowired
    AuthorService authorService;

    @Test
    public void findByExistIdTest() {
        Integer testId = Integer.valueOf(1);
        Author expectedAuthor = new Author(testId, "hayden");
        Author actualAuthor = authorService.findById(testId);
        assertEquals(expectedAuthor.getId(), actualAuthor.getId());
        assertEquals(expectedAuthor.getName(), actualAuthor.getName());
        assertEquals(expectedAuthor, actualAuthor);

        System.out.println(expectedAuthor.equals(actualAuthor));
    }

    
    
}
