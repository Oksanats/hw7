package javawebui3.features.login;

import io.qameta.allure.Feature;
import javawebui3.base.BaseUITest;
import javawebui3.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static javawebui3.common.Configuration.*;
@Feature("Проверка логина")
public class PositiveLoginTest extends BaseUITest {


    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .checkUrl(BASE_URL);
    }
}
