package com.vusalmustafayev.tutorials.FirstApp.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends CrudRepository<User,String> {
    public List<User> findByLocationId(String locationId);

    public List<User> findByFirstname(String Firstname);
}
