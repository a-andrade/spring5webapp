package com.springframework.spring5webapp.repositories;

import com.springframework.spring5webapp.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
