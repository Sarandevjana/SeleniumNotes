package org.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        
        WebElement alertBox = driver.findElement(By.id("alertButton"));
        alertBox.click();
       Alert alert = driver.switchTo().alert();
       alert.accept();
       
       
       WebElement timeAlert = driver.findElement(By.id("timerAlertButton"));
       timeAlert.click();
       Thread.sleep(5000);
       alert.accept();
       
	}
	
	
	

}
