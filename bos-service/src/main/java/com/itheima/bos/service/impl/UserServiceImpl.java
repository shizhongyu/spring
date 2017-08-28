package com.itheima.bos.service.impl;


import com.itheima.bos.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.IUserDao;
import com.itheima.bos.service.IUserService;
import com.itheima.bos.utils.MD5Utils;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	/***
	 * 用户登录
	 */
	public TUser login(TUser user) {


//		//使用MD5加密密码
		String password = MD5Utils.md5(user.getPassword());
		password = user.getPassword();
		return userDao.findUserByUsernameAndPassword(user.getUsername(),password);
	}

	@Autowired
	private  IUserDao userDao;
}
