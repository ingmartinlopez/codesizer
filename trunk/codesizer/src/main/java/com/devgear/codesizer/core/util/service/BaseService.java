/**
 * 
 */
package com.devgear.codesizer.core.util.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.googlecode.genericdao.dao.jpa.GenericDAO;
import com.googlecode.genericdao.search.ExampleOptions;
import com.googlecode.genericdao.search.Filter;
import com.googlecode.genericdao.search.ISearch;
import com.googlecode.genericdao.search.SearchResult;

/**
 * @author mlopez
 * 
 */
public abstract class BaseService<T, ID extends Serializable, Dao extends GenericDAO<T, ID>> implements IBaseService<T, ID, Dao> {

	protected Dao genericDao;

	public Dao getGenericDao() {
		return genericDao;
	}

	@Autowired
	public void setGenericDao(Dao genericDao) {
		this.genericDao = genericDao;
	}

	public T find(ID id) {
		return genericDao.find(id);
	}

	public T[] find(ID... ids) {
		return genericDao.find(ids);
	}

	public T getReference(ID id) {
		return genericDao.getReference(id);
	}

	public T[] getReferences(ID... ids) {
		return genericDao.getReferences(ids);
	}

	public void persist(T... entities) {
		genericDao.persist(entities);
	}

	public T merge(T entity) {
		return genericDao.merge(entity);
	}

	public T[] merge(T... entities) {
		return genericDao.merge(entities);
	}

	public T save(T entity) {
		return genericDao.save(entity);
	}

	public T[] save(T... entities) {
		return genericDao.save(entities);
	}

	public boolean remove(T entity) {
		return genericDao.remove(entity);
	}

	public void remove(T... entities) {
		genericDao.remove(entities);
	}

	public boolean removeById(ID id) {
		return genericDao.removeById(id);
	}

	public void removeByIds(ID... ids) {
		genericDao.removeByIds(ids);
	}

	public List<T> findAll() {
		return genericDao.findAll();
	}

	public <RT> List<RT> search(ISearch search) {
		return genericDao.search(search);
	}

	public <RT> RT searchUnique(ISearch search) {
		return genericDao.searchUnique(search);
	}

	public int count(ISearch search) {
		return genericDao.count(search);
	}

	public <RT> SearchResult<RT> searchAndCount(ISearch search) {
		return genericDao.searchAndCount(search);
	}

	public boolean isAttached(T entity) {
		return genericDao.isAttached(entity);
	}

	public void refresh(T... entities) {
		genericDao.refresh(entities);
	}

	public void flush() {
		genericDao.flush();
	}

	public Filter getFilterFromExample(T example) {
		return genericDao.getFilterFromExample(example);
	}

	public Filter getFilterFromExample(T example, ExampleOptions options) {
		return genericDao.getFilterFromExample(example, options);
	}

}
