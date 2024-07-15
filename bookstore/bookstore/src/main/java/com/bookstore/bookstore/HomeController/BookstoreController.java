package com.bookstore.bookstore.HomeController;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bookstore.Entity.book;
import com.bookstore.bookstore.Entity.myBooks;
import com.bookstore.bookstore.Service.BookService;
import com.bookstore.bookstore.Service.MbookService;



@Controller
public class BookstoreController {
    @GetMapping("/home")
    public String home(){
        return "Home";
    }
    @GetMapping("bookRegister")
    public String bookRegister(){
        return "bookRegister";
    }
    @GetMapping("AvailableBooks")
    public ModelAndView AvailableBooks(){
        List<book> list = service.getAllbook();
        return new ModelAndView("AvailableBooks","book", list) ;
    }
    @Autowired
    private BookService service;

    @Autowired
    private MbookService mybookservice;


    @PostMapping("/save")
    public String getbook(@ModelAttribute book b){
    service.save(b);
    return"redirect:/AvailableBooks";
        }
    @GetMapping("/myBooks")
    public String myBooks(Model model){
        List<myBooks>list=mybookservice.getmyfavbooks();
        model.addAttribute("mybook", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getmylist(@PathVariable("id") int id){
        book b = service.getById(id);
        myBooks mb = new myBooks(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        mybookservice.savemybooks(mb);
        return"redirect:/myBooks";
    }
    @RequestMapping("/editbook/{id}")
    public String edit(@PathVariable("id") int id , Model model){
        book b = service.getById(id);
        model.addAttribute("book", b);
        return"BookEdit";
    }
    @RequestMapping("/deletebook/{id}")
    public String delete(@PathVariable("id")int id){
        service.delete(id);
        return "redirect:/AvailableBooks";
    }
    @GetMapping("/BookStore")
    public String bookstore(){
        return"BookStore";
    }
    }
    

    
    

