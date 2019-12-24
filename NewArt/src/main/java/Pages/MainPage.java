package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Businessobjects.*;
import Dataproviders.*;


public class MainPage {
    final WebDriver driver;

    @FindBy (xpath = "//input[@id='search_query_top']")
    private WebElement searchField;

    @FindBy (xpath = "//button[@name='submit_search']")
    private WebElement searchButton;

    @FindBy (xpath = "//a[@title='View my shopping cart']")
    private WebElement goToCartOrderPageButton;

    @FindBy (xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']")
    private WebElement firstProductInFirstLine;

    @FindBy (xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']")
    private WebElement firstProductInFirstLineOnSearchPage;

    public MainPage(WebDriver driver) {this.driver = driver; }

    public void searchItemAndSelectFirstInList(String search_key ) {
        searchField.click();
        searchField.sendKeys(search_key);
        searchButton.click();
        firstProductInFirstLineOnSearchPage.click();
    }

    public void goToFirstProductInLine() {
        firstProductInFirstLine.click();

    }
    public void goToOrderPage() {
        goToCartOrderPageButton.click();
    }
}
