package com.spring.elastic.Services;

import com.spring.elastic.Domain.Books;
import com.spring.elastic.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BooksRepository booksRepository;
    public Books saveBook(Books b){

        return booksRepository.save(b);
    }

    public List<Books> saveBooks(List<Books> books){

        return (List<Books>) booksRepository.saveAll(books);
    }

    public Boolean deleteBookById(int id){

        booksRepository.deleteById(id);
        return true;
    }

    public List<Books> getAllBooks(){
        int s=0;
        return (List<Books>) booksRepository.findAll();
    }
    public Optional<Books> getBook(int id){
        return  booksRepository.findById(id);
    }

}
