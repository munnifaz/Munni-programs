package week5_day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@for='crmsfa']/a").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list=new ArrayList<String>(windowHandles);
		System.out.println(list.size());
		String childwindow=list.get(1);
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='id']").sendKeys("10046");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		
		driver.switchTo().window(list.get(0));
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> windowHandles1= driver.getWindowHandles();
		
		List<String> list1=new ArrayList<String>(windowHandles1);
		System.out.println(list1.size());
		
		String childwindow1=list1.get(1);
		
		driver.switchTo().window(childwindow1);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='id']").sendKeys("10047");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.switchTo().window(list.get(0));
		driver.findElementByXPath("//a[text()='Merge']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept(); 
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("10046");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String recordmsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(recordmsg);
		if(recordmsg.contains("No records")){
			System.out.println("No records for this lead ID");}
		else {
			System.out.println("records displayed");
		}
		
		
		
		
		
		

	}

}
