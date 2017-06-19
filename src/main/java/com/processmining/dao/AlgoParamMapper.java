package com.processmining.dao;

import com.processmining.entity.AlgoParam;

public interface AlgoParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlgoParam record);

    int insertSelective(AlgoParam record);

    AlgoParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlgoParam record);

    int updateByPrimaryKey(AlgoParam record);
}