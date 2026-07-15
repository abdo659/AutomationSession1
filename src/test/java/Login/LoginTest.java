package Login;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecurePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SecurePage securePage;
    @Test
    public  void FormLogin(){
        driver =new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage.clickLoginLink();
        loginPage.login("tomsmith","SuperSecretPassword!").ClickLoginButton();

        securePage = new SecurePage(driver);
        securePage.assertOnTextBox();
        driver.quit();


    }
}
