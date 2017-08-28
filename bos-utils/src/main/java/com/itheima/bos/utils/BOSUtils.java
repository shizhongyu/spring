package com.itheima.bos.utils;

import com.itheima.bos.domain.TUser;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * BOS项目的工具类
 * @author zhaoqx
 *
 */
public class BOSUtils {
	//获取session对象
	public static HttpSession getSession(){
		return ServletActionContext.getRequest().getSession();
	}
	//获取登录用户对象
	public static TUser getLoginUser(){
		return (TUser) getSession().getAttribute("loginUser");
	}
}
