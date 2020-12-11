package week5_day2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/frame.html");
		//inside a frame
		WebElement firstframe = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[1]");
		
		driver.switchTo().frame(firstframe);
		driver.findElementByXPath("//button[@id='Click']").click();
		
		driver.switchTo().defaultContent();
		
		//inside a nest frame
		Thread.sleep(2000);
		 WebElement frame1 = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[2]");
		 
		 driver.switchTo().frame(frame1);
		 
		 WebElement frame2 = driver.findElementByXPath("(//iframe[@id='frame2'])[1]");
		  driver.switchTo().frame(frame2);
		 
		 driver.findElementByXPath("//button[@id='Click1']").click();
		 
		 driver.switchTo().defaultContent();
		 
		 //find the total number of frames in a page
		  int sizeofallframes = driver.findElementsByTagName("iframe").size();
		  System.out.println("The total number of frames are"+" "+sizeofallframes);
		
	}

}
