package com.itheima.bos.dao.impl;

import com.itheima.bos.dao.IRegionDao;
import com.itheima.bos.dao.base.impl.BaseDaoImpl;
import com.itheima.bos.domain.BcRegion;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RegionDaoImpl extends BaseDaoImpl<BcRegion> implements IRegionDao {
	/**
	 * 根据q参数进行模糊查询
	 */
	public List<BcRegion> findListByQ(String q) {
		String hql = "FROM BcRegion r WHERE r.shortcode LIKE ? "
					+ "	OR r.citycode LIKE ? OR r.province LIKE ? "
					+ "OR r.city LIKE ? OR r.district LIKE ?";
		List<BcRegion> list = (List<BcRegion>) this.getHibernateTemplate().
				find(hql, "%"+q+"%","%"+q+"%","%"+q+"%","%"+q+"%","%"+q+"%");
		return list;
	}
}
