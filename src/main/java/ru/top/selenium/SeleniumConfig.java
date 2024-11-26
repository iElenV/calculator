package ru.top.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class SeleniumConfig {
    private  WebDriver webDriver;

    static {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\student\\Desktop\\QA32_test_project\\chromedriver.exe");
    }

    public SeleniumConfig () {
         webDriver = new ChromeDriver();
         webDriver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

    }

    public  WebDriver getWebDriver() {
        return webDriver;
    }
}
