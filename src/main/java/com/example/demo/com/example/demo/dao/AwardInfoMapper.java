package com.example.demo.dao;

import com.example.demo.model.AwardInfo;

public interface AwardInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AwardInfo record);

    int insertSelective(AwardInfo record);

    AwardInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AwardInfo record);

    int updateByPrimaryKey(AwardInfo record);
}