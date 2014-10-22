package org.ylpro.dao;

import org.ylpro.model.TroleTresourceKey;

public interface TroleTresourceMapper {
    int deleteByPrimaryKey(TroleTresourceKey key);

    int insert(TroleTresourceKey record);

    int insertSelective(TroleTresourceKey record);
}