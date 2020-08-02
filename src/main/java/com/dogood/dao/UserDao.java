package com.dogood.dao;


import com.dogood.model.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends CrudRepository<UserData, Integer> {

    @Override
    List<UserData> findAll();
}
