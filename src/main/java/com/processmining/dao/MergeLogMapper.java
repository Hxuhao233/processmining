package com.processmining.dao;

import com.processmining.entity.MergeLog;

public interface MergeLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MergeLog record);

    int insertSelective(MergeLog record);

    MergeLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MergeLog record);

    int updateByPrimaryKey(MergeLog record);
}