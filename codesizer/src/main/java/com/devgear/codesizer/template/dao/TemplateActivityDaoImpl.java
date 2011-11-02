/**
 * 
 */
package com.devgear.codesizer.template.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devgear.codesizer.model.TemplateActivity;
import com.googlecode.genericdao.dao.jpa.GenericDAOImpl;
import com.googlecode.genericdao.search.jpa.JPASearchProcessor;

/**
 * @author mlopez
 *
 */
@Component
public class TemplateActivityDaoImpl extends GenericDAOImpl<TemplateActivity, Integer> implements ITemplateActivityDao {

	@Override
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
	}
	
	@Override
	@Autowired
	public void setSearchProcessor(JPASearchProcessor searchProcessor) {
		super.setSearchProcessor(searchProcessor);
	}
}
