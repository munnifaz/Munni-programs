package week3.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week3Day2Excersz {

	public static void main(String[] args) throws InterruptedException {

		// Assignment 2 [Edit Lead] using xpath nly

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * String companyname="Polaris";
		 * driver.get("http://leaftaps.com/opentaps/control/main");
		 * driver.findElementByXPath("//p[@class='top']/input").sendKeys(
		 * "DemoSalesManager",Keys.TAB);
		 * driver.findElementByXPath("//label[@for='password']/following-sibling::input"
		 * ).sendKeys("crmsfa");
		 * driver.findElementByXPath("//input[@id='password']/following::input").click()
		 * ; driver.findElementByXPath("//div[@for='crmsfa']/a").click();
		 * driver.findElementByXPath("//a[text()='Leads']").click();
		 * driver.findElementByXPath("//a[text()='Find Leads']").click();
		 * driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input").sendKeys
		 * ("Gopi"); driver.findElementByXPath("//button[text()='Find Leads']").click();
		 * Thread.sleep(1000); driver.
		 * findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"
		 * ).click(); System.out.println(driver.getTitle());
		 * driver.findElementByXPath("//a[text()='Edit']").click();
		 * driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear(
		 * ); driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").
		 * sendKeys(companyname);
		 * driver.findElementByXPath("//input[@name='submitButton']").click(); String
		 * text=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").
		 * getText(); if(text.contains(companyname)) {
		 * System.out.println("The company name updated to"+" "+companyname);} else {
		 * System.out.println("The company name not updated");
		 * 
		 * }
		 */

		// Assignment 3 Delete Lead using xpath nly
		/*
		 * String leadID; String msg;
		 * driver.get("http://leaftaps.com/opentaps/control/main");
		 * driver.findElementByXPath("//p[@class='top']/input").sendKeys(
		 * "DemoSalesManager",Keys.TAB);
		 * driver.findElementByXPath("//label[@for='password']/following-sibling::input"
		 * ).sendKeys("crmsfa");
		 * driver.findElementByXPath("//input[@id='password']/following::input").click()
		 * ; driver.findElementByXPath("//div[@for='crmsfa']/a").click();
		 * driver.findElementByXPath("//a[text()='Leads']").click();
		 * driver.findElementByXPath("//a[text()='Find Leads']").click();
		 * driver.findElementByXPath("//span[text()='Phone']").click();
		 * driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("22");
		 * driver.findElementByXPath("//button[text()='Find Leads']").click();
		 * Thread.sleep(2000); leadID=driver.
		 * findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"
		 * ).getText(); driver.
		 * findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"
		 * ).click();
		 * 
		 * driver.findElementByXPath("//a[text()='Delete']").click();
		 * driver.findElementByXPath("//a[text()='Find Leads']").click();
		 * driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		 * driver.findElementByXPath("//button[text()='Find Leads']").click();
		 * Thread.sleep(3000);
		 * 
		 * msg=driver.findElementByXPath("//div[text()='No records to display']").
		 * getText(); System.out.println(msg);
		 * if(msg.contains("No records to display")){
		 * System.out.println("There is no leads for this ID");} else {
		 * System.out.println("The ID is not completely deleted");}
		 */

//Assignment 4:Duplicate Lead:

		driver.get("http://leaftaps.com/opentaps/control/main");

		// elder sibling to younger sibling
		driver.findElementByXPath("//label[text()='Username']/following-sibling::input").sendKeys("DemoSalesManager");
		// elder cousin to younger cousin with collection
		driver.findElementByXPath("(//label[text()='Username']/following::input)[2]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@id='button']/div").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		// younger cousin to elder cousin
		driver.findElementByXPath("//a[text()='Merge Leads']/preceding::a[1]").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("10012");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		String firstname = driver.findElementByXPath("//span[text()='First name']/following::span)[1]").getText();
		String surname = driver.findElementByXPath("//span[text()='Last name']/following::span)[1]").getText();
		String name = firstname + surname;
		System.out.println(name);

		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		String title = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		if (title.contains("Duplicate Lead")) {

			driver.findElementByXPath("//input[@name='submitButton'][@value='Create Lead']").click();
		} else {
			System.out.println("The duplicate title is not displayed");

		}

		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		

		/*
		 * String Dupfirstname =
		 * driver.findElementByXPath("(//span[text()='Forename']/following::span)[1]").
		 * getText(); String Dupsurname =
		 * driver.findElementByXPath("(//span[text()='Surname']/following::span)[1]").
		 * getText();
		 * 
		 * String Dupname=Dupfirstname+Dupsurname;
		 * 
		 * if(name==Dupname) { System.out.println("The duplicate lead hs been created");
		 * Browser.close();} else {
		 * System.out.println("The duplicate id has not created"); }
		 */
	}

}
