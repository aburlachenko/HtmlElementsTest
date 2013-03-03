package org.wikipedia.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.wikipedia.autotests.elements.MainPageElements;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class MainPage {

    private MainPageElements commonElements;

    public MainPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void enterSearchRequest(String request) {
        commonElements.getRequestInput().sendKeys(request);
    }

    public void selectLanguage(String language) {
        commonElements.getSelectLanguage().selectByVisibleText(language);
    }

    public void clickSearchButton() {
        commonElements.getSearchButton().click();
    }
}