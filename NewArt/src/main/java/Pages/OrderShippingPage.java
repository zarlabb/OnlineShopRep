package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderShippingPage {
    final WebDriver driver;

    @FindBy (xpath = "//input[@type='checkbox']")
    private WebElement TermsOfServiceCheckbox;

    @FindBy (xpath = "//button[@name='processCarrier']")
    private WebElement SubmitOrderShippingButton;

    public OrderShippingPage (WebDriver driver) {this.driver = driver; }

    public void proceedToPayment() {
        TermsOfServiceCheckbox.click();
        SubmitOrderShippingButton.click();
    }
}

