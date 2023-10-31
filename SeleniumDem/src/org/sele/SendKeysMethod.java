package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeysMethod {
	public static void main(String[] args) {	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://sampleapp.tricentis.com/101/app.php");
    WebElement insuranceData = driver.findElement(By.id("enterinsurantdata"));
    insuranceData.click();
    WebElement fname = driver.findElement(By.id("firstname"));
      fname.sendKeys("saravanan");
      WebElement lname = driver.findElement(By.id("lastname"));
      lname.sendKeys("sarandevjana");   
}
}