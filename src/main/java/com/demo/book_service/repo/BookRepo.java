package com.demo.book_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.book_service.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    
}
