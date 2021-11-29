package com.sds.demo.service;

public interface CommonService<T> {
    Iterable<T> findAll();

    T findById(Integer id);

    Iterable<T> findAllByName(String name);
}
