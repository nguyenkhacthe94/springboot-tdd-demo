package com.sds.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }
    
    public Author() {}

    public Author(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", Name: " + this.name;
    }
}
