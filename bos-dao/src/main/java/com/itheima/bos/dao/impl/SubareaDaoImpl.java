package com.itheima.bos.dao.impl;

import com.itheima.bos.dao.ISubareaDao;
import com.itheima.bos.dao.base.impl.BaseDaoImpl;
import com.itheima.bos.domain.BcSubarea;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubareaDaoImpl extends BaseDaoImpl<BcSubarea> implements ISubareaDao {
    public List<Object> findSubareasGroupByProvince() {
        String hql = "SELECT r.province ,count(*) FROM BcSubarea s LEFT OUTER JOIN s.region r Group BY r.province";
        return (List<Object>) this.getHibernateTemplate().find(hql);
    }
}
