package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class infinitScrollPage {

    private WebDriver driver; // global field

    public infinitScrollPage(WebDriver driver) {
        this.driver = driver;

    }

    private By paragraph = By.className("jscroll-added") ;
    public void scrollToParagraph(int index){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script="window.scrollBy(0, 150);";
        while (driver.findElements(paragraph).size() < index) {
            js.executeScript(script);
            try {
                Thread.sleep(1000); // wait for 1 second to allow new content to load
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
