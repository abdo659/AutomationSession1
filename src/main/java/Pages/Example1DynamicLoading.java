package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Example1DynamicLoading {
    private WebDriver driver; // global field
  // private WebDriverWait wait;
    public Example1DynamicLoading(WebDriver driver)  {
        this.driver = driver;
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found")
                ;
        //Thread.sleep(5000);//static wait
        //implivit wait
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//poll=,5 s

    }
    private By startButton = By.tagName("button") ;
    private By finishText = By.id("finish") ;
    private By loadingBar = By.id("loading") ;
    private String text = "Hello World!";
    private FluentWait<WebDriver> wait;

    public Example1DynamicLoading clickStartButton(){
        driver.findElement(startButton).click();

        //explicit wait
       // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      //wait.until(ExpectedConditions.elementToBeClickable(startButton));
       // wait.until(ExpectedConditions.presenceOfElementLocated(finishText));


        return this ;
    }
    public String getFinishText(){
        return driver.findElement(finishText).getText();
    }

    public Example1DynamicLoading assertOnFinishText(){
       // wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));

        Assert.assertEquals(getFinishText(), text, "it is not true");
        return this ;
    }
}



