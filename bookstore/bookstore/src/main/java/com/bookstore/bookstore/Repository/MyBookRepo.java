package com.bookstore.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.bookstore.Entity.myBooks;

public interface MyBookRepo extends JpaRepository<myBooks,Integer> {
    
}
