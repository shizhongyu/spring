package com.itheima.bos.service.impl;

import com.itheima.bos.dao.IWorkordermanageDao;
import com.itheima.bos.domain.QpWorkordermanage;
import com.itheima.bos.service.IWorkordermanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class WorkordermanageServiceImpl implements IWorkordermanageService {
	@Autowired
	private IWorkordermanageDao workordermanageDao;
	public void save(QpWorkordermanage model) {
		workordermanageDao.save(model);
	}
}
