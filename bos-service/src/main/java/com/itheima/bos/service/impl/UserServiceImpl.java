package com.itheima.bos.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.IUserDao;
import com.itheima.bos.domain.User;
import com.itheima.bos.service.IUserService;
import com.itheima.bos.utils.MD5Utils;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	/***
	 * 用户登录
	 */
	public User login(User user) {
//		//使用MD5加密密码
		String password = MD5Utils.md5(user.getPassword());
		return userDao.findUserByUsernameAndPassword(user.getUsername(),password);
	}

	//	@Resource(type = UserServiceImpl.class)
	@Autowired
	@Qualifier("UserDaoImpl")
	private  IUserDao userDao;
}