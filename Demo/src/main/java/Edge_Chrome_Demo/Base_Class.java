package Edge_Chrome_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {

	public static WebDriver driver;

	public static void Browser_launch(String Browser_Name) {

		if (Browser_Name.equalsIgnoreCase("Edge")) {

			System.setProperty("", "");
			driver = new EdgeDriver();
		}

		else if (Browser_Name.equalsIgnoreCase("Chrome")) {

			System.setProperty("", "");
			driver = new ChromeDriver();
		}

	}
}
