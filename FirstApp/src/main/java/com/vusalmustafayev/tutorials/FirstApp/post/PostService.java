package com.vusalmustafayev.tutorials.FirstApp.post;

import com.vusalmustafayev.tutorials.FirstApp.location.Location;
import com.vusalmustafayev.tutorials.FirstApp.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts(){
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);
     return posts;
    }
    public Optional<Post> getPost(String id){
      return postRepository.findById(id);

    }
    public void addPost(Post post){
        postRepository.save(post);
    }

    public void updatePost(String id, Post post) {
    postRepository.save(post);

    }
    public List<Post> getPostByUser(String id){
        List<Post> posts = new ArrayList<>();
        postRepository.findByUserId(id).forEach(posts::add);
        return  posts;
    }
    public void deletePost(String id) {
        postRepository.deleteById(id);
    }
}
