package com.itheima.bos.dao;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.AuthFunction;

import java.util.List;

public interface IFunctionDao extends IBaseDao<AuthFunction> {
    public List<AuthFunction> findFunctionListByUserId(String id);
    public List<AuthFunction> findAllMenu();
    public List<AuthFunction> findMenuByUserId(String id);
}
