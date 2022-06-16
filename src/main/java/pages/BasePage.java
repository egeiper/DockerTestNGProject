package pages;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends Driver {

    public WebDriver driver;

    public BasePage(){
        this.driver=Driver.driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateTo(String url){
        driver.get(url);
    }
}
