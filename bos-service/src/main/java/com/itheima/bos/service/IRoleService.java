package com.itheima.bos.service;

import com.itheima.bos.domain.AuthRole;
import com.itheima.bos.utils.PageBean;

import java.util.List;

public interface IRoleService {

	public void save(AuthRole role, String functionIds);

	public void pageQuery(PageBean pageBean);

	public List<AuthRole> findAll();

}
