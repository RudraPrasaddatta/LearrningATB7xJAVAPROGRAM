package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LaunchChomeBrowser {
    public static void main(String[] args) {

     System.setProperty("WebDriver.chrome.driver","C://Users//User168.DESKTOP-HKKD1BT//Downloads//selenium-java-4.21.0.exe");
     WebDriver driver = new ChromeDriver();

     driver.manage().window().maximize();
   //  driver.manage().deleteAllCookies();

        driver.get("https://demo.automationtesting.in/Index.html");
//        System.out.println(driver.getTitle());
//        System.out.println("getting the current url" + driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        //is displayed method
        // is enabled method
       // driver.findElement(By.xpath("//input[@id=\"MDjtu6\"]))
       driver.findElement(By.id("email")).sendKeys("dathaprasad.rudra@gmail.com");
       driver.findElement(By.id("enterimg")).click();
       driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Tester");
       driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Website");
       driver.findElement(By.xpath("(//textarea[@rows=\"3\"])")).sendKeys("abc....");
       driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("test01@gmail.com");
       driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9656565556");
       driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
       driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
       WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
       Select sel2 = new Select(ele2);
       sel2.selectByIndex(1);
       WebElement elem = driver.findElement(By.id("Skills"));
        Select s = new Select(elem);
        s.selectByIndex(2);

    }

}
