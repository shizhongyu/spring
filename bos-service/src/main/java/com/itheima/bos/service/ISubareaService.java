package com.itheima.bos.service;

import com.itheima.bos.domain.BcSubarea;
import com.itheima.bos.utils.PageBean;

import java.util.List;

public interface ISubareaService {

	public void save(BcSubarea model);

	public void pageQuery(PageBean pageBean);

	public List<BcSubarea> findAll();

	public List<BcSubarea> findListNotAssociation();

}
