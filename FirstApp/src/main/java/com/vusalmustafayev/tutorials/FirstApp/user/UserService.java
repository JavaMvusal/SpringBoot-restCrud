package com.vusalmustafayev.tutorials.FirstApp.user;

import com.vusalmustafayev.tutorials.FirstApp.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUser(){
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;

    }
    public Optional<User> getUser(String id){
        return userRepository.findById(id);

    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(String id, User user) {
    userRepository.save(user);
    }

    public void deleteUser(String id) {
    userRepository.deleteById(id);

    }
    public List<User> getUserByLocationId(String id){

        return userRepository.findByLocationId(id);
    }

    public List<User> getUserByFirstname(String firstname) {
        return  userRepository.findByFirstname(firstname);
    }
}

