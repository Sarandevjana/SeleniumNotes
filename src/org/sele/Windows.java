package org.sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	        driver.get("https://sampleapp.tricentis.com/101/app.php");
	        
	        String parentWindow = driver.getWindowHandle();
	        
           WebElement link = driver.findElement(By.xpath("//a[@title='Visit Support']"));
           link.click();
           Set<String> Children1 = driver.getWindowHandles();
           for (String newWindow : Children1) {
			driver.switchTo().window(newWindow);
			int NoOfWindow = driver.getWindowHandles().size();
			System.out.println("number of window is : " + NoOfWindow);
			if(!newWindow.equals(parentWindow)) {
				driver.switchTo().window(newWindow);
				driver.close();
			}
		}
           
	}

}
