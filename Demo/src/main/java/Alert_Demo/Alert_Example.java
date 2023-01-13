package Alert_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		button1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		WebElement button2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		button2.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		WebElement button3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		button3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement button4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		button4.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("WELCOME");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		

	}

}
