package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
         driver.get("https://sampleapp.tricentis.com/101/app.php");
        
         WebElement make = driver.findElement(By.id("make"));
         Select s = new Select(make);
         s.selectByIndex(2);
         WebElement seat = driver.findElement(By.id("numberofseats"));
         Select s1 = new Select(seat);
         s1.selectByValue("3");
        WebElement fuel = driver.findElement(By.id("fuel"));
        Select s2 = new Select(fuel);
         s2.selectByVisibleText("Gas");
         
         List<WebElement> Totaloptions = s2.getOptions();
                      int size = Totaloptions.size();
                      System.out.println("Number of options available in the dropdown : " + size);
                      
                      Thread.sleep(3000);
                      
                      WebElement nextButton = driver.findElement(By.xpath("(//button[text()='Next »'])[1]"));
                      nextButton.click();
                     WebElement country = driver.findElement(By.id("country"));
                     country.sendKeys("Australia");
                      
	}

}
