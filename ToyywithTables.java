package week5_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyywithTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/table.html");

		WebElement table = driver.findElementByXPath("//table[@id='table_id']");

		// to get the row count
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");

		System.out.println(rows.size());

		// to get the coloumn count
		List<WebElement> cols = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td");
		System.out.println(cols.size());
		List listvalues = new ArrayList();

		// Get the progress value of "Learn to interact with elements"

		for (int i = 2; i <= rows.size(); i++) {

			WebElement elementname = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[1]");
			String elementvalue = elementname.getText();

			if (elementvalue.equals("Learn to interact with Elements")) {

				WebElement progressval = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[2]");

				System.out.println(progressval.getText());

			}
		}
		// check the vital task for the least completed progress

		for (int i = 2; i <= rows.size(); i++) {

			WebElement progresspercentage = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[2]");

			String pvalue = progresspercentage.getText();
			pvalue = pvalue.replace("%", "");
			// System.out.println(pvalue);
			int perIntvalue = Integer.parseInt(pvalue);

			listvalues.add(perIntvalue);
		}

		Collections.sort(listvalues);

		Object val = listvalues.get(0);

		WebElement checkbox = driver
				.findElementByXPath("//td[contains(text()," + val + ")]/following-sibling::td/input");
		checkbox.click();

	}

}
