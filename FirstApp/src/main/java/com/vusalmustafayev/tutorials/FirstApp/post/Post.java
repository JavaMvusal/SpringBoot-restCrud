package com.vusalmustafayev.tutorials.FirstApp.post;

import com.vusalmustafayev.tutorials.FirstApp.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
    @Id
    private String id;
    private String postDate;
    @ManyToOne
    private User user;
    private String details;

    public Post() {
    }

    public Post(String id, String postDate, User user, String details) {
        this.id = id;
        this.postDate = postDate;
        this.user = user;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
