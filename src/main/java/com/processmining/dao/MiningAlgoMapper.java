package com.processmining.dao;

import com.processmining.entity.MiningAlgo;

public interface MiningAlgoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MiningAlgo record);

    int insertSelective(MiningAlgo record);

    MiningAlgo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MiningAlgo record);

    int updateByPrimaryKey(MiningAlgo record);
}