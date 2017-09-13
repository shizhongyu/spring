package com.itheima.bos.service;

import com.itheima.bos.dao.IFunctionDao;
import com.itheima.bos.dao.IUserDao;
import com.itheima.bos.domain.AuthFunction;
import com.itheima.bos.domain.TUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BOSRealm extends AuthorizingRealm{
	@Autowired
	private IUserDao userDao;
	@Autowired
	private IFunctionDao functionDao;
	//认证方法
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("自定义的realm中认证方法执行了。。。。");
		UsernamePasswordToken passwordToken = (UsernamePasswordToken)token;
		//获得页面输入的用户名
		String username = passwordToken.getUsername();
		//根据用户名查询数据库中的密码
		TUser user = userDao.findUserByUsername(username);
		if(user == null){
			//页面输入的用户名不存在
			return null;
		}
		//简单认证信息对象
		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
		//框架负责比对数据库中的密码和页面输入的密码是否一致
		return info;
	}

	//授权方法
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//获取当前登录用户对象
		TUser user = (TUser) SecurityUtils.getSubject().getPrincipal();
		//User user2 = (User) principals.getPrimaryPrincipal();
		// 根据当前登录用户查询数据库，获取实际对应的权限
		List<AuthFunction> list = null;
		if(user.getUsername().equals("admin")){
			DetachedCriteria detachedCriteria = DetachedCriteria.forClass(AuthFunction.class);
			//超级管理员内置用户，查询所有权限数据
			list = functionDao.findByCriteria(detachedCriteria);
		}else{
			list = functionDao.findFunctionListByUserId(user.getId());
		}

		for (AuthFunction function : list) {
			info.addStringPermission(function.getCode());
		}
		return info;
	}
}
