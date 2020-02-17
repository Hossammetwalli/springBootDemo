package com.springproject.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springproject.demo.domain.Author;

public interface AuthorRepositories extends CrudRepository<Author, Long> {

}
