package org.ylpro.service.tuser;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.tuser.TuserDao;

/**
 * 
 * <br>
 * <b>功能：</b>TuserService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("tuserService")
public class TuserService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TuserService.class);
	

	

	@Autowired
    private TuserDao<T> dao;

		
	public TuserDao<T> getDao() {
		return dao;
	}

}
