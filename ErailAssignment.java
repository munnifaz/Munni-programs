package week5_class;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailAssignment {

	public static void main(String[] args) throws InterruptedException {

		// Assignment 2 [Edit Lead] using xpath nly

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Set<String> values = new HashSet<String>();

		driver.get("https://erail.in/");
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("Chennai Egmore", Keys.TAB);
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("Mdu", Keys.TAB);
		//boolean checked = driver.findElementByXPath("//iput[@id='chkSelectDateOnly']").isSelected();
		//if (checked) {
			 driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
			Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int rowscount = rows.size();
		System.out.println(rowscount);

		

		for (int i = 2; i < rowscount; i++) {
			
			WebElement tabvalues = driver
					.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]/a");
			
			 String text = tabvalues.getText();
			values.add(text);
		
		}System.out.println(values);
	}}

