package org.ylpro.dao;

import org.ylpro.model.TuserRoleKey;

public interface TuserRoleMapper {
    int deleteByPrimaryKey(TuserRoleKey key);

    int insert(TuserRoleKey record);

    int insertSelective(TuserRoleKey record);
}