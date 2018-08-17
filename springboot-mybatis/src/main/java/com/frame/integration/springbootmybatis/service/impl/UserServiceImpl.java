package com.frame.integration.springbootmybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frame.integration.springbootmybatis.dao.UserDao;
import com.frame.integration.springbootmybatis.entity.User;
import com.frame.integration.springbootmybatis.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    
    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int deleteByPrimarykey(int user_id) {
        return userDao.deleteByPrimarykey(user_id);
    }

    @Override
    public int updateUserByPrimarykey(User user) {
        return userDao.updateUserByPrimarykey(user);
    }

    @Override
    public User selectUserByPrimarykey(int user_id) {
        return userDao.selectUserByPrimarykey(user_id);
    }

    @Override
    public List<User> selectAllUserList() {
        return userDao.selectAllUserList();
    }

}
