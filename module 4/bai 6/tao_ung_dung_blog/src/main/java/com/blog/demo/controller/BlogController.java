package com.blog.demo.controller;

import com.blog.demo.model.Blog;
import com.blog.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/bloglist")
    public ModelAndView getBlogList() {
        return new ModelAndView("list", "blogs",blogService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        return new ModelAndView("create","blog",new Blog());
    }

    @PostMapping("/save")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.saveBlog(blog);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Blog());
        modelAndView.addObject("message", "Đã tạo mới blog thành công");
        return modelAndView;
    }
}
