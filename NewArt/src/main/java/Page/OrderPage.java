package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {
    final WebDriver driver;

    @FindBy (xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement proceedToCheckoutOrderStepOneButton;

    @FindBy (xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement proceedToCheckoutOrderStepThreeButton;

    @FindBy (xpath = "//div[@id='uniform-cgv']")
    private WebElement termsAndServiceAgreeCheckboxOnStepFour;

    @FindBy (xpath = "//button[@name='processCarrier']")
    private WebElement proceedToCheckoutOrderStepFourButton;

    @FindBy (xpath = "//a[@title='Pay by bank wire']")
    private WebElement payByBankButtonOnStepFive;

    @FindBy (xpath = "//a[@title='Pay by check.']")
    private WebElement payByCheckButtonOnStepFive;

    @FindBy (xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement confirmOrderButtonOnStepFive;

    public OrderPage(WebDriver driver) {this.driver = driver; }

    public void buyItemByBankWire() {
        proceedToCheckoutOrderStepOneButton.click();
        proceedToCheckoutOrderStepThreeButton.click();
        termsAndServiceAgreeCheckboxOnStepFour.click();
        proceedToCheckoutOrderStepFourButton.click();
        payByBankButtonOnStepFive.click();
        confirmOrderButtonOnStepFive.click();
    }
}
