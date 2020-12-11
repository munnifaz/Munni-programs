package week5_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealMouseActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		WebElement Men=driver.findElementByXPath("(//span[text()=\"Men's Fashion\"])[2]");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(Men).perform();
		
		WebElement shirts=driver.findElementByXPath("(//span[text()='Shirts'])[2]");
		shirts.click();
		
		WebElement firstelment=driver.findElementByXPath("(//span[contains(@id,'display-price')])[1]");
		builder.moveToElement(firstelment);
		
		WebElement quick=driver.findElementByXPath("//div[contains(text(),'Quickview')]");		
		builder.click(quick);
		
		
	}

}
