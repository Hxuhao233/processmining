package com.processmining.dao;

import com.processmining.entity.RawlogToEventLog;

public interface RawlogToEventLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawlogToEventLog record);

    int insertSelective(RawlogToEventLog record);

    RawlogToEventLog selectByPrimaryKey(Integer id);
    
    RawlogToEventLog selectByRawLogId(Integer rawLogId);

    RawlogToEventLog selectByEventLogId(Integer eventLogId);

    int updateByPrimaryKeySelective(RawlogToEventLog record);

    int updateByPrimaryKey(RawlogToEventLog record);
}