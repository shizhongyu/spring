package com.itheima.bos.service.impl;

import com.itheima.bos.dao.ISubareaDao;
import com.itheima.bos.domain.BcSubarea;
import com.itheima.bos.service.ISubareaService;
import com.itheima.bos.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SubareaServiceImpl implements ISubareaService {
	@Autowired
	private ISubareaDao subareaDao;
	public void save(BcSubarea model) {
		subareaDao.save(model);
	}


	public void pageQuery(PageBean pageBean) {
		subareaDao.pageQuery(pageBean);
	}

	public List<BcSubarea> findAll() {
		return subareaDao.findAll();
	}

	/**
	 * 查询所有未关联到定区的分区
	 */
	public List<BcSubarea> findListNotAssociation() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(BcSubarea.class);
		//添加过滤条件,分区对象中decidedzone属性为null
		detachedCriteria.add(Restrictions.isNull("decidedzone"));
		return subareaDao.findByCriteria(detachedCriteria);
	}

	//@Autowired
	//private IDecidedzoneDao decidedzoneDao;

	/**
	 * 根据定区id查询关联的分区
	 */
	public List<BcSubarea> findListByDecidedzoneId(String decidedzoneId) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(BcSubarea.class);
		//添加过滤条件
		detachedCriteria.add(Restrictions.eq("decidedzone.id", decidedzoneId));
		return subareaDao.findByCriteria(detachedCriteria );
	}

	public List<Object> findSubareasGroupByProvince() {
		return subareaDao.findSubareasGroupByProvince();
	}
}
