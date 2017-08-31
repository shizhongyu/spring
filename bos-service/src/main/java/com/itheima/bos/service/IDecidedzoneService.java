package com.itheima.bos.service;

import com.itheima.bos.domain.BcDecidedzone;
import com.itheima.bos.utils.PageBean;
public interface IDecidedzoneService {

	public void save(BcDecidedzone model, String[] subareaid);

	public void pageQuery(PageBean pageBean);

}
