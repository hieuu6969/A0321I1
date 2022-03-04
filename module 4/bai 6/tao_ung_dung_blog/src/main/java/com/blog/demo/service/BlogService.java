package com.blog.demo.service;

import com.blog.demo.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    void saveBlog(Blog blog);
    void deleteBlog(Long id);
    Blog findBlogById(Long id);
}
