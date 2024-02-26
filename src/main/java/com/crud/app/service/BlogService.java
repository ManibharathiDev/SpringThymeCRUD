package com.crud.app.service;

import com.crud.app.entity.Blogs;
import java.util.List;

public interface BlogService {
    void save(Blogs blog);

    List<Blogs> fetchAll();

    void update(Blogs blogs);

    void delete(Long id);

}
