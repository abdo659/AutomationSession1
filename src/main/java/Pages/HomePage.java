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

    public void clickLoginLink(){
        clickLink("Login");
    }

   public void clickDropDownLink(){
        clickLink("Dropdown");

    }
    public void clickFrameLink(){
        clickLink("Frames");
    }
    private void clickLink(String LinkText){
        // use the provided link text parameter when locating the element
        driver.findElement(By.linkText(LinkText)).click();


    }

}
