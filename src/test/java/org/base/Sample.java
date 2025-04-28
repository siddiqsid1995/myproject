package org.base;

import java.util.Date;

import org.jspecify.annotations.Nullable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.pojo.LoginPojo;

public class Sample extends BaseClass {

	

	// valid username and valid password
	@Test
	public void tc1() {

		

	}

	// valid username and invalid password

	@Test
	public void tc2() {

		LoginPojo l1 = new LoginPojo();
		toFillInput(l1.getTxtUser(), "java");
		toFillInput(l1.getTxtPass(), "java@123");
		toClick(l1.getBtnLogin());

	}

}
