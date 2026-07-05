package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private WebDriver driver;

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    private final  String text = "Secure Area";
    private  final By BoxText = By.xpath("//h2[contains(.,'Secure Area')]");

    public SecurePage assertOnTextBox() {

        //assert locator
        String ActualTxt = driver.findElement(BoxText).getText();
        String expectedTxt = text ;
        if (ActualTxt.equals(expectedTxt)){
            System.out.println("txt is correct");

        }
        else {
            System.out.println("txt is not correct ");
        }
        return this;
    }
}
