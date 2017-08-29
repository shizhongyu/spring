package com.itheima.bos.service.impl;

import com.itheima.bos.dao.IStaffDao;
import com.itheima.bos.domain.BcStaff;
import com.itheima.bos.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class StaffServiceImpl implements IStaffService {
	@Autowired
	private IStaffDao staffDao;
	public void save(BcStaff model) {
		staffDao.save(model);
	}
}
