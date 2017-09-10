package com.itheima.bos.web.action;

import com.itheima.bos.domain.AuthFunction;
import com.itheima.bos.service.IFunctionService;
import com.itheima.bos.web.action.base.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * 权限管理
 * @author zhaoqx
 *
 */
@Controller
@Scope("prototype")
public class FunctionAction extends BaseAction<AuthFunction>{
	@Autowired
	private IFunctionService service;
	/**
	 * 查询所有权限，返回json数据
	 */
	public String listajax(){
		List<AuthFunction> list = service.findAll();
		this.java2Json(list, new String[]{"parentFunction","roles","children"});
		return NONE;
	}
	
	/**
	 * 添加权限 
	 */
	public String add(){
		service.save(model);
		return LIST;
	}
	
	public String pageQuery(){
		String page = model.getPage();
		pageBean.setCurrentPage(Integer.parseInt(page));
		service.pageQuery(pageBean);
		this.java2Json(pageBean, new String[]{"parentFunction","roles","children"});
		return NONE;
	}
}
