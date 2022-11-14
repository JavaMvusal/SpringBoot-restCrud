package com.vusalmustafayev.tutorials.FirstApp.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/posts", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Post> getAllPost(){
        return postService.getAllPosts();
    }

    @RequestMapping(value = "/posts/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Optional<Post> getPost(@PathVariable String id){

        return postService.getPost(id);
    }
    @RequestMapping(value = "/posts",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public void addPost(Post post){
        postService.addPost(post);
    }
    @RequestMapping(value = "/posts/{id}",method = RequestMethod.PUT)

    public void updatePost(@PathVariable String id, @RequestBody Post post){
        postService.updatePost(id,post);
    }

    @RequestMapping(value = "/posts/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePost(@PathVariable String id){
        postService.deletePost(id);
    }
}
