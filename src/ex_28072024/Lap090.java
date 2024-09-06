package ex_28072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Lap090 {
        public static void main(String[] args) {
                // Set the path of the ChromeDriver executable
                System.setProperty("Webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64");

                // Instantiate the WebDriver (for Chrome browser)
                WebDriver driver = new ChromeDriver();

                // Navigate to Google
                driver.get("https://www.google.com");

                // Verify the page title
                String expectedTitle = "Google";
                String actualTitle = driver.getTitle();

                if (expectedTitle.equals(actualTitle)) {
                        System.out.println("Test Passed: Navigated to Google successfully.");
                } else {
                        System.out.println("Test Failed: Title does not match.");
                }

                // Close the browser

                //  driver.quit();
        }
}