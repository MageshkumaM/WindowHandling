package org.testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Administrator\\eclipse-workspace\\org.testOne\\target\\driver\\msedgedriver.exe");
     WebDriver driver = new EdgeDriver();
     
     driver.get("https://www.facebook.com/");
     driver.navigate().to("https://www.facebook.com/");
   String url = ("https://www.facebook.com/");
	driver.get(url);
     driver.manage().window().maximize();
     
     driver.navigate().refresh();
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().forward();
     
     driver.switchTo().newWindow(WindowType.TAB);
     String currentUrl = driver.getCurrentUrl();
     System.out.println(currentUrl);
     
     
	if(url.equals(currentUrl)) {
    	 System.out.println("Given url is correct");
    	 }
     else {
    	System.out.println("not a url"); 
     }
     
    String title =  driver.getTitle();
    System.out.println(title);
     
     driver.close();
     driver.quit();
    
}
}
