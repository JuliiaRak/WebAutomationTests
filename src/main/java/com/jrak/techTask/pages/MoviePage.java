package com.jrak.techTask.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MoviePage extends AbstractPage {

    @FindBy(css = ".hero__primary-text")
    private ExtendedWebElement movieTitle;

    @FindBy(xpath = "//p[@data-testid='plot']")
    private ExtendedWebElement moviePlotField;

    public MoviePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(movieTitle);
    }

    public String getmoviePlotFieldText() {
        return moviePlotField.getText();
    }
}
