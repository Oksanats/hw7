package javawebui3.features.navigation;

import javawebui3.base.BaseUITest;
import javawebui3.common.Configuration;
import javawebui3.enums.NavigationBarTabs;
import javawebui3.pages.LoginPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NavigationTest extends BaseUITest {
    @ParameterizedTest
    @MethodSource("navigationTabProvider")
    public void checkMainNavigationTabsTest(NavigationBarTabs barTab) {
        new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .checkTabVisibility(barTab);

    }

    static NavigationBarTabs[] navigationTabProvider() {
        return NavigationBarTabs.values();
    }
}
