package javawebui3.pages;

import io.qameta.allure.Step;
import javawebui3.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseView {

    @FindBy(xpath = ".//input[@id='prependedInput']")
    private WebElement inputLogin;

    @FindBy(xpath = ".//input[@id='prependedInput2']")
    private WebElement inputPassword;

    @FindBy(xpath = ".//button[@name='_submit']")
    private WebElement buttonSignIn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Step("ввести логин")
    public LoginPage enterLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }
    @Step("Ввести пароль")
    public LoginPage enterPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }
    @Step("Нажать кнопку войти")
    public HomePage clickLoginButton() {
        buttonSignIn.click();
        return new HomePage(driver);
    }
    public HomePage authoriseScenario(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSignIn.click();
        return new HomePage(driver);
    }
}
