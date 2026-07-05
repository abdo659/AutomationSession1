package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver; // global field
    public HomePage(WebDriver driver){
        this.driver = driver ;

    }

    //locators
    // create drivers and locators
    private By loginLink = By.linkText("Form Authentication");
    public void clickLoginLink(){
        driver.findElement(loginLink).click();
    }


}
