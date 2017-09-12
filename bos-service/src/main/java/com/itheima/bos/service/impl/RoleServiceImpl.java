package com.itheima.bos.service.impl;

import com.itheima.bos.dao.IRoleDao;
import com.itheima.bos.domain.AuthFunction;
import com.itheima.bos.domain.AuthRole;
import com.itheima.bos.service.IRoleService;
import com.itheima.bos.utils.PageBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private IRoleDao dao;
	/**
	 * 保存一个角色，同时还需要关联权限
	 */
	public void save(AuthRole role, String functionIds) {
		dao.save(role);
		if(StringUtils.isNotBlank(functionIds)){
			String[] fIds = functionIds.split(",");
			for (String functionId : fIds) {
				//手动构造一个权限对象，设置id，对象状态为托管状态
				AuthFunction function = new AuthFunction(functionId);
				//角色关联权限
				role.getFunctions().add(function);
			}
		}
	}
	
	/**
	 * 分页查询
	 */
	public void pageQuery(PageBean pageBean) {
		dao.pageQuery(pageBean);
	}

	public List<AuthRole> findAll() {
		return dao.findAll();
	}
}
