package EdgeDrive_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDrive_Example {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("", "");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.click();
		mail.clear();
		mail.sendKeys("565465");
		Thread.sleep(2000);

		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.click();
		Password.clear();
		Password.sendKeys("565465");
		Thread.sleep(2000);

		boolean displayed = mail.isDisplayed();
		System.out.println(displayed);

		String Text = mail.getText();
		System.out.println(Text);
	
		Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
		


	}

}
