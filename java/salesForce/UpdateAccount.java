package salesForce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateAccount {

	public static void main(String[] args) throws InterruptedException {
		//disable chrome notifications
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver(options);
				driver.get("https://login.salesforce.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				String phoneNum="9952983298";
				String Email="mun@gmail.com";
				
				//login to application
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cypress@testleaf.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selbootcamp@123");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(30000);
				
				// clicking viewall
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				 driver.findElementByXPath("//button[text()='View All']").click();
				driver.findElementByXPath("//input[@class='slds-input']").sendKeys("Contacts");
				driver.findElementByXPath("//mark[text()='Contacts']").click();


		// Printing the list of names
		Thread.sleep(3000);
		int i=1;
		do {
			
			try {
				driver.findElementByXPath("//table/tbody/tr["+i+"]//th//a").sendKeys(Keys.PAGE_DOWN);
				
				System.out.println(driver.findElementByXPath("//table/tbody/tr["+i+"]//th//a").getText());
		        
		    } catch (org.openqa.selenium.NoSuchElementException e) {
		        break;
		    }
			
			i=i+1;
			
		} while (true);
		
		System.out.println("Completed");

		// giving test dd in searchbox and clicking
		driver.findElementByXPath("//input[@name='Contact-search-input']").sendKeys("test dd");
		WebElement textbox = driver.findElementByXPath("//input[@name='Contact-search-input']");
		textbox.sendKeys(Keys.ENTER);

		// clicking the edit button symbol in right side of test dd
		WebElement m = driver.findElement(By.xpath(
				"//a[@role='button'][@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger']/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", m);
		Thread.sleep(1000);
		
		WebElement editbutton=driver.findElementByXPath(
				"//a[@role='button'][@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger']/span");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", editbutton);
		
		driver.findElementByXPath("//a[@title='Edit']").click();

		WebElement email = driver.findElementByXPath("//input[@name='Email']");
		email.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),"mun@gmail.com");
		
		WebElement Leadsource = driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[5]");
		Leadsource.sendKeys("Partner Referral");

		WebElement area = driver.findElementByXPath("(//textarea[@name='street'])[1]");
		area.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),"Australia");

		WebElement Level = driver.findElementByXPath("//label[text()='Level']/following::div/input");
		Level.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),"Tertiary");

		driver.findElementByXPath("//button[text()='Save']").click();

		String EmailfromApp = driver.findElementByXPath("//a[@class='slds-truncate emailuiFormattedEmail']").getText();
		System.out.println(EmailfromApp);

		if (EmailfromApp.equals(Email)) {

			System.out.println("The Email updated and verified");
		} else {
			System.out.println("The Email is not verified");
		}
	}
}
