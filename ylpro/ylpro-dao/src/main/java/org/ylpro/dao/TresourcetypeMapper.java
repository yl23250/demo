package org.ylpro.dao;

import org.ylpro.model.Tresourcetype;

public interface TresourcetypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tresourcetype record);

    int insertSelective(Tresourcetype record);

    Tresourcetype selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tresourcetype record);

    int updateByPrimaryKey(Tresourcetype record);
}