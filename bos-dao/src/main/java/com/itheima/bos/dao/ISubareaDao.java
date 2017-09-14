package com.itheima.bos.dao;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.BcSubarea;

import java.util.List;

public interface ISubareaDao extends IBaseDao<BcSubarea>{
    public List<Object> findSubareasGroupByProvince();
}
