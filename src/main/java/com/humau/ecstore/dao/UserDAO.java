package com.humau.ecstore.dao;

import com.humau.ecstore.model.User;

public interface UserDAO {
	 
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
     
     
}
