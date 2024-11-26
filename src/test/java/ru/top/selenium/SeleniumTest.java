package ru.top.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeleniumTest {

    private static SeleniumConfig seleniumConfig;

    @BeforeAll
    static  void init() {
        seleniumConfig = new SeleniumConfig();
    }
    @Test
    public void openGoogleTest() {
        WebDriver webDriver =  seleniumConfig.getWebDriver();
        webDriver.get("http://google.com");
        String  title = webDriver.getTitle();
       // webDriver.close();
        Assertions.assertEquals("Google", title);

    }
    @Test
    public void GoogleFindButtonTest() {
        WebDriver webDriver =  seleniumConfig.getWebDriver();
        webDriver.get("http://google.com");
        WebElement findButton = webDriver.findElement(By.className("gNO89b"));
        String value = findButton.getAttribute("value");
        //webDriver.close();
        Assertions.assertEquals("Поиск в Google", value);

    }
    @AfterAll
    public  static void tearDown(){
        seleniumConfig.getWebDriver().close();
    }
}
