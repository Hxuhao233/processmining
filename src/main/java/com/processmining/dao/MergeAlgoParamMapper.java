package com.processmining.dao;

import com.processmining.entity.MergeAlgoParam;

public interface MergeAlgoParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MergeAlgoParam record);

    int insertSelective(MergeAlgoParam record);

    MergeAlgoParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MergeAlgoParam record);

    int updateByPrimaryKey(MergeAlgoParam record);
}