package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {

    private WebDriver driver; // global field

    public Frames (WebDriver driver) {
        this.driver = driver;

    }

    private By nestedframe = By .linkText("Nested Frames") ;
    private By iFrame = By .linkText("iFrame") ;

    public void clickNestedFrameLink(){
        driver.findElement(nestedframe).click();
    }
    public void clickiFrameLink(){
        driver.findElement(iFrame).click();
    }

}
