package tests;

import driver.Driver;
import org.testng.annotations.Test;
import pages.BasePage;

public class NavigateTest extends Driver {

    BasePage basePage;

    @Test
    public void navigate() {
        basePage = new BasePage();
        basePage.navigateTo("https://www.saucedemo.com/");
        if (driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com"))
            System.out.println("Navigated");
    }
}
