package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DynamicLoadingPage {
    private WebDriver driver; // global field

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver ;
}

    private By example1Link = By.partialLinkText("Example 1");
    private By example2Link = By.partialLinkText("Example 2");
    private By content =By.xpath("//div/h3") ;

    private String text = "Dynamically Loaded Page Elements";
    //methods
public DynamicLoadingPage clickExample1Link(){
    driver.findElement(example1Link).click();
    return this;
}
public DynamicLoadingPage clickExample2Link(){
    driver.findElement(example2Link).click();
    return this;
}
public String getContentText(){
    return driver.findElement(content).getText();
}

//assertion
public DynamicLoadingPage assertContentText(){
    Assert.assertEquals(getContentText(), text,"it is not true");
    return this;
}
}