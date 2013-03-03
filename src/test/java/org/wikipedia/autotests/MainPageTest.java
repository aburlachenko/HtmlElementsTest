package org.wikipedia.autotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.wikipedia.autotests.pages.MainPage;

public class MainPageTest {
    private WebDriver driver = new FirefoxDriver();
    private MainPage searchPage = new MainPage(driver);

    @BeforeTest
    public void loadPage() {
        driver.get("http://www.wikipedia.org");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchInEnglish() {
        searchPage.enterSearchRequest("page object");
        searchPage.selectLanguage("English");
        searchPage.clickSearchButton();
    }
}
