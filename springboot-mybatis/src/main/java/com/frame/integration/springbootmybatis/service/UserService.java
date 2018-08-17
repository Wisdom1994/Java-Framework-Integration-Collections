package com.frame.integration.springbootmybatis.service;

import java.util.List;

import com.frame.integration.springbootmybatis.entity.User;

public interface UserService {
    // 增 insert
    int insertUser(User user);
    
    // 删 delete
    int deleteByPrimarykey(int user_id);
    
    // 改 update
    int updateUserByPrimarykey(User user);
    
    // 查 select
    User selectUserByPrimarykey(int user_id);
    List<User> selectAllUserList();
}
