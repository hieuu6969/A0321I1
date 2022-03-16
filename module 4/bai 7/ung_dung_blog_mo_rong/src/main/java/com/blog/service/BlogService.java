package com.blog.service;

import com.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BlogService {

    Page<Blog> findAll(Pageable pageable);
    Blog findById(Long id);
    void save(Blog blog);
    void deleteById(Long id);
    Page<Blog> findAllByTitleContaining(String title,Pageable pageable);
    Page<Blog> allBlogsSortedByDateCreated(Pageable pageable);
}
