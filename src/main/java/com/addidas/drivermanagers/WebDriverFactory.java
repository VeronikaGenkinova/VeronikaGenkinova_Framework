package com.addidas.drivermanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver getWebDriver(String webDriver) {
        switch (webDriver) {
            case "chrome":
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                return new ChromeDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
                return new EdgeDriver();
            default:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                return new ChromeDriver();
        }
    }
}

