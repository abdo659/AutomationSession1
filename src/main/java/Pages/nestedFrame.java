package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class nestedFrame {
    private WebDriver driver; // global field

    public nestedFrame (WebDriver driver) {
        this.driver = driver;

    }
    private By topFrame = By.name("frame-top") ;
    private By leftFrame = By.name("frame-left") ;
    private By middleFrame = By.name("frame-middle") ;
    private By rightFrame = By.name("frame-right") ;
    private By body = By.tagName("body") ;

    public String switchToLeftFrame(){
        driver.switchTo().frame(driver.findElement(topFrame)).switchTo().frame(driver.findElement(leftFrame));
        String LeftFrameText = driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return LeftFrameText;
    }

    public  String switchToBottomFrame(){
        driver.switchTo().frame(driver.findElement(By.name("frame-bottom")));
        String bottomFrameText = driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return bottomFrameText;
    }

}
