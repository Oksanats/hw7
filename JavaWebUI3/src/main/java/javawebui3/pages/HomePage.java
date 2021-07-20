package javawebui3.pages;

import javawebui3.views.NavigationBar;
import javawebui3.base.BaseView;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage extends BaseView{
    private NavigationBar navigationBar;


    public HomePage(WebDriver driver) {
        super(driver);
        this.navigationBar = new NavigationBar(driver);
    }

    public void checkUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }

    public NavigationBar getPageNavigation() {
        return navigationBar;
    }
}
