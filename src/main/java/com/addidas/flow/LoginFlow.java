package com.addidas.flow;

import com.addidas.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver webDriver) {
        loginPage = new LoginPage(webDriver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setEmailAddressField(String emailAddressField) {
        loginPage.getEmailField()
                .sendKeys(emailAddressField);
    }

    public void setPasswordField(String passwordField) {
        loginPage.getPasswordField()
                .sendKeys(passwordField);
    }

    public void clickSubmitButton() {
        loginPage.getSubmitButton().click();
    }

    public String getLoginErrorText() {
        return loginPage.getLoginError().getText();
    }

    public boolean isErrorTextDisplayed() {
        return loginPage.getLoginError().isDisplayed();
    }

    public String getEmptyEmailErrorText() {
        return loginPage.getEmptyEmailErrorText().getText();
    }

    public boolean isEmptyEmailErrorTextDisplayed() {
        return loginPage.getEmptyEmailErrorText().isDisplayed();
    }

    public String getEmptyPasswordErrorText() {
        return loginPage.getEmptyPasswordErrorText().getText();
    }

    public boolean isEmptyPasswordErrorTextDisplayed() {
        return loginPage.getEmptyPasswordErrorText().isDisplayed();
    }

    public void login(String email, String password) {
        setEmailAddressField(email);
        setPasswordField(password);
        clickSubmitButton();
    }
}
