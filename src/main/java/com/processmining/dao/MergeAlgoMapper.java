package com.processmining.dao;

import com.processmining.entity.MergeAlgo;

public interface MergeAlgoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MergeAlgo record);

    int insertSelective(MergeAlgo record);

    MergeAlgo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MergeAlgo record);

    int updateByPrimaryKey(MergeAlgo record);
}