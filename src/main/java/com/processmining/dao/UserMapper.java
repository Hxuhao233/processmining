package com.processmining.dao;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 0f9d0d729dd590001da30d8de7cf2e04d5337cab
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