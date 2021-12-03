package testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.loginpo;
import utils.BaseClass;

public class login_test extends loginpo{
	
	


	@Test (priority = 1)
	public void welcomePage() {
		
		loadApplication("browser", "urlKey");
		Assert.assertEquals(getTitle(), "AUL Corp.");	
		
	}
	
	@Test (priority = 2)
	@Parameters({"username", "password"})
    public void loggedIn(String user, String pass) throws InterruptedException {
	
		String header = login(user, pass);
		Assert.assertEquals(header, "Dashboard");
		
	}
	
	@Test(priority = 3)
     public void logout1() {
		
		logout();
		
	}

	
	@AfterClass
	public void close() {

		driver.close();
		driver = null;
	}

}
