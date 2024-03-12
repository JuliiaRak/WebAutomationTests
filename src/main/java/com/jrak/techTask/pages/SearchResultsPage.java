package com.jrak.techTask.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends AbstractPage {

    @FindBy(css = ".ipc-title__wrapper")
    private ExtendedWebElement titlesTitle;

    @FindBy(css = ".ipc-metadata-list-summary-item__c")
    private ExtendedWebElement firstItem;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(titlesTitle);
    }

    public MoviePage openFirstItem() {
        firstItem.click();
        return new MoviePage(getDriver());
    }
}
