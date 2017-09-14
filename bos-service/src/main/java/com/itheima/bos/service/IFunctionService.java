package com.itheima.bos.service;

import com.itheima.bos.domain.AuthFunction;
import com.itheima.bos.utils.PageBean;

import java.util.List;

public interface IFunctionService {

	public List<AuthFunction> findAll();

	public void save(AuthFunction model);

	public void pageQuery(PageBean pageBean);

	public List<AuthFunction> findMenu();
}
