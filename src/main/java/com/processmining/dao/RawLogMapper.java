package com.processmining.dao;


import java.util.List;

import com.processmining.entity.RawLog;

public interface RawLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawLog record);

    int insertSelective(RawLog record);

    RawLog selectByPrimaryKey(Integer id);
    
    List<RawLog> selectAll();
    
    List<RawLog> selectByName(String info);

    int updateByPrimaryKeySelective(RawLog record);

    int updateByPrimaryKey(RawLog record);
}