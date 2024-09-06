package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LaunchChomeBrowser {
    public static void main(String[] args) {

     System.setProperty("WebDriver.chrome.driver","C://Users//User168.DESKTOP-HKKD1BT//Downloads//selenium-java-4.21.0.exe");
     WebDriver driver = new ChromeDriver();

     driver.manage().window().maximize();
   //  driver.manage().deleteAllCookies();

        driver.get("https://demo.nopcommerce.com/");
//        System.out.println(driver.getTitle());
//        System.out.println("getting the current url" + driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        //is displayed method
        // is enabled method
       // driver.findElement(By.xpath("//input[@id=\"MDjtu6\"]))
       driver.findElement(By.id("MDjtu6")).click();
      WebElement element = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
        System.out.println("verify the webelement is enabled" + element.isEnabled());

    }

}
