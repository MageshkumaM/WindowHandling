package org.testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DragandDrop {
	public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.Edge.driver","C:\\Users\\Administrator\\eclipse-workspace\\org.testOne");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		@SuppressWarnings("unused")
		WebElement down = driver.findElement(By.xpath("//a[text()='Careers']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','selenium')",user,pass,login);
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:Yellow)",user);
		js.executeScript("arguments[0].setAttribute('style','2px solid red:Yellow)",user);
		
		Object os = js.executeScript("return arguments[0].getAttribute('value')",user,pass,login);
		System.out.println(os);
		
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",user);
		
		
		
		
		
		
	}
	
	
	
	

}
