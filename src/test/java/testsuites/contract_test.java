/**
 * 
 */
package testsuites;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import po.contractpo;
import po.loginpo;
import po.verticalmenupo;

/**
 * @author ankit.srivastava
 *
 */
public class contract_test extends contractpo{

	loginpo lo = new loginpo();
	verticalmenupo vo = new verticalmenupo();
	
	
	@BeforeClass
	public void login() {
		
		loadApplication("browser", "urlKey");
		String header = lo.login("Dealer7032823", "4558600");
	}
	
	
	@Test(priority = 1)
    public void createContract1() throws InterruptedException {
		
		vo.navigatetoContract();
		String text = createContract();
		Assert.assertEquals(text, "You have successfully generated a contract!");
	    
	}
	
	
	@AfterClass
	public void close() {

		lo.logout();
		driver.close();
		driver = null;
	}


}
