package com.loop.test.day2_practice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// navigate to Amazon
// maximize
// navigate back
// navigate forward
// refresh
//
// set up webDriver manager
// create instance of chrome driver
public class NavigateToAmazon {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
