package org.ylpro.service.tresourcetype;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.tresourcetype.TresourcetypeDao;

/**
 * 
 * <br>
 * <b>功能：</b>TresourcetypeService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("tresourcetypeService")
public class TresourcetypeService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TresourcetypeService.class);
	

	

	@Autowired
    private TresourcetypeDao<T> dao;

		
	public TresourcetypeDao<T> getDao() {
		return dao;
	}

}
