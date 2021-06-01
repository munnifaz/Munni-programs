package salesForce;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Random rand = new Random();
		 int rand_int1 = rand.nextInt(1000);
		
		//Login to Salesforce application
		driver.get("https://login.salesforce.com/");
		driver.findElementById("username").sendKeys("cypress@testleaf.com");
		driver.findElementById("password").sendKeys("Selbootcamp@123");
		driver.findElementByName("Login").click();
		Thread.sleep(30000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@class='slds-icon slds-icon_x-small']").click();
		
		//clicking the new contact
		driver.findElementByXPath("//span[text()='New Contact']").click();
		
		//Filling the details
		driver.findElementByXPath("//*[text()='Salutation']//following::div[4]/a").click();
		//driver.findElementByXPath("//a[@class='select'][@data-interactive-lib-uid='8']").click();
		driver.findElementByXPath("//a[@title='Mr.']").click();
		driver.findElementByXPath("//input[@class='firstName compoundBorderBottom form-element__row input']").sendKeys("Anil");
		driver.findElementByXPath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']").sendKeys("Elumalai"+rand_int1);
		driver.findElementByXPath("//input[@inputmode='email']").sendKeys("naveen@test.com");
		
		//Creating the Account
		driver.findElementByXPath("//input[@title='Search Accounts']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//span[@title='New Account']").click();
		
		//Giving the Details in account, it is identifying as same window
		driver.findElementByXPath("(//input[@class=\" input\"][@type='text'])[3]").sendKeys("Credits");
		driver.findElementByXPath("(//button[@type='button'][@title='Save'])[2]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//span[text()='Save'])[2]").click();
		
		//checking the account creation successful or not
		Boolean ElemenetDisplay=driver.findElementByXPath("//div[@data-key='success'][@role='alert']").isDisplayed();
		if(ElemenetDisplay){
			System.out.println("The Contact successfully created");}
		else {
			System.out.println("unsuccesful New contact creation");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}