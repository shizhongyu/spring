package com.itheima.bos.web.action;

import com.itheima.bos.domain.QpNoticebill;
import com.itheima.bos.service.INoticebillService;
import com.itheima.bos.web.action.base.BaseAction;
import com.itheima.crm.Customer;
import com.itheima.crm.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * 业务通知单管理
 *
 * @author zhaoqx
 */
@Controller
@Scope("prototype")
public class NoticebillAction extends BaseAction<QpNoticebill>{
	//注入crm客户端代理对象
	@Autowired
	private ICustomerService customerService;
	
	/**
	 * 远程调用crm服务，根据手机号查询客户信息
	 */
	public String findCustomerByTelephone(){
		String telephone = model.getTelephone();
		Customer customer = customerService.findCustomerByTelephone(telephone);
		this.java2Json(customer, new String[]{});
		return NONE;
	}
	
	@Autowired
	private INoticebillService noticebillService;
	
	/**
	 * 保存一个业务通知单，并尝试自动分单
	 */
	public String add(){
		noticebillService.save(model);
		return "noticebill_add";
	}
}
