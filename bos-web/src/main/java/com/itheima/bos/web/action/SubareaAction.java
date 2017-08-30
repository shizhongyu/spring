package com.itheima.bos.web.action;

import com.itheima.bos.domain.BcSubarea;
import com.itheima.bos.service.ISubareaService;
import com.itheima.bos.web.action.base.BaseAction;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
@Controller
@Scope("prototype")
public class SubareaAction extends BaseAction<BcSubarea>{
	@Resource
	private ISubareaService subareaService;
	/**
	 * 添加分区
	 */
	public String add(){
		subareaService.save(model);
		return LIST;
	}
}
