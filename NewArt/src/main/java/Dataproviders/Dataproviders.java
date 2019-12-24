package Dataproviders;

import Businessobjects.Item;
import Businessobjects.User;
import org.testng.annotations.DataProvider;

public class Dataproviders {

    @DataProvider(name = "user")
    public static Object[][] user() {
        return new Object[][]{{new User()}};
    }

    @DataProvider(name = "item")
    public static Object[][] item() {
        return new Object[][]{{new Item()}};
    }
}