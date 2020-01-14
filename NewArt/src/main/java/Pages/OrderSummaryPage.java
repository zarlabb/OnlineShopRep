package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage {
    final WebDriver driver;

    @FindBy (xpath = "//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
    private WebElement SubmitOrderSummaryButton;

    public OrderSummaryPage (WebDriver driver) {this.driver = driver; }

    public void proceedToSignIn() {
        SubmitOrderSummaryButton.click();
    }
}
