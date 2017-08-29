package com.itheima.bos.dao.base;

import com.itheima.bos.utils.PageBean;

import java.io.Serializable;
import java.util.List;

/**
 * 持久层通用接口
 * @author zhaoqx
 *
 * @param <T>
 */
public interface IBaseDao<T> {
    void save(T entity);
	void delete(T entity);
	void update(T entity);
	T findById(Serializable id);
	List<T> findAll();
	void executeUpdate(String queryName, Object... objects);
	void  pageQuery(PageBean pageBean);
}
