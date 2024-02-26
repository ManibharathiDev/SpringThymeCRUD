package com.crud.app.repo;

import com.crud.app.entity.Blogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blogs,Long> {
}
