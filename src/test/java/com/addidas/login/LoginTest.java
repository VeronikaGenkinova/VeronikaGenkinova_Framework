package com.addidas.login;

import com.addidas.BaseTest;
import com.addidas.drivermanagers.WebDriverFactory;
import com.addidas.flow.LoginFlow;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.addidas.utils.PopUpHelpers.closeSubscriptionPopUp;

public class LoginTest extends BaseTest {

    private static WebDriver webDriver;
    private LoginFlow loginFlow = new LoginFlow(webDriver);

    @BeforeAll
    public static void init() {
        webDriver = WebDriverFactory.getWebDriver("chrome");
    }
    @BeforeEach
    public void openNewWindow() {
        webDriver.get("https://www.adidas.ua/login");
        webDriver.manage().window().maximize();
        closeSubscriptionPopUp(webDriver);
    }

    @Test
    @DisplayName("Check error text with incorrect data login")
    public void testLoginErrorText() {
        loginFlow.login("vrnk@ukr.net","pS891UDsW");
        Assertions.assertTrue(loginFlow.isErrorTextDisplayed());
        Assertions.assertEquals(loginFlow.getLoginErrorText(), "Неправильний email або пароль. Будь ласка, спробуй ще раз");
    }

    @Test
    @DisplayName("Check error text with empty email field")
    public void testEmailErrorText() {
        loginFlow.setPasswordField("pS891UDsW");
        loginFlow.clickSubmitButton();
        Assertions.assertTrue(loginFlow.isEmptyEmailErrorTextDisplayed());
        Assertions.assertEquals(loginFlow.getEmptyEmailErrorText(), "Будь ласка, введи свою адресу електронної пошти");
    }

    @Test
    @DisplayName("Check error text with empty password field")
    public void testPasswordErrorText() {
        loginFlow.setEmailAddressField("vrnk@ukr.net");
        loginFlow.clickSubmitButton();
        Assertions.assertTrue(loginFlow.isEmptyPasswordErrorTextDisplayed());
        Assertions.assertEquals(loginFlow.getEmptyPasswordErrorText(), "Будь ласка, введи свій пароль");
    }

    @AfterEach
    public void cleanAllCookies() {
        webDriver.manage().deleteAllCookies();
    }
}

