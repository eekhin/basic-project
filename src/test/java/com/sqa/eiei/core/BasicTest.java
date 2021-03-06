/**
 * File Name: BasicTest.java<br>
 * KHIN, EI EI<br>
 * Created: Sep 6, 2017
 */
package com.sqa.eiei.core;

import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

/**
 * BasicTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author KHIN, EI EI
 * @version 1.0.0
 * @since 1.0
 */
public class BasicTest extends Core {

	public BasicTest(String baseUrl) {
		super(baseUrl);
	}

	@BeforeClass
	public void setupDriver() {
		this.driver = new FirefoxDriver();
	}

	@BeforeMethod
	public void setupTest() {
		getDriver().get(getBaseUrl());
	}

	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
}
