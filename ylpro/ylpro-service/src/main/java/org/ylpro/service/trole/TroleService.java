package org.ylpro.service.trole;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.trole.TroleDao;

/**
 * 
 * <br>
 * <b>功能：</b>TroleService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("troleService")
public class TroleService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TroleService.class);
	

	

	@Autowired
    private TroleDao<T> dao;

		
	public TroleDao<T> getDao() {
		return dao;
	}

}
