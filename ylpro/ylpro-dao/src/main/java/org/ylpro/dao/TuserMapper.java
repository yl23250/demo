package org.ylpro.dao;

import org.ylpro.model.Tuser;

public interface TuserMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
}