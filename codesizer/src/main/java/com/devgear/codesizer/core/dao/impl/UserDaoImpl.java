/**
 * 
 */
package com.devgear.codesizer.core.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devgear.codesizer.core.dao.IUserDao;
import com.devgear.codesizer.model.User;
import com.googlecode.genericdao.dao.jpa.GenericDAOImpl;

/**
 * @author mlopez
 *
 */
@Component
public class UserDaoImpl extends GenericDAOImpl<User, Integer> implements IUserDao {

	@Override
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
	}
	
}
