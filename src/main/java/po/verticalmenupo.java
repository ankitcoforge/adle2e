package po;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;
import utils.utilityClass;

public class verticalmenupo extends BaseClass{

	utilityClass event = new utilityClass();
	
	public String erate = "mat-nested-tree-node:nth-child(2) > li > button";
	public String contract = "//a[contains(text(),'Rate/Contract')]"; 
	
	/***************************Navigate to Contract page
	 * @throws InterruptedException *******************************/
	public void navigatetoContract() throws InterruptedException {
		
		event.clickfield("cssSelector", erate);
		event.clickfield("xpath", contract);
		
	}
}
