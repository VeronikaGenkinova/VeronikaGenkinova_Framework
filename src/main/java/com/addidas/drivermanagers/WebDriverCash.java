package com.addidas.drivermanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WebDriverCash {

    private static Map<String, WebDriver> webDriver = new HashMap<>();

    private WebDriverCash() {
    }

    public static WebDriver getDriver(String browserName) {
        if (Objects.nonNull(webDriver.get(browserName))
                && Objects.nonNull(((RemoteWebDriver)webDriver.get(browserName)).getSessionId())) {
            return webDriver.get(browserName);
        } else {
            webDriver.put(browserName, WebDriverFactory.getWebDriver(browserName));
            return webDriver.get(browserName);
        }
    }
}
