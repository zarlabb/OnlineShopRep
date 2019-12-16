package Dataproviders;

import Businessobjects.User;
import org.testng.annotations.DataProvider;

public class Dataproviders {

    @DataProvider (name = "user")
    public static Object[] [] user() {return new Object[][] {{new User}};}
}
