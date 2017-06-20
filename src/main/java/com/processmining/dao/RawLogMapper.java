package com.processmining.dao;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 0f9d0d729dd590001da30d8de7cf2e04d5337cab
import com.processmining.entity.RawLog;

public interface RawLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawLog record);

    int insertSelective(RawLog record);

    RawLog selectByPrimaryKey(Integer id);
    
    List<RawLog> selectAll();

    int updateByPrimaryKeySelective(RawLog record);

    int updateByPrimaryKey(RawLog record);
}