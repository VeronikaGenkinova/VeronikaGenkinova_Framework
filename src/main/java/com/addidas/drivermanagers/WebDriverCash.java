package com.addidas.drivermanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Objects;

public class WebDriverCash {

    private static WebDriver driver;

    private WebDriverCash() {
    }

    public static WebDriver getDriver() {
        if(Objects.nonNull(driver)){
            return driver;
        } else {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            driver = new ChromeDriver();
            return driver;
        }
    }
}
