package com.processmining.dao;

import com.processmining.entity.Algo;

public interface AlgoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Algo record);

    int insertSelective(Algo record);

    Algo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Algo record);

    int updateByPrimaryKey(Algo record);
}