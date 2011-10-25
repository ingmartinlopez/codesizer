/**
 * 
 */
package com.devgear.codesizer.core.service.impl;

import org.junit.Test;

import com.devgear.codesizer.core.service.IUserService;
import com.devgear.codesizer.test.BaseTestCase;

/**
 * @author mlopez
 *
 */
public class UserServiceImplTest extends BaseTestCase {

	/**
	 * Test method for {@link com.devgear.codesizer.core.util.service.BaseService#save(java.lang.Object)}.
	 */
	@Test
	public void testSaveT() {
		
		IUserService us = (IUserService) appctx.getBean("UserService");
		us.find(1);
		
	}

}
