package com.processmining.dao;

import com.processmining.entity.NormLogToEventLog;

public interface NormLogToEventLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NormLogToEventLog record);

    int insertSelective(NormLogToEventLog record);

    NormLogToEventLog selectByPrimaryKey(Integer id);
    
    NormLogToEventLog selectByNormLogId(Integer NormLogId);
    
    NormLogToEventLog selectByEventLogId(Integer EventLogId);

    int updateByPrimaryKeySelective(NormLogToEventLog record);

    int updateByPrimaryKey(NormLogToEventLog record);
}