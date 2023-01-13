package Inheritance_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Child_Class extends Parent_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
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
