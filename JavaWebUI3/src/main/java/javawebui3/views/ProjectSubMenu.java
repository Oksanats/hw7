package javawebui3.views;

import javawebui3.base.BaseView;
import javawebui3.base.SubMenu;
import javawebui3.base.SubMenuButtons;
import javawebui3.enums.ProjectSubMenuButtons;
import javawebui3.pages.MyProjectsPage;
import org.openqa.selenium.WebDriver;

public class ProjectSubMenu extends SubMenu {


    public ProjectSubMenu(WebDriver driver) {
    super(driver);
}


    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ProjectSubMenuButtons) {
            switch ((ProjectSubMenuButtons) buttons) {
                case MY_PROJECTS:
                    driver.findElement(((ProjectSubMenuButtons) buttons).getBy()).click();
                    return new MyProjectsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
