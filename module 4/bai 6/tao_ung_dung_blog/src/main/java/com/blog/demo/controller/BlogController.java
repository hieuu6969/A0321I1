package com.blog.demo.controller;

import com.blog.demo.model.Blog;
import com.blog.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/bloglist")
    public ModelAndView getBlogList(@PageableDefault(size = 5)Pageable pageable) {
        return new ModelAndView("list", "blogs",blogService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        return new ModelAndView("create","blog",new Blog());
    }

    @PostMapping("/save")
    public String saveBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.saveBlog(blog);
        redirectAttributes.addFlashAttribute("message", "Tạo mới blog thành công!");
        return "redirect:/create";
    }
}
