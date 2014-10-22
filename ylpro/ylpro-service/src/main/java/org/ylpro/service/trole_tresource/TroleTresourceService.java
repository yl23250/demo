package org.ylpro.service.trole_tresource;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.trole_tresource.TroleTresourceDao;

/**
 * 
 * <br>
 * <b>功能：</b>TroleTresourceService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("troleTresourceService")
public class TroleTresourceService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TroleTresourceService.class);
	

	

	@Autowired
    private TroleTresourceDao<T> dao;

		
	public TroleTresourceDao<T> getDao() {
		return dao;
	}

}
