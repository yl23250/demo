package org.ylpro.dao;

import org.ylpro.model.Tbugtype;

public interface TbugtypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tbugtype record);

    int insertSelective(Tbugtype record);

    Tbugtype selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tbugtype record);

    int updateByPrimaryKey(Tbugtype record);
}