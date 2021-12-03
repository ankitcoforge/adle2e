package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.BaseClass;

public class loginpo extends BaseClass{
	

	public By userpass = By.tagName("input");
	public By submit = By.xpath("//button");
	public By header = By.xpath("//h3");
	public By arrowButton = By.cssSelector("header > div > div > button > mat-icon");
	public By logout = By.xpath("//button[contains(text(),'Logout')]");
	


	
	/***********************Login to ADL page 
	 * @throws InterruptedException *****************************************/
	public String login(String username, String password) {
		
		//System.out.println(driver.findElements(this.userpass));
		getDriver().findElements(userpass).get(0).sendKeys(username);
		getDriver().findElements(userpass).get(1).sendKeys(password);
		getDriver().findElements(submit).get(1).click();
		String header1 = getDriver().findElements(header).get(0).getText();
		return header1;

	}
	
	
	/************************Logout of ADL page***************************************/
	public void logout(){
		getDriver().findElement(arrowButton).click();
		getDriver().findElement(logout).click();
		
	}
	
}