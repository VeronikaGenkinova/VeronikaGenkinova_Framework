package com.addidas.pages;

import com.addidas.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends AbstractPage {
    private static final By PAGE_HEADER = By.xpath("//div[@class='empty__title']");
    private static final By EMTY_NOTIFICATION = By.xpath("//p[@class='common-text empty__text']");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getPageHeader() {
        return webDriver.findElement(PAGE_HEADER);
    }

    public WebElement getEmptyCartNotification() {
        return webDriver.findElement(EMTY_NOTIFICATION);
    }

}
