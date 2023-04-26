package com.crm.qa.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class PackagePage extends TestBase{
	

	WebElement CurrencyElement =  driver.findElement(By.cssSelector(".trial-cost:nth-child(3)"));
	
	WebElement LitePackagePrice = driver.findElement(By.cssSelector(".plan-section:nth-child(3) > .plan-row:nth-child(3) > .plan-names > div:nth-child(1)"));
	WebElement ClassicPackagePrice = driver.findElement(By.xpath("//*[@id='currency-classic']"));
	WebElement PremiumPackagePrice = driver.findElement(By.xpath("//*[@id='currency-premium']"));
	
	WebElement LiteDiscoveryStates= driver.findElement(By.cssSelector(".plan-row:nth-child(4) > .plan-names > div:nth-child(1)"));
	WebElement ClassicDiscoveryStates= driver.findElement(By.cssSelector(".plan-row:nth-child(4) .classic"));
	WebElement PremiumDiscoveryStates= driver.findElement(By.cssSelector(".plan-row:nth-child(4) div:nth-child(3)"));
	
	WebElement LiteVideoQualityStates= driver.findElement(By.cssSelector(".plan-row:nth-child(5) > .plan-names > div:nth-child(1)"));
	WebElement ClassicVideoQualityStates= driver.findElement(By.cssSelector(".plan-row:nth-child(5) .classic"));
	WebElement PremiumVideoQualityStates= driver.findElement(By.cssSelector(".plan-row:nth-child(5) div:nth-child(3)"));
	
	WebElement LiteDeviceAccessStates = driver.findElement(By.cssSelector(".plan-row:nth-child(6) > .plan-names > div:nth-child(1)"));
	WebElement ClassicDeviceAccessStates = driver.findElement(By.cssSelector(".plan-row:nth-child(6) .classic"));
	WebElement PremiumDeviceAccessStates = driver.findElement(By.cssSelector(".plan-row:nth-child(6) div:nth-child(3)"));
	
	WebElement LiteRewindContentStates = driver.findElement(By.cssSelector(".plan-row:nth-child(7) > .plan-names > div:nth-child(1)"));
	WebElement ClassicRewindContentStates = driver.findElement(By.cssSelector(".plan-row:nth-child(7) .classic"));
	WebElement PremiumRewindContentStates = driver.findElement(By.cssSelector(".plan-row:nth-child(7) div:nth-child(3)"));
	
	
	WebElement ClassicWatchofflineStates = driver.findElement(By.cssSelector(".plan-row:nth-child(8) .classic > img"));
	WebElement LiteWatchofflineStates = driver.findElement(By.cssSelector(".plan-row:nth-child(8) div:nth-child(1) > img"));
	WebElement PremiumWatchofflineStates = driver.findElement(By.cssSelector(".plan-row:nth-child(8) div:nth-child(3) > img"));

public void validateSiteCurrency(String Currency) {
	
String actualCurrency = CurrencyElement.getText();
Assert.assertEquals(actualCurrency, Currency);
	
}

public void  validateLitePackagePrice(String Price) {
	String actualPrice = LitePackagePrice.getText();
	Assert.assertEquals(actualPrice, Price);
	
}

public void  validateClassicPackagePrice(String Price) {
	String actualPrice = ClassicPackagePrice.getText();
	Assert.assertEquals(actualPrice, Price);
}

public void  validatePremiumPackagePrice(String Price) {
	String actualPrice = PremiumPackagePrice.getText();
	Assert.assertEquals(actualPrice, Price);
}

public void validateLiteDiscoveryStates(String States) {
	
	String actualStates = LiteDiscoveryStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateClassicDiscoveryStates(String States) {
	
	String actualStates = ClassicDiscoveryStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validatePremiumDiscoveryStates(String States) {
	
	String actualStates = PremiumDiscoveryStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateLiteVideoQualityStates(String States) {
	
	String actualStates = LiteVideoQualityStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateClassicVideoQualityStates(String States) {
	
	String actualStates = ClassicVideoQualityStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validatePremiumVideoQualityStates(String States) {
	
	String actualStates = PremiumVideoQualityStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateLiteDeviceAccessStates(String States) {
	
	String actualStates = LiteDeviceAccessStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateClassicDeviceAccessStates(String States) {
	
	String actualStates = ClassicDeviceAccessStates.getText();
	Assert.assertEquals(actualStates, States);
}
public void validatePremiumDeviceAccessStates(String States) {
	
	String actualStates = PremiumDeviceAccessStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateLiteRewindContentStates(String States) {
	
	String actualStates = LiteRewindContentStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateClassicRewindContentStates(String States) {
	
	String actualStates = ClassicRewindContentStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validatePremiumRewindContentStates(String States) {
	
	String actualStates = PremiumRewindContentStates.getText();
	Assert.assertEquals(actualStates, States);
}

public void validateClassicWatchofflineStates(String States) {
 String actualStates = ClassicWatchofflineStates.getAttribute("src");
 Assert.assertEquals(actualStates, States);
}

public void validateLiteWatchofflineStates(String States) {
	 String actualStates = LiteWatchofflineStates.getAttribute("src");
	 Assert.assertEquals(actualStates, States);
	}

public void validatePremiumWatchofflineStates(String States) {
	 String actualStates = PremiumWatchofflineStates.getAttribute("src");
	 Assert.assertEquals(actualStates, States);
	}

}
