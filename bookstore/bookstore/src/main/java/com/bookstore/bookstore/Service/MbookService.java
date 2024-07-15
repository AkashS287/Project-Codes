package com.bookstore.bookstore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bookstore.bookstore.Entity.myBooks;
import com.bookstore.bookstore.Repository.MyBookRepo;
@Service
public class MbookService {
    
    @Autowired
    public MyBookRepo mbr;

    public void savemybooks(myBooks mb){
        mbr.save(mb);
        
    }
    public List<myBooks> getmyfavbooks(){
        return mbr.findAll();
    }
    public void deleteById(int id){
        mbr.deleteById(id);
    }
}
