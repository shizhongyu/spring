package com.itheima.bos.service.impl;


import com.itheima.bos.dao.IUserDao;
import com.itheima.bos.domain.AuthRole;
import com.itheima.bos.domain.TUser;
import com.itheima.bos.service.IUserService;
import com.itheima.bos.utils.MD5Utils;
import com.itheima.bos.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private  IUserDao userDao;
	/***
	 * 用户登录
	 */
	public TUser login(TUser user) {


		//使用MD5加密密码
		String password = MD5Utils.md5(user.getPassword());
		password = user.getPassword();
		return userDao.findUserByUsernameAndPassword(user.getUsername(),password);
	}
	/**
	 * 根据用户id修改密码
	 */
	public void editPassword(String id, String password) {
		//使用MD5加密密码
		password = MD5Utils.md5(password);
		userDao.executeUpdate("user.editpassword", password,id);
	}

	/**
	 * 添加一个用户，同时关联角色
	 */
	public void save(TUser user, String[] roleIds) {
		String password = user.getPassword();
//		password = MD5Utils.md5(password);
		user.setPassword(password);
		userDao.save(user);
		if(roleIds != null && roleIds.length > 0){
			for (String roleId : roleIds) {
				//手动构造托管对象
				AuthRole role = new AuthRole(roleId);
				//用户对象关联角色对象
				user.getRoles().add(role);
			}
		}
	}

	/**
	 * 分页查询
	 */
	public void pageQuery(PageBean pageBean) {
		userDao.pageQuery(pageBean);
	}
}

