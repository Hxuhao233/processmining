package com.processmining.dao;

import com.processmining.entity.RawLogToNormLog;

public interface RawLogToNormLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawLogToNormLog record);

    int insertSelective(RawLogToNormLog record);

    RawLogToNormLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RawLogToNormLog record);

    int updateByPrimaryKey(RawLogToNormLog record);
}