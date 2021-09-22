package com.demo.ElectrocartRestApi.Controller;

import com.demo.ElectrocartRestApi.Beans.User;
import com.demo.ElectrocartRestApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;


@Controller
@RequestMapping("/customer")
@CrossOrigin
public class UserController
{
    @Autowired
    UserService userService;

    @RequestMapping("/registers")
    public ModelAndView index ()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/customer/registers.html");
        return modelAndView;
    }
    @RequestMapping("/login")
    public ModelAndView loginUser()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/customer/login.html");
        return modelAndView;
    }

    @RequestMapping("/electrocart")
    public ModelAndView electrocartUserPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/customer/electrocart.html");
        return modelAndView;
    }




    // Insert Rest Api Do Not Touch   http://localhost:9191/customer/register
    @PostMapping("/registeruser")
    public String saveUser(@RequestBody User u) throws IOException
    {
        System.out.println("I am from contorller"+u);
        User uobj = userService.saveUser(u);
        if(uobj!=null)
        {
           return "redirect:/customer/login";
        }
        else
        {
          return "redirect:/customer/registers";
        }
    }


    /*@PostMapping("/customer/registers")
    public List<User> addProducts(@RequestBody List<User> user) {
        return userService.saveProducts(user);
    }
    */

    /*@PostMapping("/customer/login")
    public ResponseEntity<User> updateProduct(@RequestBody User user)
    {
        System.out.println("I am controller"+user);
        User uObj =userService.validateUser(user.getEmail(),user.getPassword());
        System.out.println(uObj);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }*/

    // Validation Rest Api Do Not Touch   http://localhost:9191/customer/validatUser
    @PostMapping("/validatUser")
    public String validate(@RequestBody User user)
    {
        System.out.println(user.getEmail()+" "+user.getPassword());
        User u = userService.validateUser(user.getEmail(),user.getPassword());
        if(u!=null)
        {
            return "redirect:/customer/electrocart";
        }
        else
        {
            return "redirect:/customer/login";
        }
    }

}
