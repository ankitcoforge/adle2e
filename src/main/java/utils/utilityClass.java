package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class utilityClass extends BaseClass{
	
	
/***************** Method to clear text field *****************/	
	public void clearfield(String type, String fieldname){

		switch (type) {
		
		case "name" : getDriver().findElement(By.name(fieldname)).clear();
		break;
		
		case "id" : getDriver().findElement(By.id(fieldname)).clear();
		break;
		
		case "xpath" : getDriver().findElement(By.xpath(fieldname)).clear();
		break;
		
		case "cssSelector" : getDriver().findElement(By.cssSelector(fieldname)).clear();
		break;
		
		}
	}
	
	/***************** Method to clear text field with more than one same locator*****************/	
	public void clearfield(String type, String fieldname, int number){

		switch (type.toLowerCase()) {
		
		case "name" : getDriver().findElements(By.name(fieldname)).get(number).clear();
		break;
		
		case "id" : getDriver().findElements(By.id(fieldname)).get(number).clear();
		break;
		
		case "xpath" : getDriver().findElements(By.xpath(fieldname)).get(number).clear();
		break;
		
		case "cssselector" : getDriver().findElements(By.cssSelector(fieldname)).clear();
		break;
		
		}
	}
	
/***********************Method to input a  text box **************************/
	public void inputfield(String type, String fieldname, String input){

		switch (type.toLowerCase()) {
		
		case "name" : getDriver().findElement(By.name(fieldname)).sendKeys(input);
		break;
		
		case "id" : getDriver().findElement(By.id(fieldname)).sendKeys(input);
		break;
		
		case "xpath" : getDriver().findElement(By.xpath(fieldname)).sendKeys(input);
		break;
		
		case "cssselector" : getDriver().findElement(By.cssSelector(fieldname)).sendKeys(input);
		break;
		
		}
	}
	
	/***********************Method to input a  text box with more than one same locator **************************/
	public void inputfield(String type, String fieldname, String input, int number){

		switch (type.toLowerCase()) {
		
		case "name" : getDriver().findElements(By.name(fieldname)).get(number).sendKeys(input);
		break;
		
		case "id" : getDriver().findElements(By.id(fieldname)).get(number).sendKeys(input);
		break;
		
		case "xpath" : getDriver().findElements(By.xpath(fieldname)).get(number).sendKeys(input);
		break;
		
		case "cssselector" : getDriver().findElements(By.cssSelector(fieldname)).get(number).sendKeys(input);
		break;
		
		}
	}

	
	/***********************Method to click a link/button**************************/
	public void clickfield(String type, String fieldname){

		switch (type.toLowerCase()) {
		
		case "name" : getDriver().findElement(By.name(fieldname)).click();
		break;
		
		case "id" : getDriver().findElement(By.id(fieldname)).click();
		break;
		
		case "xpath" : getDriver().findElement(By.xpath(fieldname)).click();
		break;
		
		case "cssselector" : getDriver().findElement(By.cssSelector(fieldname)).click();
		break;
		
		}
	}

	/***********************Method to click a link/button with more than one same locator**************************/
	public void clickfield(String type, String fieldname, int number){

		switch (type.toLowerCase()) {
		
		case "name" : getDriver().findElements(By.name(fieldname)).get(number).click();
		break;
		
		case "id" : getDriver().findElements(By.id(fieldname)).get(number).click();
		break;
		
		case "xpath" : getDriver().findElements(By.xpath(fieldname)).get(number).click();
		break;
		
		case "cssselector" : getDriver().findElements(By.cssSelector(fieldname)).get(number).click();
		break;
		
		}
	}

}
