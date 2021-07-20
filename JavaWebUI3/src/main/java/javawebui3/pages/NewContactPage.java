package javawebui3.pages;

import io.qameta.allure.Step;
import javawebui3.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactPage extends BaseView {
    @FindBy(xpath = ".//input[@name='crm_contact[lastName]']")
    private WebElement lastNameInput;

    @FindBy(xpath = ".//input[@name='crm_contact[firstName]']")
    private WebElement firstNameInput;

    @FindBy(xpath = ".//div[@class='select2-container select2 input-widget']/a")
    private WebElement nameOrgContSelect;

    @FindBy(xpath = ".//div[@id='select2-drop']/ul[2]/li[1]/div")
    private WebElement optionOrgContSelect;

    @FindBy(xpath = ".//input[@name='crm_contact[jobTitle]']")
    private WebElement positionInput;

    @FindBy(xpath = ".//button[@class='btn btn-success action-button']")
    private WebElement createContactButton;




    public NewContactPage(WebDriver driver) {
        super(driver);
    }
    @Step("Ввести имя")
    public NewContactPage enterLastNameInput(String description) {
        lastNameInput.sendKeys(description);
        return this;
    }
    @Step("Ввести фамилию")
    public NewContactPage enterFirstNameInput(String description) {
        firstNameInput.sendKeys(description);
        return this;
    }

    public NewContactPage clickNameOrgContSelect() {
        nameOrgContSelect.click();
        return this;
    }

    public NewContactPage clickOptionOrgContSelect() {
        optionOrgContSelect.click();
        return this;
    }

    public NewContactPage enterPositionInput(String description) {
        positionInput.sendKeys(description);
        return this;
    }
    public ContactsPage clickCreateContactButton() {
        createContactButton.click();
        return new ContactsPage(driver);
    }
}
