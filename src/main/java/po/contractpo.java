package po;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;
import utils.utilityClass;

public class contractpo extends BaseClass{
	
	utilityClass event = new utilityClass();
	
	public By getProducts1 = By.xpath("//span[contains(text(),'Get Products')]");
	public By name = By.cssSelector("adl-text-input > div > div.text-field__input.secure > input");
	public By selectProgram1 = By.xpath("//mat-checkbox/label/div");
	public By table1 = By.xpath("//td");
	public By contract1 = By.cssSelector("div.text-field__input.secure.text-field__input--prefix > input");
	public By generateContract1 = By.xpath("//span[contains(text(),'Proceed to generate contract(s)')]");
	public By checkbox1 = By.xpath("//mat-checkbox");
	public By button1 = By.xpath("//button");
	public By successMessage = By.cssSelector("div.notification__container__message > span");
	public String textbox = "adl-text-input > div > div.text-field__input.secure > input";
	public String getProducts = "//span[contains(text(),'Get Products')]";
	public String selectProgram = "//mat-checkbox/label/div";
	public String table = "//td";
	public String contract = "div.text-field__input.secure.text-field__input--prefix > input";
	public String checkbox = "//mat-checkbox";
	public String button = "//button";
	public String generateContract = "//span[contains(text(),'Proceed to generate contract(s)')]";
	public String programfirstname ="//span[contains(text(),'";
	public String programlastname = "')]/preceding-sibling::div";
	

	
	/************************Create contract 
	 * @throws InterruptedException ****************************************/
	public String createContract() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(getProducts1)));
		event.inputfield("cssSelector", textbox, "Ankit", 0);
		event.inputfield("cssSelector", textbox, "Srivastava", 1);
		event.inputfield("cssSelector", textbox, "1500", 5);
		event.inputfield("cssSelector", textbox, "JN8AS58TX9W905001", 6);
		event.clickfield("xpath", getProducts);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElements(selectProgram1).get(2)));
		event.clickfield("xpath", selectProgram, 2);
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElements(table1).get(0)));
		event.clickfield("xpath", table, 1);
		event.inputfield("cssSelector", contract, "10000", 0);
		event.inputfield("cssSelector", textbox, "20301", 14);
		event.inputfield("cssSelector", textbox, "Address", 13);
		event.clearfield("cssSelector", textbox , 17 );
		event.inputfield("cssSelector", textbox, "1234567890", 17);
		event.clickfield("xpath", generateContract);
		event.clickfield("xpath", checkbox, 7);
		event.clickfield("xpath", checkbox, 8);
		event.clickfield("xpath", button, 16);
		Thread.sleep(3000);
		return (getDriver().findElement(successMessage).getText());	
		
	}
}
