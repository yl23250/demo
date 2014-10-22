package org.ylpro.service.tresource;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.tresource.TresourceDao;

/**
 * 
 * <br>
 * <b>功能：</b>TresourceService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("tresourceService")
public class TresourceService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TresourceService.class);
	

	

	@Autowired
    private TresourceDao<T> dao;

		
	public TresourceDao<T> getDao() {
		return dao;
	}

}
