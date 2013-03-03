package org.wikipedia.autotests.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Wikipedia Homepage")
@Block(@FindBy(className = "search-form"))
public class MainPageElements extends HtmlElement {

    @Name("Search phrase field")
    @FindBy(id = "searchInput")
    private TextInput searchPhrase;

    @Name("Languages drop-down")
    @FindBy(id = "searchLanguage")
    private Select selectLanguage;

    @Name("Search button")
    @FindBy(name = "go")
    private Button startSearch;

    public TextInput getRequestInput() {
        return searchPhrase;
    }

    public Select getSelectLanguage() {
        return selectLanguage;
    }

    public Button getSearchButton() {
        return startSearch;
    }
}
