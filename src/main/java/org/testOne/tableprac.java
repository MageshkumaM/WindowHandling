package org.testOne;

import java.util.List;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tableprac {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.Edge.driver", 
		"C:\\Users\\Administrator\\eclipse-workspace\\org.testOne\\src\\test\\resources\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();

		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		for (int i = 0; i < iTable.size(); i++) {
		WebElement table = iTable.get(i);
		WebElement tBody = table.findElement(By.tagName("tbody"));

		List<WebElement> iRow = tBody.findElements(By.tagName("tr"));
		for (int j = 0; j < iRow.size(); j++) {
		WebElement Row = iRow.get(j);

		List<WebElement> iData = Row.findElements(By.tagName("td"));
		for (int k = 0; k < iData.size(); k++) {
		WebElement data = iData.get(k);
		String text = data.getText();
		if (text.equals("UAE"));			
		System.out.println(text);
				}

			}
		}

	}

}
