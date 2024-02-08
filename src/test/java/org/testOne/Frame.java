package org.testOne;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) throws Throwable {
		
		String frames = "https://chercher.tech/practice/frames-example-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(frames);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("Magesh");
		
		driver.switchTo().frame("frame3");
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"a\"]"));		
		element1.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"animals\"]"));		
		Select dropdown = new Select(element2);
//		dropdown.selectByVisibleText("Baby Cat");
		dropdown.selectByIndex(3);
		
		
	}
	

}
