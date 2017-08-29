package com.itheima.bos.web.action;

import com.itheima.bos.domain.BcStaff;
import com.itheima.bos.service.IStaffService;
import com.itheima.bos.web.action.base.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * 取派员管理
 * @author zhaoqx
 *
 */
@Controller
@Scope("prototype")
public class StaffAction extends BaseAction<BcStaff>{
	@Autowired
	private IStaffService staffService;
	
	/**
	 * 添加取派员
	 */
	public String add(){
		staffService.save(model);
		return LIST;
	}
}
