package com.bookstore.bookstore.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.Entity.book;
import com.bookstore.bookstore.Repository.BookRepo;

@Service
public class BookService {
   
    @Autowired
    public BookRepo br;

    public void save(book b){
        br.save(b);
    }
    
    public List<book> getAllbook(){
        return br.findAll();
    }
    
    public book getById(int id){
        return br.findById(id).get();
    }
    public void delete(int id){
        br.deleteById(id);
        
    }
    


}