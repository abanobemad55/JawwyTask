 package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.pages.PackagePage;


@SuppressWarnings("deprecation")
public class TestBase{

	
	
	

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
					+ "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
	
	public static void initialization(){

		
			System.setProperty("webdriver.chrome.driver", "./target/chromedriver.exe");	
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver

		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		
		driver.get(prop.getProperty("url"));
		 
	}

	
	
	 
	
	
	
	

}
