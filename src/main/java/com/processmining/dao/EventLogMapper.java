package com.processmining.dao;

import com.processmining.entity.EventLog;

public interface EventLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EventLog record);

    int insertSelective(EventLog record);

    EventLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EventLog record);

    int updateByPrimaryKey(EventLog record);
}