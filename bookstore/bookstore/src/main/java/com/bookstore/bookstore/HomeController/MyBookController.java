package com.bookstore.bookstore.HomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.bookstore.Service.MbookService;
@Controller
public class MyBookController {

    @Autowired
    private MbookService mbs;
    
    @RequestMapping("/deletebyId/{id}")
    public String deletemylist(@PathVariable("id") int id){
     mbs.deleteById(id);
     return "redirect:/myBooks";
    } 
}
