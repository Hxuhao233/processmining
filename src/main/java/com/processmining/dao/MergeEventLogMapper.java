package com.processmining.dao;

import com.processmining.entity.MergeEventLog;

public interface MergeEventLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MergeEventLog record);

    int insertSelective(MergeEventLog record);

    MergeEventLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MergeEventLog record);

    int updateByPrimaryKey(MergeEventLog record);
}