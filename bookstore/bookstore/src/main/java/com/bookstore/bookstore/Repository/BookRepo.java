package com.bookstore.bookstore.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.Entity.book;
@Repository
public interface BookRepo extends JpaRepository<book,Integer>{

   

}

