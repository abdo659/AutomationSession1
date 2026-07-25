package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JsAlertPage {

    private WebDriver driver;

    public JsAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    private final String xpathTemplate = "//ul/li[%d]/button";
    private final By result = By.id("result");

    private void clickButtonByIndex(int index) {
        String buttonXpath = String.format(xpathTemplate, index);
        driver.findElement(By.xpath(buttonXpath)).click();
    }

    public void clickAlertButton() {
        clickButtonByIndex(1);
    }

    public void clickConfirmButton() {
        clickButtonByIndex(2);
    }

    public void clickPromptButton() {
        clickButtonByIndex(3);
    }

    public JsAlertPage clickOnPopAlertButton() {
        clickAlertButton();
        driver.switchTo().alert().accept();
        return this;
    }

    public JsAlertPage clickOnCancelButton() {
        clickConfirmButton();
        driver.switchTo().alert().dismiss();
        return this;
    }

    public JsAlertPage clickOnOkButton() {
        clickConfirmButton();
        driver.switchTo().alert().accept();
        return this;
    }

    public JsAlertPage alertSetText(String text) {
        clickPromptButton();
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        return this;
    }

    public JsAlertPage assertOnTextInput(String expectedText) {
        Assert.assertEquals(
                driver.findElement(result).getText(),
                expectedText,
                "Text is not correct"
        );
        return this;
    }

    public JsAlertPage assertOnCancelMessage() {
        Assert.assertEquals(
                driver.findElement(result).getText(),
                "You clicked: Cancel",
                "Text is not correct"
        );
        return this;
    }

    public JsAlertPage assertOnOkMessage() {
        Assert.assertEquals(
                driver.findElement(result).getText(),
                "You clicked: Ok",
                "Text is not correct"
        );
        return this;
    }

    public JsAlertPage assertOnAlertMessage() {
        Assert.assertEquals(
                driver.findElement(result).getText(),
                "You successfully clicked an alert",
                "Text is not correct"
        );
        return this;
    }
}