package testsuites;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import po.loginpo;
import po.quote;
import po.verticalmenupo;

public class quote_test extends quote{


	loginpo lo = new loginpo();
	verticalmenupo vo = new verticalmenupo();
	
	
	@BeforeClass
	public void login() {
		
		loadApplication("browser", "urlKey");
		String header = lo.login("Dealer7032823", "4558600");
	}
	
	
	@Test(priority = 1)
    public void createQuote1() throws InterruptedException {
		
		vo.navigatetoContract();
		String text = createQuote();
		Assert.assertEquals(text, "You have successfully generated a contract!");
	    
	}
	
	
	@AfterClass
	public void close() {

		lo.logout();
		driver.close();
		driver = null;
	}

}
