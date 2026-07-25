package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultibleWindowsPage {
    private WebDriver driver; // global field
    public MultibleWindowsPage(WebDriver driver){
        this.driver = driver ;

    }

    private By clickHereLink = By.linkText("Click Here");
    public MultibleWindowsPage clickHereLink(){
        driver.findElement(clickHereLink).click();
        return this;
    }



}
