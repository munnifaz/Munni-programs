package week5_day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		
	//Click button to open home page in New Window
	
		/*
		 * driver.findElementByXPath("//button[text()='Open Home Page']").click();
		 * 
		 * Set<String> windowHandles = driver.getWindowHandles();
		 * 
		 * List<String> windowList=new ArrayList<String>(windowHandles);
		 * 
		 * //Find the number of opened windows
		 * System.out.println("The total number of opened winows"+" "+windowList.size())
		 * ; String newwindow = windowList.get(1);
		 * 
		 * driver.switchTo().window(newwindow);
		 * 
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * if(driver.getCurrentUrl().contains("home")) {
		 * System.out.println("The home page is opened in a new window");
		 * 
		 * driver.close();} else {
		 * System.out.println("The homepage is not opened in a new window");} }
		 */
		
	
//Close all except this window
		driver.findElementByXPath("//button[text()='Do not close me ']").click();
		
		Set<String> windows = driver.getWindowHandles();
		List<String> windowsList=new ArrayList<String>(windows);
		
		System.out.println(windowsList.size());
		
		String firstwindow = windowsList.get(0);
		String secondwindow=windowsList.get(1);
		String thirdwindow=windowsList.get(2);
		
		driver.switchTo().window(secondwindow).close();
		driver.switchTo().window(thirdwindow).close();
		driver.switchTo().window(firstwindow);
			
	//Wait for 2 new Windows to open
		
		driver.findElementByXPath("//button[text()='Wait for 5 seconds']").click();
		Thread.sleep(5000);
		
		Set<String> windowsset = driver.getWindowHandles();
		List<String> windowsList1=new ArrayList<String>(windowsset);
		
		System.out.println(windowsList1.size());
		 String secwin=windowsList1.get(1);
		 String thiwin=windowsList1.get(2);
		 
		 String title1 = driver.switchTo().window(secwin).getTitle();
		 System.out.println("The title of first opened window is"+" "+title1);
		 
		 String title2 = driver.switchTo().window(thiwin).getTitle();
		 System.out.println("The title of second opened window is"+" "+title2);
		
		driver.quit();
		
		}
		

		
	}











