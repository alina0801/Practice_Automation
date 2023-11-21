package com.loop.test.day2_practice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //setting up the web driver
        WebDriverManager.chromedriver().setup();

        //create an instance (an object) of web-driver // you can set up edge
        WebDriver driver = new ChromeDriver(); // launches browser without any address
      //  Thread.sleep(5000); // 5 sec


        //navigate to web page
        driver.get("https://Loopcamp.io");
        // the same thing as .get
        driver.navigate().to("https://google.com"); // the same thing as .get



        //maximize
        driver.manage().window().maximize();
        //maximize full screen
        driver.manage().window().fullscreen();



        driver.navigate().to("https://www.etsy.com");
        driver.navigate().back(); // back to "google" in our case
        driver.navigate().forward(); // navigate forward again to etsy

        //navigate refresh the page
        driver.navigate().refresh();



        //quit and close
        driver.quit(); // --> quit only active
        driver.close(); // --> close for good , kills the instance






    }
}
