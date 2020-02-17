package com.springproject.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springproject.demo.domain.Book;

public interface BookRepositries extends CrudRepository<Book, Long>{

}
