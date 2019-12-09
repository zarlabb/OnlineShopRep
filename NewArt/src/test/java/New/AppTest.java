package New;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.OrderPage;
import Pages.ProductPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;


public class AppTest {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Bohdan_Zherebukh/IdeaProjects/NewArt/chromedr/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void login() {
        driver.get("http://automationpractice.com/index.php");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("rrtest@mailinator.com", "654321" );


    }
    @Test
    public void searchItem() {
        driver.get("http://automationpractice.com/index.php");

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.searchItemAndSelectFirstInList("blouse");
        //mainPage.goToOrderPage();

        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.addToCartAndProceed();

        OrderPage orderPage = PageFactory.initElements(driver, OrderPage.class);
        orderPage.buyItemByBankWire();
    }

    /* @Test
    public void openPageA
   ndlogin() {
        driver.get ("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
        driver.findElementByXPath("//a[@ href='#gradle']").click();

    }*/
}
