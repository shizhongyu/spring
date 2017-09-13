package com.itheima.bos.service;

import com.itheima.bos.domain.TUser;
import com.itheima.bos.utils.PageBean;

public interface IUserService {

	TUser login(TUser model);

	void editPassword(String id, String password);

	public void save(TUser model, String[] roleIds);

	public void pageQuery(PageBean pageBean);
}
