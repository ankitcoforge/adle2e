package po;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;
import utils.utilityClass;

public class quote extends BaseClass{
	
	utilityClass event = new utilityClass();
	contractpo co = new contractpo();
	
	String savequote = "//span[contains(text(),'Save Quote')]";
	
	/************************Create contract 
	 * @throws InterruptedException ****************************************/
	public String createQuote() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(co.getProducts1)));
		event.inputfield("cssSelector", co.textbox, "Ankit", 0);
		event.inputfield("cssSelector", co.textbox, "Srivastava", 1);
		event.inputfield("cssSelector", co.textbox, "1500", 5);
		event.inputfield("cssSelector", co.textbox, "JN8AS58TX9W905001", 6);
		event.clickfield("xpath", co.getProducts);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElements(co.selectProgram1).get(2)));
		event.clickfield("xpath", co.selectProgram, 2);
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElements(co.table1).get(0)));
		event.clickfield("xpath", co.table, 1);
		event.inputfield("cssSelector", co.contract, "10000", 0);
		event.inputfield("cssSelector", co.textbox, "20301", 14);
		event.inputfield("cssSelector", co.textbox, "Address", 13);
		event.clearfield("cssSelector", co.textbox , 17 );
		event.inputfield("cssSelector", co.textbox, "1234567890", 17);
		event.clickfield("xpath", savequote);
		Thread.sleep(3000);
		return (getDriver().findElement(co.successMessage).getText());	
	}

}
