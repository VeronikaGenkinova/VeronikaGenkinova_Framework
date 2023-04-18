package com.addidas.cart;

import com.addidas.BaseTest;
import com.addidas.drivermanagers.WebDriverFactory;
import com.addidas.flow.CartFlow;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static com.addidas.utils.PopUpHelpers.closeSubscriptionPopUp;

public class CartTest extends BaseTest {

    private static WebDriver webDriver;
    private CartFlow cartFlow = new CartFlow(webDriver);

    @BeforeAll
    public static void init() {
        webDriver = WebDriverFactory.getWebDriver("chrome");
    }

    @BeforeEach
    public void openNewWindow() {
        webDriver.get("https://www.adidas.ua/cart");
        webDriver.manage().window().maximize();
        closeSubscriptionPopUp(webDriver);
    }

    @Test
    @DisplayName("Check cart page header")
    public void testCartHeader() {
        String expected = "КОШИК ПОРОЖНІЙ";

        Assertions.assertEquals(expected, cartFlow.getHeaderText());
    }

    @Test
    @DisplayName("Check empty cart text")
    public void testEmptyCartPageText() {
        String expected = "Тут з’являться товари додані до кошика. Почати покупки?";

        Assertions.assertTrue(cartFlow.isEmptyCartTextDisplayed());
        Assertions.assertEquals(expected, cartFlow.getEmptyCartNotification(),"Empty cart page contains notification");
    }

    @AfterEach
    public void cleanAllCookies() {
        webDriver.manage().deleteAllCookies();
    }
}


