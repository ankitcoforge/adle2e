/**
 * 
 */
package utils;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import po.contractpo;
import po.loginpo;

/**
 * @author ankit.srivastava
 *
 */
public class BaseClass {
	
	public static WebDriver driver;
	public Properties prop;
	
	
/****************Method to read properties file ***************************************************/
	public void init() {
		// init the prop file
		if (prop == null) {
			prop = new Properties();
			try {
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//projectconfig.properties");
				prop.load(fs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
/********************Method to get current web driver*******************************************************/
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = createDriver("Chrome");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.manage().window().maximize();	
		}
		return driver;
		
	}
	

	/********************Method to create web driver*******************************************************/	
	private static WebDriver createDriver(String browser) {
//		String bType = prop.getProperty(browser);
		if (browser.equals("Mozilla")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
		    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver.exe" );
			driver = new ChromeDriver();
		} else if (browser.equals("IE")) {
//			System.setProperty("webdriver.chrome.driver", prop.getProperty("iedriver_exe"));
//			driver = new InternetExplorerDriver();
		}
		return driver;
	}
	

	// Select browser
//	public void openBrowser(String browser) {
//
//		String bType = prop.getProperty(browser);
//		if (bType.equals("Mozilla")) {
//			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//geckodriver.exe");
//			driver = new FirefoxDriver();
//		} else if (bType.equals("Chrome")) {
//		    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver.exe" );
//			driver = new ChromeDriver();
//		} else if (bType.equals("IE")) {
//			System.setProperty("webdriver.chrome.driver", prop.getProperty("iedriver_exe"));
//			driver = new InternetExplorerDriver();
//		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		driver.manage().window().maximize();
//
//	}

	/********** Open the test environment ***********/
	public void navigate(String urlKey) {

		driver.get(prop.getProperty(urlKey));
	}

	/****** Title of the webpage ******/
	public String getTitle() {

		return (driver.getTitle());
    }


	/*********** Load application **********/
	public void loadApplication(String browser, String urlKey) {

		init();
		getDriver();
		navigate(urlKey);
	}
	

	/*********** Verify header of the webpage ***********/
	public String verifyheader(String Header) {
		String header = driver.findElement(By.tagName(prop.getProperty(Header))).getText();
		return (header);
	}

}

