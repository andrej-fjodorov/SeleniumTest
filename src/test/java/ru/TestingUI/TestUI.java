package ru.TestingUI;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUI {
    public InternetExplorerDriver driver;

    @BeforeMethod
    public void SetUpTest() {
        System.setProperty("webdriver.ie.driver", "C:/Temp/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }

    @Test
    @Description(value = "Проверка загрузки главной страницы")
    @Owner(value = "Фёдоров Андрей Евгеньевич")
    @Step("Проверка отображения показателей в виде таблицы")
    public void OpenIndexPage() {

        driver.get("http://stsrf.volnc.ru/site/table");
    }

    @AfterMethod
    public void CloseTest() {

        driver.quit();

    }
}