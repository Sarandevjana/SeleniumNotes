package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
         driver.get("https://sampleapp.tricentis.com/101/index.php");
        
        WebElement support = driver.findElement(By.linkText("Products"));
        support.click();
        driver.navigate().back();
        WebElement webinar = driver.findElement(By.partialLinkText("Events "));
        webinar.click();
	}
}