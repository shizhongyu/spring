package com.itheima.bos.web.action;

import com.itheima.bos.domain.BcStaff;
import com.itheima.bos.service.IStaffService;
import com.itheima.bos.web.action.base.BaseAction;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;

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


	/**
	 * 分页查询方法
	 * @throws IOException
	 */
	public String pageQuery() throws IOException {
		staffService.pageQuery(pageBean);
		this.java2Json(pageBean, new String[]{"currentPage","detachedCriteria","pageSize","decidedzones"});
		return NONE;
	}

	//属性驱动，接收页面提交的ids参数
	private String ids;

	/**
	 * 取派员批量删除
	 */
	@RequiresPermissions("staff-edit")
	public String deleteBatch(){
		staffService.deleteBatch(ids);
		return LIST;
	}

	/**
	 * 修改取派员信息
	 */
	public String edit(){
		//显查询数据库，根据id查询原始数据
		BcStaff staff = staffService.findById(model.getId());
		//使用页面提交的数据进行覆盖
		staff.setName(model.getName());
		staff.setTelephone(model.getTelephone());
		staff.setHaspda(model.getHaspda());
		staff.setStandard(model.getStandard());
		staff.setStation(model.getStation());
		staffService.update(staff);
		return LIST;
	}


	/**
	 * 查询所有未删除的取派员，返回json
	 */
	public String listajax(){
		List<BcStaff> list = staffService.findListNotDelete();
		this.java2Json(list, new String[]{"decidedzones"});
		return NONE;
	}

	/*public static void main(String[] args) {
		PageBean pageBean = new PageBean();
		pageBean.setCurrentPage(2);
		pageBean.setPageSize(30);
		String json = JSONObject.fromObject(pageBean ).toString();
		System.out.println(json);
	}*/


	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
}
