package Edge_Chrome_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_Demo extends Base_Class {
	// public static WebDriver driver;

	public static void main(String[] args) {

		Browser_launch("chrome");

		// Launch the URL
		driver.get("https://demoqa.com/buttons");
		System.out.println("demoqa webpage displayed");

		// Maximise browser window
		driver.manage().window().maximize();

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		

		// Retrieve WebElement to perform Double Click
		WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(DoubleClick);

		// Retrieve WebElement to perform right click
		WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

		// Right Click the button to display Context Menu&nbsp;
		actions.contextClick(btnElement).perform();
		System.out.println("Right click Context Menu displayed");

	}

}
