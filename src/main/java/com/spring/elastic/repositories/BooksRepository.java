package com.spring.elastic.repositories;

import com.spring.elastic.Domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BooksRepository extends JpaRepository<Books, Integer> {



    @Query(value = "select  b.id from  Books  b order by b.id desc limit 1",nativeQuery = true)
    public int getAllbooks();

}
