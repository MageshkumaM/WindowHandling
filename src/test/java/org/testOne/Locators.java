package org.testOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Administrator\\eclipse-workspace\\org.testOne\\target\\driver\\msedgedriver.exe");
	     WebDriver driver = new EdgeDriver();
	
		String url = ("https://www.facebook.com/");
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Magesh");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(int i=0; i<link.size();i++) {
		WebElement p =link.get(i);
		String text = p.getText();
		System.out.println(text);
		

	}
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();

}}
