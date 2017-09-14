package com.itheima.bos.service.impl;

import com.itheima.bos.dao.IFunctionDao;
import com.itheima.bos.domain.AuthFunction;
import com.itheima.bos.domain.TUser;
import com.itheima.bos.service.IFunctionService;
import com.itheima.bos.utils.BOSUtils;
import com.itheima.bos.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class FunctionServiceImpl implements IFunctionService {
	@Autowired
	private IFunctionDao dao;
	public List<AuthFunction> findAll() {
		return dao.findAll();
	}
	
	//添加权限
	public void save(AuthFunction model) {
		AuthFunction parentFunction = model.getParentFunction();
		if(parentFunction != null && parentFunction.getId().equals("")){
			model.setParentFunction(null);
		}
		dao.save(model);
	}

	public void pageQuery(PageBean pageBean) {
		dao.pageQuery(pageBean);
	}

	/**
	 * 根据当前登录人查询对应的菜单数据，返回json
	 */
	public List<AuthFunction> findMenu() {
		List<AuthFunction> list = null;
		TUser user = BOSUtils.getLoginUser();
		if(user.getUsername().equals("admin")){
			//如果是超级管理员内置用户，查询所有菜单
			list = dao.findAllMenu();
		}else{
			//其他用户，根据用户id查询菜单
			list = dao.findMenuByUserId(user.getId());
		}
		return list;
	}
}
