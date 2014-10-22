package org.ylpro.dao;

import org.ylpro.model.Trole;

public interface TroleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Trole record);

    int insertSelective(Trole record);

    Trole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Trole record);

    int updateByPrimaryKey(Trole record);
}