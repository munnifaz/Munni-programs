package salesForce;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAccount {

	public static void main(String[] args) throws InterruptedException {

		//disable chrome notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String phoneNum="9952983298";
		
		//login to application
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cypress@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selbootcamp@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// clicking viewall
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ViewAllbutton = driver.findElement(By.xpath("(//button[text()='View All'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(ViewAllbutton));
		ViewAllbutton.click();
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
		driver.findElementByXPath("//input[@name='Contact-search-input']").sendKeys("Anil Elumalai");
		WebElement textbox = driver.findElementByXPath("//input[@name='Contact-search-input']");
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> duplicateelements = driver.findElementsByXPath("//tbody/tr/th/span/a");
		int size1 = duplicateelements.size();
		for (int m = 0; m <=size1; m++) {
			if (duplicateelements.get(m).getText().equals("Anil Elumalai")) {
				System.out.println("The uniquename found in" + " " + m + " " + "th row & the name is" + " "
						+ duplicateelements.get(m).getText());

				// finding the rightmost button by using scroll using javascript executor
				WebElement mt = driver.findElement(By.xpath(
						"//a[@role='button'][@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger']/span"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mt);
				Thread.sleep(1000);

				// clicking the edit button

				driver.findElementByXPath("//table/tbody/tr[" + (m + 1) + "]/td[8]//div").click();
				driver.findElementByXPath("//a[@title='Edit']").click();

				break;
			}

			else {
				System.out.println("not match in" + m + "row");

			}
		}

		// empty the textboxes and giving new details WebElement title
		WebElement title = driver.findElementByXPath("//input[@name='Title']");
		title.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "FAZ");

		WebElement Birthday = driver.findElementByXPath("//input[@name='Birthdate']");
		Birthday.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "06/04/1992");

		driver.findElementByXPath("(//label[text()='Lead Source']/following::input)[1]").sendKeys("Purchased List");

		WebElement Phonenumber = driver.findElementByXPath("//input[@name='Phone']");
		Phonenumber.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "9952983298");

		driver.findElementByXPath("//button[text()='Save']").click();

		String getphonenum = driver.findElementByXPath("//span[@class='forceOutputPhone slds-truncate']").getText();
		String exactphonenumber = getphonenum.replaceAll("\\D", "");
		System.out.println(exactphonenumber);

		if (exactphonenumber.equals(phoneNum)) {

			System.out.println("The phone number updated and verified");
		} else {
			System.out.println("The phone number is not verified");
		}

	}

}
