package com.processmining.dao;

import com.processmining.entity.RawLogToNormLog;

public interface RawLogToNormLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawLogToNormLog record);

    int insertSelective(RawLogToNormLog record);

    RawLogToNormLog selectByPrimaryKey(Integer id);
    
    RawLogToNormLog selectByRawLogId(Integer rawLogId);
    
    RawLogToNormLog selectByNormLogId(Integer normLogId);

    int updateByPrimaryKeySelective(RawLogToNormLog record);

    int updateByPrimaryKey(RawLogToNormLog record);
}