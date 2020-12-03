package week1.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2Exercize {
	private static List<WebElement> Elementcount;

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
				  ChromeDriver(); driver.manage().window().maximize();

		// #################EDITFIELDS######################

		
		  //WebDriverManager.chromedriver().setup(); ChromeDriver driver=new
		 // ChromeDriver(); driver.manage().window().maximize();
		/*
		 * driver.get("http://leafground.com/pages/Edit.html");
		 * driver.findElementById("email").sendKeys("munnirunnisab@gmail.com");
		 * driver.findElementByXPath("//input[@value='Append ']").sendKeys("munni",Keys.
		 * TAB); String
		 * txt=driver.findElementByXPath("//input[@name='username']").getAttribute(
		 * "value"); System.out.println("The default text is"+txt);
		 * driver.findElementByXPath("(//input[@name='username'])[2]").clear(); boolean
		 * result=driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		 * if(result) { System.out.println("The edit field is enabled");} else {
		 * System.out.println("The edit field is disabled");
		 * 
		 * 
		 * }
		 */
		 

		// ################## BUTTONS###########
		
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver=new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * 
		 * driver.get("http://leafground.com/pages/Button.html");
		 * 
		 * driver.findElementById("home").click();
		 * System.out.println("The home page is displayed and URL is"+driver.
		 * getCurrentUrl()); driver.navigate().back();
		 * 
		 * Point location= driver.findElementById("position").getLocation();
		 * System.out.println("the position of the button is"+location); String
		 * bgcolor=driver.findElementById("color").getAttribute("style");
		 * System.out.println("The background color is"+bgcolor); Dimension
		 * size=driver.findElementById("size").getSize();
		 * System.out.println("The width and height of the button is"+size);
		 */
		// **************Links******************
		
		/*  WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		  ChromeDriver(); driver.manage().window().maximize();
		  
		  driver.get("http://leafground.com/pages/Link.html");
		  driver.findElementByLinkText("Go to Home Page").click();
		  String URL=driver.getCurrentUrl();
		  if(URL.contains("home")) {
			  System.out.println("The home page is displayed");}
		  else {
			  System.out.println("The home page is not displayed");}
		  driver.navigate().back();
		  String nextpage=driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		  System.out.println("The nextpage is"+nextpage); 
		  String text1=driver.findElementByLinkText("Verify am I broken?").getAttribute("href"); 
		  if(text1.contains("error")) { 
			  System.out.println("The page is broken"); }
		  else { 
			  System.out.println("The page is not broken");}
		  
		  String fourthlink=driver.findElementByLinkText("Go to Home Page").getAttribute("href");
		  String firstlink=driver.findElementByLinkText("Go to Home Page").getAttribute("href");
		  if(fourthlink.contains(firstlink)){
		  System.out.println("The two links are equal and clicking the firstlink");
		  driver.findElementByLinkText("Go to Home Page").click();} 
		  else {
		  System.out.println("The two links are not same");} 
		  driver.navigate().back();
		  List<WebElement> links=driver.findElements(By.tagName("a"));
		  System.out.println("The number of links are"+links.size());
		  
		  } }*/
		 

		// Dropdown
		/*
		  driver.get("http://leafground.com/pages/Dropdown.html"); 
		  Select dropdown =  new Select(driver.findElementById("dropdown1")); dropdown.selectByIndex(3);
		  Select dropdown2 = new Select(driver.findElementByName("dropdown2"));
		  dropdown2.selectByVisibleText("Selenium"); Select dropdown3 = new
		  Select(driver.findElementById("dropdown3")); dropdown3.selectByValue("2");
		  Select dropdown4 = new Select(driver.findElementByClassName("dropdown"));
		  Elementcount = dropdown4.getOptions(); System.out.println("number of items" +
		  Elementcount.size()); // change dropdown into webelement and use sendkeys it will work
		   WebElement dropdown5 = driver.findElementByXPath("//div[@id='contentblock']/section[1]/div[5]/select[1]");
		  dropdown5.sendKeys("Selenium");
		   WebElement combo = driver.findElementByXPath(
		  "//div[@id='contentblock']/section[1]/div[6]/select[1]"); Select multiselect
		  = new Select(combo); multiselect.selectByVisibleText("Selenium");
		  multiselect.selectByValue("2"); multiselect.selectByValue("3");
		  multiselect.selectByVisibleText("Loadrunner");
	}}*/
		 

		// RadioButtons
		
		 // WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		  //ChromeDriver(); driver.manage().window().maximize();
		 
		
		/*
		 * driver.get("http://leafground.com/pages/radio.html");
		 * driver.findElementById("yes").click();
		 * 
		 * boolean
		 * Radiobtn1=driver.findElementByXPath("//input[@name='news']").isSelected();
		 * if(Radiobtn1==true) {
		 * System.out.println("The unchecked name checkbox is checked");} else { boolean
		 * radiobtn2=driver.findElementByXPath("(//input[@name='news'])[2]").
		 * isSelected(); if(radiobtn2==true) {
		 * System.out.println("The checked name checkbox is selected");}
		 * 
		 * Boolean
		 * firstradio=driver.findElementByXPath("//input[@name='age']").isSelected();
		 * Boolean
		 * Secondradio=driver.findElementByXPath("(//input[@name='age'])[2]").isSelected
		 * (); Boolean
		 * Thirdradio=driver.findElementByXPath("(//input[@name='age'])[3]").isSelected(
		 * ); if(firstradio || Secondradio || Thirdradio) {
		 * System.out.println("choice was Already selected");} else {
		 * System.out.println("Please select one group"); } }
		 */
	}
}
		 
		//Interact with checkboxes
		/*
		 * driver.get("http://leafground.com/pages/checkbox.html");
		 * driver.findElementByXPath("//input[@type='checkbox']").click();
		 * driver.findElementByXPath("(//input[@type='checkbox'])[2]").click();
		 * driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		 * driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[1]/div[4]/input[1]").click();
		 * driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[1]/div[5]/input[1]").click();
		 * Boolean checked=driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[2]/div[1]/input[1]").isSelected();
		 * if(checked) {
		 * System.out.println("The selenium checkbox is already checked");} else {
		 * System.out.println("The selenium checkbox is not checked"); }
		 * 
		 * Boolean checked1=driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[3]/div[1]/input[1]").isSelected();
		 * Boolean checked2=driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]").isSelected();
		 * if(checked1) { driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[3]/div[1]/input[1]").click();} else
		 * if(checked) { driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]").click();}
		 * 
		 * driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[4]/div[1]/input[1]").click();
		 * driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[4]/div[2]/input[1]").click();
		 * driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[4]/div[3]/input[1]").click();
		 * driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[4]/div[4]/input[1]").click();
		 * driver.findElementByXPath(
		 * "//div[@id='contentblock']/section[1]/div[4]/div[5]/input[1]").click();
		 */
		
		
		
