package com.processmining.dao;


import java.util.List;

import com.processmining.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByEmailAndPassword(User user);
    
    boolean isExistEmail(String email);
    
    boolean isExistNickname(String nickname);
    
    List<User> selectAll();
    
    List<User> selectAllNormalUser();
}