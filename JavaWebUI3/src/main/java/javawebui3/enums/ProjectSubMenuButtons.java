package javawebui3.enums;

import javawebui3.base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ProjectSubMenuButtons implements SubMenuButtons {
    MY_PROJECTS(".//div[@id='main-menu']/ul/li[3]/ul/li[4]/a/span"),
    ALL_PROJECT(".//*[@id='main-menu']/ul/li[3]/ul/li[3]/a/span"),
    CHANGE_REQUESTS_BB(".//*[@id='main-menu']/ul/li[3]/ul/li[5]/a/span");








    private final By by;

    ProjectSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}

