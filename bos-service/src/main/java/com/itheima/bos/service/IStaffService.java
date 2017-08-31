package com.itheima.bos.service;

import com.itheima.bos.domain.BcStaff;
import com.itheima.bos.utils.PageBean;

import java.util.List;

public interface IStaffService {

	void save(BcStaff model);

	void pageQuery(PageBean pageBean);

	void deleteBatch(String ids);

	BcStaff findById(String id);

	void update(BcStaff staff);

	public List<BcStaff> findListNotDelete();

}
