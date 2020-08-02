package com.dogood.api;

import com.dogood.dao.UserDao;
import com.dogood.model.UserData;
import com.dogood.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserDataResource {

    @Autowired
    private UserDataService userDataService;


    @PostMapping
    public UserData addUserData(@RequestBody UserData userData){

        return userDataService.addUser(userData);
    }

    @GetMapping(value = "/{userId}")
    public UserData getUser(@PathVariable("userId") int userId){

        return userDataService.getUser(userId);
    }

    @GetMapping()
    public List<UserData> getAllUser(){
        return userDataService.getAllUsers();
    }

    @PutMapping(value = "/{userId}")
    public UserData updateUserData(@PathVariable("userId") int userId,@RequestBody UserData userData){
        return userDataService.updateUser(userId,userData);
    }

    @DeleteMapping(value = "/{userId}")
    public void deleteUserData(@PathVariable("userId") int userId){
        userDataService.deleteUserData(userId);
    }
}
