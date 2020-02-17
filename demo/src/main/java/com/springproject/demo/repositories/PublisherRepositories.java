package com.springproject.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springproject.demo.domain.Author;
import com.springproject.demo.domain.Publisher;

public interface PublisherRepositories extends CrudRepository<Publisher, Long> {

}
