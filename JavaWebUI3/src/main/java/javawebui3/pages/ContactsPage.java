package javawebui3.pages;

import javawebui3.base.BaseView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactsPage extends BaseView {

    @FindBy(xpath = ".//a[@class='btn back icons-holder-text ']")
    private WebElement createNewContactButton;


    public ContactsPage(WebDriver driver) {
            super(driver);
    }
    public NewContactPage clickOnCreateNewContactButton(){
        createNewContactButton.click();
        return new NewContactPage(driver);
    }
    public ContactsPage checkNewContactPopUp() {
        String message = wait10second.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                ".//div[@class='message']"))).getText();
        assertTrue(message.contains("Контактное лицо сохранено"));
        return this;
    }





}
