package com.vusalmustafayev.tutorials.FirstApp.user;

import com.vusalmustafayev.tutorials.FirstApp.location.Location;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    @ManyToOne
    private Location location;
    private String email;

    public User() {
    }

    public User(String id, String firstName, String lastName, Location location, String email) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
        this.location = location;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
