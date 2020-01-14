package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPaymentPage {
    final WebDriver driver;

    @FindBy (xpath = "//a[@title='Pay by bank wire']")
    private WebElement PayByBankWireButton;

    @FindBy (xpath = "//a[@title='Pay by check.']")
    private WebElement PayByCheckButton;

    @FindBy (xpath = "//button[@type='submit']")
    private WebElement ConfirmOrderButton;

    public OrderPaymentPage (WebDriver driver) {this.driver = driver; }

    public void proceedToPayByBankWire() {
        PayByBankWireButton.click();
    }

    public void proceedToPayByCheck() {
        PayByCheckButton.click();
    }

    public void confirmOrder() {
        ConfirmOrderButton.click();
    }
}
