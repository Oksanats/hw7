package javawebui3.features.contactandprojecttests;

import io.qameta.allure.Feature;
import javawebui3.base.BaseUITest;
import javawebui3.common.Configuration;
import javawebui3.enums.NavigationBarTabs;
import javawebui3.enums.ProjectSubMenuButtons;
import javawebui3.pages.LoginPage;
import javawebui3.pages.MyProjectsPage;
import org.junit.jupiter.api.Test;
@Feature("создание проекта позитивный тест")
public class NewProjectTest extends BaseUITest {
    private static final String NAME_ORG = "org14654";
    @Test
    public void createNewProjectPositiveTest(){
        MyProjectsPage expensesScreen = (MyProjectsPage) new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.PROJECTS)
                .clickSubMenuButton(ProjectSubMenuButtons.MY_PROJECTS);

        expensesScreen
                .clickOnCreateNewProjectButton()
                .enterName(NAME_ORG)
                .clickNameOrgSelect()
                .clickOptionOrgSelect()
                .selectSubdivision(1)
                .selectCurator(93)
                .selectLeader(116)
                .selectManager(8)
                .selectContact(1802)
                .clickCreateProjectButton();

    }
}
