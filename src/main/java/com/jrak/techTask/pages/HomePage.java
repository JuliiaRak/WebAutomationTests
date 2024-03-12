package com.jrak.techTask.pages;

import com.jrak.techTask.components.HeaderComponent;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(css = ".ipc-title__wrapper")
    private ExtendedWebElement whatToWatchTitle;

    @FindBy(css = "#imdbHeader")
    private HeaderComponent headerComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(whatToWatchTitle);
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
}
