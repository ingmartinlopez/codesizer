/**
 * 
 */
package com.devgear.codesizer.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author mlopez
 * 
 */
public class BaseTestCase {

	protected ApplicationContext appctx;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		appctx = new FileSystemXmlApplicationContext(new String[] { "src/main/webapp/WEB-INF/general-appctx.xml",
				"src/main/webapp/WEB-INF/security-appctx.xml",
				"src/test/resources/database-appctx.xml"});
		
		

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
