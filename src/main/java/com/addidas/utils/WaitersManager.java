package com.addidas.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersManager {

    private static final int TIME_OUT = 6;

    private WaitersManager() {
    }

    public static WebElement waitUntilElementIsVisible(WebDriver webDriver, By selector) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.visibilityOf(webDriver.findElement(selector)));
    }
}
