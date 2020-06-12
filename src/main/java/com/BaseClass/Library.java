package com.BaseClass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Library {
	

	
	public static WebDriver driver;
	public static Properties properties;
	//public static Logger logger;

	public Library() {
		properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream("./src/test/resources/ConfigProperties/config.properties");
			try {
				properties.load(inputStream);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	//	logger = Logger.getLogger("OrangeHRMApplication");
	//	PropertyConfigurator.configure("./src/test/resources/Log4jProperty/log4j.properties");

	}

	public static void BrowserSetup(){
		String browserName = properties.getProperty("browser");
				if ("chrome".equals(browserName)) {
					System.setProperty("webdriver.chrome.driver", "chromedriver83.exe");
					driver = new ChromeDriver();
				} 
				else if ("Firfox".equalsIgnoreCase(browserName)) {
					driver = new FirefoxDriver();
				}

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get(properties.getProperty("url"));
				
	
}
