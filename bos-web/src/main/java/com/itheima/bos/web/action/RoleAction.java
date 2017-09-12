package com.itheima.bos.web.action;

import com.itheima.bos.domain.AuthRole;
import com.itheima.bos.service.IRoleService;
import com.itheima.bos.web.action.base.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * 角色管理
 * @author zhaoqx
 *
 */
@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<AuthRole>{
	//属性驱动，接收权限的id
	private String functionIds;
	
	@Autowired
	private IRoleService service;
	
	public void setFunctionIds(String functionIds) {
		this.functionIds = functionIds;
	}
	
	/**
	 * 添加角色
	 */
	public String add(){
		service.save(model,functionIds);
		return LIST;
	}
	
	/**
	 * 分页查询
	 */
	public String pageQuery(){
		service.pageQuery(pageBean);
		this.java2Json(pageBean, new String[]{"functions","users"});
		return NONE;
	}
	
	/**
	 * 查询所有的角色数据，返回json
	 */
	public String listajax(){
		List<AuthRole> list = service.findAll();
		this.java2Json(list, new String[]{"functions","users"});
		return NONE;
	}
}
