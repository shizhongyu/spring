package com.itheima.bos.dao;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.BcRegion;

import java.util.List;

public interface IRegionDao extends IBaseDao<BcRegion> {

	public List<BcRegion> findListByQ(String q);

}
