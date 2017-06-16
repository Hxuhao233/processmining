package com.processmining.dao;

import com.processmining.entity.MiningAlgoParam;

public interface MiningAlgoParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MiningAlgoParam record);

    int insertSelective(MiningAlgoParam record);

    MiningAlgoParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MiningAlgoParam record);

    int updateByPrimaryKey(MiningAlgoParam record);
}