package org.ylpro.dao;

import org.ylpro.model.Tresource;

public interface TresourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tresource record);

    int insertSelective(Tresource record);

    Tresource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tresource record);

    int updateByPrimaryKey(Tresource record);
}