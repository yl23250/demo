package org.ylpro.service.tbug;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylpro.dao.tbug.TbugDao;

/**
 * 
 * <br>
 * <b>功能：</b>TbugService<br>
 * <b>作者：</b>于磊<br>
 * <b>日期：</b> 2014/10/15 <br>
 */ 
@Service("tbugService")
public class TbugService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TbugService.class);
	

	

	@Autowired
    private TbugDao<T> dao;

		
	public TbugDao<T> getDao() {
		return dao;
	}

}
