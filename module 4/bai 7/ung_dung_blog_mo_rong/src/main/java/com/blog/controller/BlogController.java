package com.blog.controller;


import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.service.BlogService;
import com.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/blogs")
    public ModelAndView showBlogList(@RequestParam("search") Optional<String> search, @PageableDefault(value = 5) Pageable pageable) {
        Page<Blog> blogs;
        if(search.isPresent()) {
            blogs = blogService.findAllByTitleContaining(search.get(), pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list","blogs",blogs);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateBlogForm(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        Blog blog = new Blog();
        LocalDateTime time = LocalDateTime.now();
        blog.setDateCreated(time);
        return new ModelAndView("/blog/create","blog", blog);
    }

    @PostMapping("/save")
    public String createBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        LocalDateTime time = LocalDateTime.now();
        blog.setDateCreated(time);
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","Tạo mới blog thành công");
        return "redirect:/create";
    }
}
