package org.ylpro.dao;

import org.ylpro.model.Tbug;

public interface TbugMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tbug record);

    int insertSelective(Tbug record);

    Tbug selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tbug record);

    int updateByPrimaryKeyWithBLOBs(Tbug record);

    int updateByPrimaryKey(Tbug record);
}