package com.vusalmustafayev.tutorials.FirstApp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private  UserService userService;
@RequestMapping(value = "/users", produces = { MediaType.APPLICATION_JSON_VALUE })
public List<User> getAllUsers(){
    return  userService.getAllUser();
}

@RequestMapping(value = "/users/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
public Optional<User> getUser(@PathVariable String id){
   return userService.getUser(id);
}

@RequestMapping(value = "/users",method = RequestMethod.POST,produces = { MediaType.APPLICATION_JSON_VALUE })
public void addUser(@RequestBody User user){
    userService.addUser(user);
}

@RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
public void updateUser(@PathVariable String id,@RequestBody User user){
    userService.updateUser(id,user);
}

@RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

@RequestMapping(value = "/users/location/{id}")
    public List<User> getUsersByLocationId(@PathVariable String id){
    return userService.getUserByLocationId(id);
}

@RequestMapping(value = "/users/firstname/{firstname}")
    public List<User> getUsersByFirstname(@PathVariable String firstname){
    return userService.getUserByFirstname(firstname);
}

}
