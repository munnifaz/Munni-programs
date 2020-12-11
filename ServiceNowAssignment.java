package week5_day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String incident;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev68594.service-now.com/");
		
		WebElement frameid = driver.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameid);
		driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");
		driver.findElementByXPath("//button[text()='Login']").click();
		
		driver.findElementByXPath("//input[@id='filter']").sendKeys("incident",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[text()='All'])[2]").click();
		
		WebElement incidentframe = driver.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(incidentframe);
		driver.findElementByXPath("//button[text()='New']").click();
		
								
		String incidentNum = driver.findElementByXPath("(//input[contains(@id,'incident')])[1]").getAttribute("value");
		
		System.out.println(incidentNum);
		incident=incidentNum;
		
		driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']").sendKeys("Guest");
		driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Software testing");
		Thread.sleep(1000);
		driver.findElementByXPath("(//button[text()='Submit'])[1]").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@placeholder='Search']").sendKeys(incident,Keys.ENTER);
		
		String incidentcheck=driver.findElementByXPath("(//td[@class='vt']/a)[1]").getText();
		
		if(incident.equals(incidentcheck)) {
			System.out.println("The new incident has been created and incident number is"+" "+incidentcheck);
			driver.close();}
		else {
			System.out.println("The new incident has not been created");
			
		}	
		
	}

}
