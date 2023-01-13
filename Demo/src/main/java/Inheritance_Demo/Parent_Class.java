package Inheritance_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Class {
	
	public static WebDriver driver;

	public static void Browser_launch(String Browser_Name) throws InterruptedException {
		
		
		System.setProperty("", "");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}


}
