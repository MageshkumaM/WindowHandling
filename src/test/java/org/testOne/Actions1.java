package org.testOne;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {
	public static void main(String[] args) throws Throwable {

		String ms = "https://www.meesho.com/";
		String fb = "https://www.facebook.com/";

		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.get(ms);
		driver1.manage().window().maximize();

		WebElement element = driver1.findElement(By.xpath("//*[text()='Newsroom']"));

		Actions a = new Actions(driver1);
		a.moveToElement(element).perform();
		a.click(element).perform();

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(fb);
		driver.manage().window().maximize();

		WebElement element1 = driver.findElement(By.id("email"));

		Actions a1 = new Actions(driver);
		a1.sendKeys(element1, "Magesh").perform();
		a1.moveToElement(element1).perform();
		a1.click(element1).perform();
		a1.doubleClick().perform();
		a1.contextClick().perform();

		Robot r = new Robot();

		for (int i = 0; i < 2; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File dec = new File("C:\\Users\\Administrator\\eclipse-workspace\\org.testOne\\src\\take\\image.png");
		FileUtils.copyFile(source, dec);

	}

}
