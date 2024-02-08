package org.testOne;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args)throws Throwable {
		
		String alert = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(alert);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("alert"));
		element.click();
		Thread.sleep(5000);
		Alert simple = driver.switchTo().alert();
		simple.accept();
		
				
		WebElement element1 = driver.findElement(By.name("confirmation"));
		element1.click();
		Thread.sleep(5000);
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		
		WebElement element3 = driver.findElement(By.name("prompt"));
		element3.click();
		Thread.sleep(5000);
		Alert promt = driver.switchTo().alert();
		promt.sendKeys ("Dhruv");
		promt.accept();
			
	}

}
