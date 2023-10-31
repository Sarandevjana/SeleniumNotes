package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Java_IDE\\user input\\SeleniumDem\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
         driver.get("https://sampleapp.tricentis.com/101/app.php");
         WebElement insuranceData = driver.findElement(By.id("enterinsurantdata"));
         insuranceData.click();
         WebElement male = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
         male.click();
         WebElement speed = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
         speed.click();
   
         WebElement sky = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span"));
         sky.click();                      
			}
}
