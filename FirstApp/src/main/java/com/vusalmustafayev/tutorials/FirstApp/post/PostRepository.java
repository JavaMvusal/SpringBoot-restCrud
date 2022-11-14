package com.vusalmustafayev.tutorials.FirstApp.post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PostRepository extends CrudRepository<Post,String> {
    public List<Post> findByUserId(String userId);
}
