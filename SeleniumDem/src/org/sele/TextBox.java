package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBox {
   public static void main(String[] args) {
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
       driver.manage().window().maximize();
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        WebElement insuranceData = driver.findElement(By.id("enterinsurantdata"));
        insuranceData.click();
        WebElement occupation = driver.findElement(By.id("occupation"));
        String value = occupation.getAttribute("value");
        System.out.println(value);
        
}
}
