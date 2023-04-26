package TestModuels;
import java.lang.reflect.Method;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.PackagePage;


public class PackageTest extends TestBase {
	PackagePage checkoutPage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		checkoutPage = new PackagePage();

	}

	@Test(priority = 0)
	public void validateContryCurrency(Method method) throws InterruptedException {
		checkoutPage.validateSiteCurrency("From 7.00 Egyptian pound/month");
	}
	
	@Test(priority = 1)
	public void validateEgyptLitePackage() {
		checkoutPage.validateLitePackagePrice(prop.getProperty("EgyptLitePackagePrice"));
		checkoutPage.validateLiteDiscoveryStates(prop.getProperty("EgyptLiteDiscoveryStates"));
		checkoutPage.validateLiteVideoQualityStates(prop.getProperty("EgyptLiteVideoQualityStates"));
		checkoutPage.validateLiteDeviceAccessStates(prop.getProperty("EgyptLiteDeviceAccessStates"));
		checkoutPage.validateLiteRewindContentStates(prop.getProperty("EgyptLiteRewindContentStates"));
		checkoutPage.validateLiteWatchofflineStates(prop.getProperty("EgyptLiteWatchofflineStates"));
	}
	
	@Test(priority = 2)
	public void ValidateEgyptClassicPackage() {
		checkoutPage.validateClassicPackagePrice(prop.getProperty("EgyptClassicPackagePrice"));
		checkoutPage.validateClassicDiscoveryStates(prop.getProperty("EgyptClassicDiscoveryStates"));
		checkoutPage.validateClassicVideoQualityStates(prop.getProperty("EgyptClassicVideoQualityStates"));
		checkoutPage.validateClassicDeviceAccessStates(prop.getProperty("EgyptClassicDeviceAccessStates"));
		checkoutPage.validateClassicRewindContentStates(prop.getProperty("EgyptClassicRewindContentStates"));
		checkoutPage.validateClassicWatchofflineStates(prop.getProperty("EgyptClassicWatchofflineStates"));
		
	}
	
	@Test(priority = 3)
	public void ValidateEgyptPremiumPackage() {
		checkoutPage.validatePremiumPackagePrice(prop.getProperty("EgyptPremiumPackagePrice"));
		checkoutPage.validatePremiumDiscoveryStates(prop.getProperty("EgyptPremiumDiscoveryStates"));
		checkoutPage.validatePremiumVideoQualityStates(prop.getProperty("EgyptPremiumVideoQualityStates"));
		checkoutPage.validatePremiumDeviceAccessStates(prop.getProperty("EgyptPremiumDeviceAccessStates"));
		checkoutPage.validatePremiumRewindContentStates(prop.getProperty("EgyptPremiumRewindContentStates"));
		checkoutPage.validatePremiumWatchofflineStates(prop.getProperty("EgyptPremiumWatchofflineStates"));
		
	}
	

	@AfterMethod
	public void AfterMethod() {
		driver.quit();
	}

}
