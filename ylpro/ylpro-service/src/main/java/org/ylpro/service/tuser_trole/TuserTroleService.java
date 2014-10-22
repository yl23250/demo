package org.ylpro.service.tuser_trole;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.tuser_trole.TuserTroleDao;

/**
 * 
 * <br>
 * <b>功能：</b>TuserTroleService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("tuserTroleService")
public class TuserTroleService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TuserTroleService.class);
	

	

	@Autowired
    private TuserTroleDao<T> dao;

		
	public TuserTroleDao<T> getDao() {
		return dao;
	}

}
