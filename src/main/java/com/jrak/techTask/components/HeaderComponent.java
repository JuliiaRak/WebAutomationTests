package com.jrak.techTask.components;

import com.jrak.techTask.pages.SearchResultsPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends AbstractUIObject {

    @FindBy(css = ".imdb-header-search__input")
    private ExtendedWebElement searchInputField;

    @FindBy(css = "#suggestion-search-button")
    private ExtendedWebElement searchButton;

    public HeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void enterSearchQuery(String searchQuery) {
        searchInputField.type(searchQuery);
    }

    public SearchResultsPage clickSearchButton() {
        searchButton.click();
        return new SearchResultsPage(getDriver());
    }

}
