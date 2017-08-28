package com.itheima.bos.dao.impl;

import java.util.List;

import com.itheima.bos.domain.TUser;
import org.springframework.stereotype.Repository;

import com.itheima.bos.dao.IUserDao;
import com.itheima.bos.dao.base.impl.BaseDaoImpl;

@Repository
public class UserDaoImpl extends BaseDaoImpl<TUser> implements IUserDao {
	/**
	 * 根据用户名和密码查询用户
	 */
	public TUser findUserByUsernameAndPassword(String username, String password) {
		String hql = "FROM TUser u WHERE u.username = ? AND u.password = ?";
		List<TUser> list = (List<TUser>) this.getHibernateTemplate().find(hql, username,password);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
}
