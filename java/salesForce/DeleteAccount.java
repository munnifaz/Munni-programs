package salesForce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		String uniqueName = "Anil Elumalai638";
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		//driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
		driver.get("https://login.salesforce.com/");
		driver.findElementById("username").sendKeys("cypress@testleaf.com");
		driver.findElementById("password").sendKeys("Selbootcamp@123");
		driver.findElementByName("Login").click();
		Thread.sleep(30000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Clicking View ALL and clicking contacts
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
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

			// giving name in textbox and find unique and clicking it.
			driver.findElementByXPath("//input[@name='Contact-search-input']").sendKeys(uniqueName);
			WebElement textbox = driver.findElementByXPath("//input[@name='Contact-search-input']");

			textbox.sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			List<WebElement> duplicateelements = driver.findElementsByXPath("//tbody/tr/th/span/a");
			int size = duplicateelements.size();

			for (int m = 0; m < size; m++) {

				System.out.println(duplicateelements.get(m).getText());

				if (duplicateelements.get(m).getText().equals(uniqueName)) {
					System.out.println("The uniquename found in" + " " + i + " " + "th row & the name is" + " "
							+ duplicateelements.get(m).getText());

					// finding the rightmost button by using scroll using javascript executor
					WebElement ele= driver.findElement(By.xpath(
							"//a[@role='button'][@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger']/span"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
					Thread.sleep(1000);

					// clicking the Delete button

					driver.findElementByXPath("//table/tbody/tr[" + (m + 1) + "]/td[8]//div").click();
					driver.findElementByXPath("//a[@title='Delete']").click();
					driver.findElementByXPath("//span[text()='Delete']").click();
					Thread.sleep(1000);}
					else {
						System.out.println("The given Account name not found in" + m + "row");


					
			//Again giving the name in textbox and checking it is deleted or not.	
					driver.findElementByXPath("//input[@name='Contact-search-input']").clear();
					driver.findElementByXPath("//input[@name='Contact-search-input']").sendKeys(uniqueName);
					WebElement textbox1 = driver.findElementByXPath("//input[@name='Contact-search-input']");
					textbox.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					WebElement NoItems=driver.findElementByXPath("//p[text()='No items to display.']");
					if(NoItems.isDisplayed()) {
						System.out.println("The account was deleted successfully");}
					else {
						
					
					List<WebElement> MatchingElements = driver.findElementsByXPath("//tbody/tr/th/span/a");
					int size1 = MatchingElements.size();
					System.out.println(size);

					for (int j = 0; j < size; j++) {

						System.out.println(MatchingElements.get(j).getText());

						if (MatchingElements.get(i).getText().equals(uniqueName)) {
							System.out.println("The name is Found" + uniqueName + "the contact was not deleted");
						} else {
							System.out.println("Contact not found" + " "+ uniqueName +" "+ "the contact successfully deleted");
						}

					}

				}
			}

		}

	}
}


