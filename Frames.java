package week5_day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String name = "Munni";
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();

		Alert embeddedalert = driver.switchTo().alert();
		embeddedalert.sendKeys(name);
		embeddedalert.accept();

		// driver.switchTo().defaultContent();
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println(text);
		if (text.contains(name)) {
			System.out.println("The name has displayed");
		} else {
			System.out.println("The name is not displayed");
		}

	}

}
