package com.spring.elastic.repositories;

import com.spring.elastic.Domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {


}
