package com.itheima.bos.service.impl;

import com.itheima.bos.dao.IFunctionDao;
import com.itheima.bos.domain.AuthFunction;
import com.itheima.bos.service.IFunctionService;
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
}
