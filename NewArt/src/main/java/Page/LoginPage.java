package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    final WebDriver driver;

    @FindBy (xpath = "//a[@title='Log in to your customer account']")
    private WebElement loginButton;

    @FindBy (xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy (xpath = "//input[@id='passwd']")
    private WebElement passwordField;

    @FindBy (xpath = "//button[@id='SubmitLogin']")
    private WebElement signInButton;

    public LoginPage (WebDriver driver) {this.driver = driver; }

    public void login(String email, String password) {
        loginButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
    }
}
