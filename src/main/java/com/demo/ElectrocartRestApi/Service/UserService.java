package com.demo.ElectrocartRestApi.Service;

import com.demo.ElectrocartRestApi.Beans.User;

import java.util.List;

public interface UserService
{
    User saveUser(User user);

//    List<User> saveProducts(List<User> user);

    User validateUser(String email, String password);
}
