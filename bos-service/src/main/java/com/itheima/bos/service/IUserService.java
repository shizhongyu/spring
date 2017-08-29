package com.itheima.bos.service;

import com.itheima.bos.domain.TUser;

public interface IUserService {

	TUser login(TUser model);

	void editPassword(String id, String password);
}