//Assignment2//create Lead
		/*
		 * driver.get("http://leaftaps.com/opentaps/control/login");
		 * driver.findElementById("username").sendKeys("DemoSalesManager");
		 * driver.findElementById("password").sendKeys("crmsfa");
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * driver.findElementByLinkText("Leads").click();
		 * driver.findElementByLinkText("Create Lead").click();
		 * driver.findElementById("createLeadForm_companyName").sendKeys("Virtusa");
		 * driver.findElementById("createLeadForm_firstName").sendKeys("Munni");
		 * driver.findElementById("createLeadForm_lastName").sendKeys("Begum"); Select
		 * source=new Select(driver.findElementById("createLeadForm_dataSourceId"));
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
         
         
 //Assignment3////    Create Account
		/*
		 * driver.get("http://leaftaps.com/opentaps/control/login");
		 * driver.findElementById("username").sendKeys("DemoSalesManager");
		 * driver.findElementById("password").sendKeys("crmsfa");
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * driver.findElementByLinkText("Accounts").click();
		 * driver.findElementByLinkText("Create Account").click();
		 * driver.findElementByXPath("(//input[@name='accountName'])[2]").
		 * sendKeys("Debit Limited Account");
		 * driver.findElementByName("description").sendKeys("Selenium Automation Tester"
		 * );
		 * driver.findElementByXPath("(//input[@class='inputBox'])[3]").sendKeys("fazil"
		 * ); driver.findElementByXPath("//span[text()='Site Name']/following::input").
		 * sendKeys("Allagadda"); Select industry=new
		 * Select(driver.findElementByName("industryEnumId"));
		 * industry.selectByVisibleText("Computer Software"); Select ownershp=new
		 * Select(driver.findElementByName("ownershipEnumId"));
		 * ownershp.selectByVisibleText("S-Corporation"); Select source=new
		 * Select(driver.findElementById("dataSourceId"));
		 * source.selectByValue("LEAD_EMPLOYEE"); Select marketcmp=new
		 * Select(driver.findElementById("marketingCampaignId"));
		 * marketcmp.selectByIndex(6); Select state=new
		 * Select(driver.findElementById("generalStateProvinceGeoId"));
		 * state.selectByValue("TX");
		 * driver.findElementByXPath("//input[@type='submit']").click();
		 */
//Assignment 4//////
		
		/*
		 * driver.get("https://acme-test.uipath.com/login");
		 * driver.findElementByXPath("//input[@type='email']").sendKeys(
		 * "kumar.testleaf@gmail.com");
		 * driver.findElementByXPath("//input[@type='password']").sendKeys("leaf@12");
		 * driver.findElementByXPath("//button[@type='submit']").click();
		 * System.out.println(driver.getTitle()); driver.close();
		 */
		/*
		 * driver.get("https://www.irctc.co.in/nget/profile/user-registration"); Select
		 * country1=new
		 * Select(driver.findElementByXPath(//select[@formcontrolname='nationality'])
		 * country1.selectByVisibleText("munni");
		 */
		
		
		
		





