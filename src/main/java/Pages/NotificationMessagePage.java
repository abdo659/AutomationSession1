package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class NotificationMessagePage {
    private WebDriver driver; // global field
    public NotificationMessagePage(WebDriver driver){
        this.driver = driver ;

    }

    private By clickHereLink = By.linkText("Click here");
    private By notificationtext = By.id("flash");
    public NotificationMessagePage clickHereLink(){
        driver.findElement(clickHereLink).click();
        return this;
    }
    public NotificationMessagePage assertOnTextNotification() {

        String actualMessage = driver.findElement(notificationtext)
                .getText()
                .replace("×", "")
                .trim();

        Assert.assertTrue(
                actualMessage.equals("Action successful")
                        || actualMessage.equals("Action successful, please try again.")
                        || actualMessage.equals("Action unsuccessful, please try again."),
                "Unexpected message: " + actualMessage
        );

        return this;
    }
}
