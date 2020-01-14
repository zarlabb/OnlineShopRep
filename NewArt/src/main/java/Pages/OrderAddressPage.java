package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderAddressPage {
    final WebDriver driver;

    @FindBy (xpath = "//button[@name='processAddress']")
    private WebElement SubmitOrderAddressButton;

    public OrderAddressPage (WebDriver driver) {this.driver = driver; }

    public void proceedToShipping() {
        SubmitOrderAddressButton.click();
    }
}
