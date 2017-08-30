package com.itheima.bos.service.impl;

import java.util.List;

import com.itheima.bos.domain.BcRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.IRegionDao;
import com.itheima.bos.service.IRegionService;
import com.itheima.bos.utils.PageBean;
@Service
@Transactional
public class RegionServiceImpl implements IRegionService{
	@Autowired
	private IRegionDao regionDao;
	/**
	 * 区域数据批量保存
	 */
	public void saveBatch(List<BcRegion> regionList) {
		for (BcRegion region : regionList) {
			regionDao.saveOrUpdate(region);
		}
	}
	
	/**
	 * 区域分页查询
	 */
	public void pageQuery(PageBean pageBean) {
		regionDao.pageQuery(pageBean);
	}

	/**
	 * 查询所有区域
	 */
	public List<BcRegion> findAll() {
		return regionDao.findAll();
	}

	/***
	 * 根据页面输入进行模糊查询
	 */
	public List<BcRegion> findListByQ(String q) {
		return regionDao.findListByQ(q);
	}
}
