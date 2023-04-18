package com.addidas.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PopUpHelpers {

    private static final By CLOSE_SUBSCRIPTION_POP_UP = By.xpath("//div[@class='v-popup__container__close-btn']");

    private PopUpHelpers() {
    }

    public static void closeSubscriptionPopUp(WebDriver webDriver) {
        try {
            webDriver.findElement(CLOSE_SUBSCRIPTION_POP_UP).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop-up is not shown");
        }
    }
}