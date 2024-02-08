package org.testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edits {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.Edge.driver",
		"C:\\Users\\Administrator\\eclipse-workspace\\org.testOne\\src\\test\\resources\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Administrator\\Documents\\Edit1.exe");

	}

}
