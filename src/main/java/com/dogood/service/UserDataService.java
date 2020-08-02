package com.dogood.service;

import com.dogood.dao.UserDao;
import com.dogood.exception.UserDataException;
import com.dogood.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class UserDataService {

    @Autowired
    private UserDao userDao;
    // add a user

    public UserData addUser(UserData user){
        return userDao.save(user);
    }

    // get all users

    public List<UserData> getAllUsers(){
        return userDao.findAll();
    }

    // get user

    public UserData getUser(int userId){
        Optional<UserData> optionalUserData=userDao.findById(userId);

        if(!optionalUserData.isPresent()){
            throw new UserDataException("Customer Not Found");
        }


        return userDao.findById(userId).get();
    }

    // update userData

    public UserData updateUser(int userId,UserData userData){
        userData.setUserId(userId);

        return userDao.save(userData);
    }

    // delete userData

    public void deleteUserData(int userId){
        userDao.deleteById(userId);
    }

}
