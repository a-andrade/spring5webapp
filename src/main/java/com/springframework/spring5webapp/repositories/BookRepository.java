package com.springframework.spring5webapp.repositories;

import com.springframework.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {



}
