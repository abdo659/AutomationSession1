package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public  void Setup(){
        driver=new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
