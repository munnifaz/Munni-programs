package salesForce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteNewlyCreatedOppurnty {

	public static void main(String[] args) throws InterruptedException {
		// Disable Notificatiopns
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		String NewlyCreatedOpp="faz";
		Boolean flag=true;
		JavascriptExecutor jsexecutr = (JavascriptExecutor) driver;
		

		// Login to Salesforce application
		driver.get("https://login.salesforce.com/");
		driver.findElementById("username").sendKeys("cypress@testleaf.com");
		driver.findElementById("password").sendKeys("Selbootcamp@123");
		driver.findElementByName("Login").click();
		Thread.sleep(30000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		// Clicking View ALL and clicking Sales
		WebElement Icon = driver.findElementByXPath("//div[@class='slds-icon-waffle']");
		JavascriptExecutor jsexectr = (JavascriptExecutor) driver;
		jsexectr.executeScript("arguments[0].click();", Icon);
		driver.findElementByXPath("(//button[text()='View All'])[2]").click();
		driver.findElementByXPath("//input[@class='slds-input']").sendKeys("Sales");
		driver.findElementByXPath("(//mark[text()='Sales'])[3]").click();

		// Click on Campaigns small ICON ->BootCamp link
		WebElement SmallIcon = driver
				.findElementByXPath("//span[text()='Campaigns Menu']//preceding::lightning-primitive-icon[1]");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", SmallIcon);
		Thread.sleep(1000);
		WebElement Bootcamplink = driver.findElementByXPath("(//span[text()='BootCamp'])[1]");
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", Bootcamplink);
		
		// scroll to down and clicking New in oppurtunity coloumn
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		
		List<WebElement> table=driver.findElementsByXPath("(//div[@class='listItemBody withActions']/h3/div/a)");
		System.out.println(table.size());
		List<WebElement> editbtn=driver.findElementsByXPath("//span[@class='slds-icon_container slds-icon-utility-down']");
		System.out.println(editbtn.size());
		int sizeOfTheTable= table.size();
		Thread.sleep(3000);
		
		for(int i=0; i<sizeOfTheTable; i++) {
			
			System.out.println(table.get(i).getText());
			
			if(table.get(i).getText().equals("faz")) {
				
				WebElement EditIcon =	editbtn.get(i);
				JavascriptExecutor jsetr = (JavascriptExecutor) driver;
				jsetr.executeScript("arguments[0].click();", EditIcon);
				
				WebElement Delete =driver.findElementByXPath("//a[@title='Delete']");
				JavascriptExecutor jsetre = (JavascriptExecutor) driver;
				jsetre.executeScript("arguments[0].click();", Delete);
				Thread.sleep(3000);
				
				driver.findElementByXPath("//span[text()='Delete']").click();}
			else {
				System.out.println("The oppurtunity is not found");
			}
				
			}
		
		//verify the text message
		
		WebElement msg=driver.findElementByXPath("//span[@class='toastMessage slds-text-heading--small forceActionsText']");
		if(msg.isDisplayed()) {
			System.out.println("The oppurtunity has been deleted successfully");}
		else {
			System.out.println("The oppurtnty not deleted");
		}
		
		//verifying the opp deleted or not in campaign-> bootcamp ->under opp Tab
		
		WebElement SmallIconverify = driver
				.findElementByXPath("//span[text()='Campaigns Menu']//preceding::lightning-primitive-icon[1]");
		
		jsexecutr.executeScript("arguments[0].click();", SmallIconverify);
		Thread.sleep(1000);
		
		WebElement Bootcamplink1 = driver.findElementByXPath("(//span[text()='BootCamp'])[1]");
		jsexecutr.executeScript("arguments[0].click();", Bootcamplink1);
		
		Thread.sleep(3000);
		jsexecutr.executeScript("window.scrollBy(0,1000)");
		
		List<WebElement> table1=driver.findElementsByXPath("(//div[@class='listItemBody withActions']/h3/div/a)");
		System.out.println(table1.size());
		
		List<WebElement> editbtn1=driver.findElementsByXPath("//span[@class='slds-icon_container slds-icon-utility-down']");
		System.out.println(editbtn1.size());
		
		int sizeOfTheTable1= table1.size();
		Thread.sleep(3000);
		
		for(int i=0; i<sizeOfTheTable1; i++) {
			
			System.out.println(table1.get(i).getText());
			
			if(table1.get(i).getText().equals("faz")) {
				flag=false;
				break;
			}}
				//System.out.println("The oppurtunity is found in Oppurtunity Tab"+"  "+" opp not deleted");}
			
			if(flag=true) {
				System.out.println("The oppurtunity is successfully deleted");}
			else {
				System.out.println("The opp not deleted");
				
			}
				
			}}



