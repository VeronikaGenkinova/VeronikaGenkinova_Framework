package com.addidas.flow;

import com.addidas.pages.CartPage;
import org.openqa.selenium.WebDriver;

public class CartFlow {

    private CartPage cartPage;

    public CartFlow(WebDriver webDriver) {
        this.cartPage = new CartPage(webDriver);
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public String getHeaderText() {
        return cartPage.getPageHeader().getText();
    }

    public String getEmptyCartNotification() {
        return cartPage.getEmptyCartNotification().getText();
    }

    public boolean isEmptyCartTextDisplayed() {
        return cartPage.getEmptyCartNotification().isDisplayed();
    }
}
