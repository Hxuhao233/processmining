package com.processmining.dao;

import java.util.List;

import com.processmining.entity.StandardizedLog;

public interface StandardizedLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StandardizedLog record);

    int insertSelective(StandardizedLog record);

    StandardizedLog selectByPrimaryKey(Integer id);
    
    List<StandardizedLog> selectByName(String name);				// 模糊搜索

    int updateByPrimaryKeySelective(StandardizedLog record);

    int updateByPrimaryKey(StandardizedLog record);
}