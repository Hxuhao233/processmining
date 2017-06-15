package com.processmining.dao;

import java.util.List;

import com.processmining.entity.OriginalLog;

public interface OriginalLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OriginalLog record);

    int insertSelective(OriginalLog record);

    OriginalLog selectByPrimaryKey(Integer id);

    List<OriginalLog> selectByName(String name);			// 模糊搜索
    
    int updateByPrimaryKeySelective(OriginalLog record);

    int updateByPrimaryKey(OriginalLog record);
}