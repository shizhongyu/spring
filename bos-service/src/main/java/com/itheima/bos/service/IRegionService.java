package com.itheima.bos.service;

import com.itheima.bos.domain.BcRegion;
import com.itheima.bos.utils.PageBean;

import java.util.List;

public interface IRegionService {

	public void saveBatch(List<BcRegion> regionList);

	public void pageQuery(PageBean pageBean);

	public List<BcRegion> findAll();

	public List<BcRegion> findListByQ(String q);

}
