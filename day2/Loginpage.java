package week1.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager",Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Munni");
		driver.findElementById("createLeadForm_firstName").sendKeys("shaik");
		driver.findElementById("createLeadForm_lastName").sendKeys("begum");
		driver.findElementByName("submitButton").click();//or sendKeys(keys.ENTER)
		String title=driver.getTitle();
		System.out.println("the title is"+title);
		//input[@name='USERNAME']
		
	}

}
