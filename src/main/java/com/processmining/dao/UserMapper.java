package com.processmining.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.processmining.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    User selectByEmailAndPassword(@Param("userName") String email,@Param("password")String password);
    
    List<User> selectAll();
     
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}