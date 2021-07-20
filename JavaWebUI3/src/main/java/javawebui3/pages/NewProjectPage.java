package javawebui3.pages;

import javawebui3.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewProjectPage extends BaseView {
    @FindBy(xpath = ".//input[@name='crm_project[name]']")
    private WebElement nameProjectInput;


    @FindBy(xpath = ".//a[@class='select2-choice select2-default']")
    private WebElement nameOrgSelect;


    @FindBy(xpath = ".//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']")
    private WebElement optionOrgSelect;

    @FindBy(xpath = ".//select[@name='crm_project[businessUnit]']")
    private WebElement subdivision;

    @FindBy(xpath = ".//select[@name='crm_project[curator]']")
    private WebElement curator;

    @FindBy(xpath = ".//select[@name='crm_project[rp]']")
    private WebElement leader;

    @FindBy(xpath = ".//select[@name='crm_project[manager]']")
    private WebElement manager;

    @FindBy(xpath = ".//select[@name='crm_project[contactMain]']")
    private WebElement contact;

    @FindBy(xpath = ".//select[@name='crm_project[contactMain]']")
    private WebElement createProjectButton;

    public NewProjectPage(WebDriver driver) {
        super(driver);
    }

    public NewProjectPage enterName(String description) {
        nameProjectInput.sendKeys(description);
        return this;
    }
    public NewProjectPage clickNameOrgSelect() {
        nameOrgSelect.click();
        return this;
    }

    public NewProjectPage clickOptionOrgSelect() {
        optionOrgSelect.click();
        return this;
    }
    public NewProjectPage selectSubdivision(int value) {
        Select subdivision1 = new Select(subdivision);
        subdivision1.selectByValue(String.valueOf(value));
        return this;
    }
    public NewProjectPage selectCurator(int value) {
        Select curator1 = new Select(curator);
        curator1.selectByValue(String.valueOf(value));
        return this;
    }

    public NewProjectPage selectLeader(int value) {
        Select leader1 = new Select(leader);
        leader1.selectByValue(String.valueOf(value));
        return this;
    }
    public NewProjectPage selectManager(int value) {
        Select manager1 = new Select(manager);
        manager1.selectByValue(String.valueOf(value));
        return this;
    }
    public NewProjectPage selectContact(int value) {
        Select contact1 = new Select(manager);
        contact1.selectByValue(String.valueOf(value));
        return this;
    }
    public MyProjectsPage clickCreateProjectButton() {
        createProjectButton.click();
        return new MyProjectsPage(driver);
    }



}
