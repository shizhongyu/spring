package com.itheima.bos.dao;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.TUser;

public interface IUserDao extends IBaseDao<TUser> {

	TUser findUserByUsernameAndPassword(String username, String password);

}
