package tests;

import driver.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class LoginPageTest extends Driver {


    LoginPage loginPage;

    @Test
    public void login(){
        loginPage=new LoginPage();
        driver.get("https://www.saucedemo.com/");
        loginPage.username.sendKeys("problem_user");
        loginPage.password.sendKeys("secret_sauce");
        loginPage.loginButton.click();
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/inventory.html"))
            System.out.println("Login successful !");
    }
}
