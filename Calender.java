package week5_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Calendar.html");
		Actions builder=new Actions(driver);
		
		WebElement calender = driver.findElementByXPath("//input[@id='datepicker']");
		
		builder.moveToElement(calender).click().perform();
		
		WebElement next = driver.findElementByXPath("//span[text()='Next']");
		
		builder.moveToElement(next).click().perform();
		
		WebElement date = driver.findElementByXPath("//a[text()='10']");
		
		builder.moveToElement(date).click().perform();
		
		
		
		
	}

}
