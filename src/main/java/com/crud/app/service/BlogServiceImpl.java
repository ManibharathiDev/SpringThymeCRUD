package com.crud.app.service;

import com.crud.app.entity.Blogs;
import com.crud.app.repo.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    private BlogRepository blogRepository;

    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository)
    {
        this.blogRepository = blogRepository;
    }

    @Override
    public void save(Blogs blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blogs> fetchAll() {
        List<Blogs> blogs = blogRepository.findAll();
        return blogs;
    }

    @Override
    public void update(Blogs blogs) {
        blogRepository.save(blogs);
    }

    @Override
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }
}
