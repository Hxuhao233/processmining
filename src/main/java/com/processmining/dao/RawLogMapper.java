package com.processmining.dao;

import com.processmining.entity.RawLog;

public interface RawLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawLog record);

    int insertSelective(RawLog record);

    RawLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RawLog record);

    int updateByPrimaryKey(RawLog record);
}