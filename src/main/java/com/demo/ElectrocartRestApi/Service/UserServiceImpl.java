package com.demo.ElectrocartRestApi.Service;

import com.demo.ElectrocartRestApi.Beans.User;
import com.demo.ElectrocartRestApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService
{
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user)
    {
        try {
            return userRepository.save(user);
        }
        catch(Exception e)
        {
            System.out.println("e");
            return null;
        }
    }

//    @Override
//    public List<User> saveProducts(List<User> user)
//    {
//        return userRepository.saveAll(user);
//    }

    @Override
    public User validateUser(String email, String password)
    {
        return userRepository.validate(email,password);
    }

}
