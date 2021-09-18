package com.example.javawebapplication;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();

    public List <User> findAll (){

        users.add(new User(1,2,3,4,5,6));

        return users;
    }

}
