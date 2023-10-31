package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
         driver.get("https://sampleapp.tricentis.com/101/app.php");
        
         Thread.sleep(3000);
         WebElement nextButton = driver.findElement(By.xpath("(//button[text()='Next »'])[1]"));
         nextButton.click();
          
         WebElement prev = driver.findElement(By.id("preventervehicledata"));
         Point location = prev.getLocation();
         int x = location.getX();
         int y = location.getY();
         System.out.println("Lacation of x axis is =" + x + "," +"location of y axis is = "+ y );
         
         WebElement open = driver.findElement(By.name("Open"));
         String colour = open.getCssValue("background");
         System.out.println("button colour is : " + colour);
         
         WebElement DOB = driver.findElement(By.id("opendateofbirthcalender"));
         Dimension size = DOB.getSize();
         int height = size.getHeight();
         int width = size.getWidth();
         System.out.println("Button hight is :" + height);
         System.out.println("Button width is : " + width);
	} 

}
