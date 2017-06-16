package com.processmining.dao;

import com.processmining.entity.NormLog;

public interface NormLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NormLog record);

    int insertSelective(NormLog record);

    NormLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NormLog record);

    int updateByPrimaryKey(NormLog record);
}