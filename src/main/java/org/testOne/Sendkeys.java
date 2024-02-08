package org.testOne;

import java.util.ArrayList;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sendkeys {
public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.edhe.drver","C:\\Users\\Administrator\\eclipse-workspace\\org.testOne");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Redmi Mobiles",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='_4rR01t'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='_4rR01t'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='_4rR01t'])[3]")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		List<String> child1 = new ArrayList<>(child1);
		
				driver.switchTo().window(child1.get(3));
				String name =driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
				System.out.println(name);
						
			}
		}
		
	


