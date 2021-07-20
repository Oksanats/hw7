package javawebui3.views;

import javawebui3.base.BaseView;
import javawebui3.base.SubMenu;
import javawebui3.enums.NavigationBarTabs;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static javawebui3.enums.NavigationBarTabs.COUNTER_PARTIES;

public class NavigationBar extends BaseView {


    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public SubMenu moveCursorToNavigationTab(NavigationBarTabs tab) {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();
        switch (tab) {
            case PROJECTS :
                return new ProjectSubMenu(driver);
            default:
                throw new IllegalArgumentException("Another tabs currently not implemented");
        }
    }

    public NavigationBar checkTabVisibility(NavigationBarTabs tab) {
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());
        return this;
    }


    public SubMenu moveCursorToNavigationTab1(NavigationBarTabs tab1) {  Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(tab1.getBy()))
                .build()
                .perform();
        switch (tab1) {
            case COUNTER_PARTIES :
                return new ContactFacesSubMenu(driver);
            default:
                throw new IllegalArgumentException("Another tabs currently not implemented");
        }
    }
}
