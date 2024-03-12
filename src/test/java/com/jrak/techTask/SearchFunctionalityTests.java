package com.jrak.techTask;

import com.jrak.techTask.pages.HomePage;
import com.jrak.techTask.pages.MoviePage;
import com.jrak.techTask.pages.SearchResultsPage;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFunctionalityTests extends AbstractTest {

    private static final String MOVIE_TITLE = R.TESTDATA.get("movie_title");

    private static final String MOVIE_PLOT = R.TESTDATA.get("movie_plot");

    @Test(description = "Check the existence and proper work of the search field, check proper opening of movie page")
    public void verifySearchFunctionality() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

        homePage.getHeaderComponent().enterSearchQuery(MOVIE_TITLE);
        SearchResultsPage searchResultsPage = homePage.getHeaderComponent().clickSearchButton();
        Assert.assertTrue(searchResultsPage.isPageOpened(), "Search results page is not opened");

        MoviePage moviePage = searchResultsPage.openFirstItem();
        Assert.assertTrue(moviePage.isPageOpened(), "Movie page is not opened");

        String exactMoviePlotField = moviePage.getmoviePlotFieldText();
        Assert.assertEquals(exactMoviePlotField, MOVIE_PLOT, "Movie plots do not match");
    }
}
