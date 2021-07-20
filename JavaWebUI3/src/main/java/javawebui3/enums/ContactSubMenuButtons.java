package javawebui3.enums;

import javawebui3.base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ContactSubMenuButtons implements SubMenuButtons {
    ORGANIZATION (".//div[@id='main-menu']/ul/li[1]/ul/li[3]/a/span"),
    CONTACT_FACES(".//div[@id='main-menu']/ul/li[1]/ul/li[4]/a");


    private final By by;

    ContactSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
