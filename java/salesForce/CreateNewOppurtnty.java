package salesForce;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewOppurtnty {

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
		
		WebElement NewButton = driver.findElementByXPath("//div[@title='New']");
		JavascriptExecutor jsexectrNew = (JavascriptExecutor) driver;
		jsexectrNew.executeScript("arguments[0].click();", NewButton);
		Thread.sleep(1000);

		// Giving the Details for new oppurtunity and save it
		driver.findElementByXPath("//input[@name='Name']").sendKeys("fa");
		Thread.sleep(1000);

		driver.findElementByXPath("//input[@name='CloseDate']").clear();
		driver.findElementByXPath("//input[@name='CloseDate']").sendKeys("06/04/1992");

		driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[3]").click();
		// Actions drpdwn = new Actions(driver);
		// WebElement dropdown=driver.findElementByXPath("(//input[@class='slds-input
		// slds-combobox__input'])[3]");
		// drpdwn.moveToElement(dropdown).click();
		// drpdwn.build();
		// drpdwn.perform();
		driver.findElementByXPath("//span[@class='slds-media__body']/span[text()='Needs Analysis']").click();


		// clicking save button
		WebElement savebtn = driver.findElementByXPath("//button[text()='Save']");
		JavascriptExecutor jsexecutorbutn = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", savebtn);

		// Verity the new created oppurtunity
		if (driver.findElementByXPath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")
				.isDisplayed()) {
			System.out.println("New oppurtunity has been created");
		} else {
			System.out.println("new oppurtunity NOT Created");
		}

	}
}
