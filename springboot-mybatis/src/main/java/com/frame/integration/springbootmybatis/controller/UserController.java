package com.frame.integration.springbootmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frame.integration.springbootmybatis.entity.User;
import com.frame.integration.springbootmybatis.service.UserService;
import com.frame.integration.springbootmybatis.util.JSONResult;

@RestController
@RequestMapping(value = "/api/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/controller")
    public JSONResult controllerTest() {
        JSONResult result = new JSONResult("Hello World!");
        return result;
    }
    
    @GetMapping("/insert")
    public JSONResult insertUser(User user) {
        int i = userService.insertUser(user);
        JSONResult result = new JSONResult(0, "insert success", i);
        return result;
    }
    
    @GetMapping("/delete")
    public JSONResult deleteUser(int userId) {
        int i = userService.deleteByPrimarykey(userId);
        JSONResult result = new JSONResult(0, "delete success", i);
        return result;
    }
    
    @GetMapping("/update")
    public JSONResult updateUser(User user) {
        int i = userService.updateUserByPrimarykey(user);
        JSONResult result = new JSONResult(0, "update success", i);
        return result;
    }
    
    @GetMapping("/select")
    public JSONResult selectUser(int userId) {
        User user = userService.selectUserByPrimarykey(userId);
        JSONResult result = new JSONResult(user);
        return result;
    }
    
    @GetMapping("/selectAll")
    public JSONResult selectAllUser() {
        List<User> user = userService.selectAllUserList();
        JSONResult result = new JSONResult(user);
        return result;
        
    }
}
