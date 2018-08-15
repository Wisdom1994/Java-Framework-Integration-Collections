package com.frame.integration.springbootmybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frame.integration.springbootmybatis.entity.User;

public interface UserDao {
    // 增 insert
    int insertUser(User user);
    
    // 删 delete
    int deleteByPrimarykey(@Param("user_id") int user_id);
    
    // 改 update
    int updateUserByPrimarykey(User user);
    
    // 查 select
    User selectUserByPrimarykey(@Param("user_id") int user_id);
    List<User> selectAllUserList();
}
