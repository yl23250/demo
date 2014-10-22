package org.ylpro.service.tbugtype;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.tbugtype.TbugtypeDao;

/**
 * 
 * <br>
 * <b>功能：</b>TbugtypeService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("tbugtypeService")
public class TbugtypeService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TbugtypeService.class);
	

	

	@Autowired
    private TbugtypeDao<T> dao;

		
	public TbugtypeDao<T> getDao() {
		return dao;
	}

}
