package com.addidas.pages;

import com.addidas.pages.AbstractPage;
import com.addidas.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private static final By EMAIL_ADDRESS_FIELD = By.xpath("//input[@type='text' and @class='input-field']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@type='password']");
    private static final By SUBMIT_BUTTON = By.xpath("//div[@class='login-form__button button-main login-form__button button-main--style-dark']/button[@type='submit']");
    private static final By LOGIN_ERROR = By.xpath("//p[@class='form-row__container__info-block__error-wrapper__text error__backend Password']");
    private static final By EMPTY_PASSWORD_ERROR = By.xpath("//p[@class='form-row__container__info-block__error-wrapper__text Password']");
    private static final By EMPTY_EMAIL_ERROR = By.xpath("//p[@class='form-row__container__info-block__error-wrapper__text Email']");

    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }

    public WebElement getEmailField() {
        return webDriver.findElement(EMAIL_ADDRESS_FIELD);
    }

    public WebElement getPasswordField() {
        return webDriver.findElement(PASSWORD_FIELD);
    }

    public WebElement getSubmitButton() {
        return webDriver.findElement(SUBMIT_BUTTON);
    }

    public WebElement getLoginError() {
        return WaitersManager.waitUntilElementIsVisible(webDriver, LOGIN_ERROR);
    }

    public WebElement getEmptyEmailErrorText() {
        return WaitersManager.waitUntilElementIsVisible(webDriver, EMPTY_PASSWORD_ERROR);
    }

    public WebElement getEmptyPasswordErrorText() {
        return WaitersManager.waitUntilElementIsVisible(webDriver, EMPTY_EMAIL_ERROR);
    }
}