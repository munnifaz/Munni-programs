package week5_day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElementByXPath("//button[text()='Ok']").click();
		
		driver.findElementByXPath("//span[@class='allcircle circleone']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list=new ArrayList<String>(windowHandles);
		
		String secondwindow=list.get(1);
		driver.switchTo().window(secondwindow);
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
