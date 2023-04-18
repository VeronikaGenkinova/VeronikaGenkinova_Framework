package com.addidas;

import com.addidas.drivermanagers.WebDriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseTest {

    private static WebDriver webDriver;
    private static final int WAIT = 3000;

    @BeforeAll
    public static void init() {
        webDriver = WebDriverFactory.getWebDriver("chrome");
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(WAIT));
    }

    @AfterAll
    public static void quitWebDriver() {
        webDriver.quit();
    }
}
