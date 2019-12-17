package Test;

import Businessobjects.User;
import Dataproviders.Dataproviders;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import Pages.*;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;


public class OnlineShopTests {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Bohdan_Zherebukh/IdeaProjects/NewArt/chromedr/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test (dataProvider = "user", dataProviderClass = Dataproviders.class)
    public void login(User user) {
        driver.get("http://automationpractice.com/index.php");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login(user.getEmail(), user.getPassword() );


    }
//    @Test
//    public void searchItemAndBuyIt() {
//        driver.get("http://automationpractice.com/index.php");
//
//        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
//        mainPage.searchItemAndSelectFirstInList("blouse");
//        //mainPage.goToOrderPage();
//
//        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
//        productPage.addToCartAndProceed();
//
//        OrderPage orderPage = PageFactory.initElements(driver, OrderPage.class);
//        orderPage.buyItemByBankWire();
    }

    /* @Test
    public void openPageA
   ndlogin() {
        driver.get ("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
        driver.findElementByXPath("//a[@ href='#gradle']").click();

    }*/

