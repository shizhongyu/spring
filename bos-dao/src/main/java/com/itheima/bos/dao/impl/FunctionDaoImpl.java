package com.itheima.bos.dao.impl;

import com.itheima.bos.dao.IFunctionDao;
import com.itheima.bos.dao.base.impl.BaseDaoImpl;
import com.itheima.bos.domain.AuthFunction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FunctionDaoImpl extends BaseDaoImpl<AuthFunction> implements IFunctionDao {
    public List<AuthFunction> findAll() {
        String hql = "FROM AuthFunction f WHERE f.parentFunction IS NULL";
        List<AuthFunction> list = (List<AuthFunction>) this.getHibernateTemplate().find(hql);
        return list;
    }

    // 根据用户id查询对应的权限
    public List<AuthFunction> findFunctionListByUserId(String userId) {
        String hql = "SELECT DISTINCT f FROM AuthFunction f LEFT OUTER JOIN f.roles"
                + " r LEFT OUTER JOIN r.users u WHERE u.id = ?";
        List<AuthFunction> list = (List<AuthFunction>) this.getHibernateTemplate().find(hql, userId);
        return list;
    }

    // 查询所有菜单
    public List<AuthFunction> findAllMenu() {
        String hql = "FROM AuthFunction f WHERE f.generatemenu = '1' ORDER BY f.zindex DESC";
        List<AuthFunction> list = (List<AuthFunction>) this.getHibernateTemplate().find(hql);
        return list;
    }

    //根据用户id查询菜单
    public List<AuthFunction> findMenuByUserId(String userId) {
        String hql = "SELECT DISTINCT f FROM AuthFunction f LEFT OUTER JOIN f.roles"
                + " r LEFT OUTER JOIN r.users u WHERE u.id = ? AND f.generatemenu = '1' "
                + "ORDER BY f.zindex DESC";
        List<AuthFunction> list = (List<AuthFunction>) this.getHibernateTemplate().find(hql, userId);
        return list;
    }
}
