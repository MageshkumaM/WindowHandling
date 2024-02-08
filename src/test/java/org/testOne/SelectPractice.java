package org.testOne;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SelectPractice {
	
	public static void main(String[] args) throws InterruptedException{
		
		String dropDown = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(dropDown);
		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.xpath(("//select[@id='first']")));
//		WebElement element =driver.findElement(By.xpath(("//select[@id='second']")));
		
		Select s = new Select(element);
		s.selectByIndex(1);
		Thread.sleep(5000);
		s.selectByValue("Yahoo");
		Thread.sleep(5000);
		s.selectByVisibleText("Iphone");
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		driver.quit();
		
		List<WebElement> options =s.getOptions();
		for(int i=0; i<options.size();i++) {
		WebElement element2 =options.get(i);
		String  ddvalues = element2.getText();
		System.out.println(ddvalues);
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.deselectByVisibleText(dropDown);
		
		List<WebElement> allSelect=s.getAllSelectedOptions();
		for(int i=0; i<allSelect.size();i++) {
			WebElement webElement= allSelect.get(i);
			String text= webElement.getText();
			System.out.println(text);
		}
		
		
	}

	}

