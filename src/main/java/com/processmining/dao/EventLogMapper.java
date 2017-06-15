package com.processmining.dao;

import java.util.List;

import com.processmining.entity.EventLog;

public interface EventLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EventLog record);

    int insertSelective(EventLog record);

    EventLog selectByPrimaryKey(Integer id);
    
    List<EventLog> selectByName(String name);				// 模糊搜索

    int updateByPrimaryKeySelective(EventLog record);

    int updateByPrimaryKey(EventLog record);
}