package testNG_Execution;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskWithoutMandatryFields extends BaseClass{

	@Test
	public  void Task() throws InterruptedException {
		
		JavascriptExecutor jsexecutr = (JavascriptExecutor) driver;
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);

		// clicking viewall and clicking Sales
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30); WebElement ViewAllbutton
		 * = driver.findElement(By.xpath("(//button[text()='View All'])[2]"));
		 * wait.until(ExpectedConditions.elementToBeClickable(ViewAllbutton));
		 * ViewAllbutton.click();
		 * driver.findElementByXPath("//input[@class='slds-input']").sendKeys("Sales");
		 * driver.findElementByXPath("(//mark[text()='Sales'])[1]").click();
		 * 
		 * // click tasks and select New Task
		 * 
		 * driver.findElementByXPath(
		 * "//a[@title='Tasks']/following-sibling::one-app-nav-bar-item-dropdown//div").
		 * click();
		 * 
		 * WebElement
		 * newtask=driver.findElementByXPath("(//span[text()='New Task'])[1]");
		 * jsexecutr.executeScript("arguments[0].click();", newtask);
		 * driver.findElementByXPath("//input[@title='Search Contacts']").click();
		 * driver.findElementByXPath("//div[@title='Munni shaik377']").click();
		 * driver.findElementByXPath(
		 * "//textarea[@class='textarea textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']"
		 * ) .sendKeys("Automation");
		 * driver.findElementByXPath("//button[@title='Save']").click();
		 * 
		 * WebElement msg=driver.
		 * findElementByXPath("//li[text()='These required fields must be completed: Subject']"
		 * ); if(msg.isDisplayed()) { System.out.
		 * println("Tc passed & The required fields must be completed : subject error message is displaying "
		 * );} else {
		 * System.out.println("TC Failed & The error message is not displaying"); }
		 */
	}

}
