package com.bky.service;

import java.util.List;

import com.bky.model.PageBean;
import com.bky.model.User;

public interface UserService {
	
	String addInfo(User addInfo);
	
	List<User> getAll();
	
	String delete(String id);
	
	User findById(String id);
	
	String update(User addInfo);

	PageBean getAllByPage(int pageNum,String userName);

	String updateIcon(User user);

}
