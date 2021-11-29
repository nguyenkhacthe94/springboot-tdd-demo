package com.sds.demo.controller;

import com.sds.demo.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ModelAndView showAuthorList() {
        ModelAndView modelAndView = new ModelAndView("/author/list");
        modelAndView.addObject(("authors"), authorService.findAll());
        return modelAndView;
    }
}
