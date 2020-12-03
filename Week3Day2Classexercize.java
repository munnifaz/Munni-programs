package week3.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Week3Day2Classexercize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager",Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		Select source=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		List<WebElement> list = source.getOptions();
		list.get(list.size()-2).click();
		Select market=new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		List<WebElement> list1 = market.getOptions();
		for (WebElement items : list1) {
			items.click();
			Thread.sleep(2000);
			
			/*
			 * driver.
			 * findElementByXPath("//input[@class='inputBox' and @name='companyName']").
			 * sendKeys("virtus");
			 * driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys
			 * ("munni");
			 * driver.findElementByXPath("//input[@name='lastName'])[1]").sendKeys("begum");
			 * Select source=new Select(driver.findElementByXPath(
			 * "//select[contains(@id,'createLeadForm_dataSourceId')]"));
			 * source.selectByVisibleText("Employee"); Select marketcompaign=new
			 * Select(driver.findElementById("createLeadForm_marketingCampaignId"));
			 * marketcompaign.selectByValue("9001"); Select ownership=new
			 * Select(driver.findElementById("createLeadForm_ownershipEnumId"));
			 * ownership.selectByIndex(5); Select country=new
			 * Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
			 * country.selectByVisibleText("India");
			 * driver.findElementByName("submitButton").click();
			 * System.out.println(driver.getTitle());
			 */
	         	
		}
		
	//Duplicate Lead
		  
		
		

	}

}
