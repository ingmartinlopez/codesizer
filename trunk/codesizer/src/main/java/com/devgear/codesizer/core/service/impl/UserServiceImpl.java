/**
 * 
 */
package com.devgear.codesizer.core.service.impl;

import org.springframework.stereotype.Service;

import com.devgear.codesizer.core.dao.IUserDao;
import com.devgear.codesizer.core.service.IUserService;
import com.devgear.codesizer.core.util.service.BaseService;
import com.devgear.codesizer.model.User;

/**
 * @author mlopez
 * 
 */
@Service("UserService")
public class UserServiceImpl extends BaseService<User, Integer, IUserDao> implements IUserService {
		
}
