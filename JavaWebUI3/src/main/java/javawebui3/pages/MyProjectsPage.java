package javawebui3.pages;

import io.qameta.allure.Step;
import javawebui3.base.BaseView;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;

public class MyProjectsPage extends BaseView {
    @FindBy(xpath = ".//a[@title='Создать проект']")
    private WebElement createNewProjectButton;

    public MyProjectsPage(WebDriver driver) {
        super(driver);
    }
    @Step("Нажать кнопку 'создать проект'")
    public NewProjectPage clickOnCreateNewProjectButton() {
        createNewProjectButton.click();
        return new NewProjectPage(driver);
    }

    public MyProjectsPage checkNewProjectPopUp() {
        String message = wait10second.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                ".//div[@class='message']"))).getText();
        Assertions.assertTrue(message.contains("Проект сохранен"));
        return this;
}}
