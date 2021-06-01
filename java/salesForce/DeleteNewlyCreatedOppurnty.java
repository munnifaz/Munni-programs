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
		
		//Finding the newly created oppurtunity and clicking rightmost ICON to delete
		//driver.findElement(By.linkText("fa")).click(); 
		WebElement name=driver.findElement(By.linkText("fa"));
		driver.findElementByXPath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]").click();
		driver.findElementByXPath("//a[@title='Delete']").click();
		driver.findElementByXPath("//button[@title='Delete']").click();
		
		//verify the text message
		WebElement msg=driver.findElementByXPath("//span[@class='toastMessage slds-text-heading--small forceActionsText']");
		if(msg.isDisplayed()) {
			System.out.println("The oppurtunity has been deleted successfully");}
		else {
			System.out.println("The oppurtnty not deleted");
		}
		
		//one-app-nav-bar-menu-item[@class='slds-dropdown__item']/a[@role='menuitemcheckbox']
		
		/* List<WebElement> listofopp=driver.findElementsByXPath("(//ul[@class='uiAbstractList'])[2]/li");
		int sizeofelements=listofopp.size();
		System.out.println(sizeofelements);
		
		for(int i=2;i<=sizeofelements*2;i+=2) {
			WebElement oppurnty=driver.findElementByXPath("((//ul[@class='uiAbstractList'])[2]/li/div)[i]/h3/div/a");
			if(oppurnty.getText().equals("faz")) {
				System.out.println("found");}
			else {}
			}
		} */
	
		
	}}


