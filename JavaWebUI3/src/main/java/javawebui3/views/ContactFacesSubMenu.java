package javawebui3.views;

import javawebui3.base.BaseView;
import javawebui3.base.SubMenu;
import javawebui3.base.SubMenuButtons;
import javawebui3.enums.ContactSubMenuButtons;
import javawebui3.enums.ProjectSubMenuButtons;
import javawebui3.pages.ContactsPage;
import javawebui3.pages.MyProjectsPage;
import org.openqa.selenium.WebDriver;

public class ContactFacesSubMenu extends SubMenu {
    public ContactFacesSubMenu(WebDriver driver) {
        super(driver);
    }


    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ContactSubMenuButtons) {
            switch ((ContactSubMenuButtons) buttons) {
                case  CONTACT_FACES:
                    driver.findElement(((ContactSubMenuButtons) buttons).getBy()).click();
                    return new ContactsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }

}
