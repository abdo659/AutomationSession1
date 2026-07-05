package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver ;

    }
    private By userNameField = By.id("username");


    private By PasswordField = By.id("password");

    private By LoginButton = By.tagName("button");

    public  LoginPage login(String username , String pass){
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(PasswordField).sendKeys(pass);





        return this ;
    }

    public  LoginPage ClickLoginButton(){
        driver.findElement(LoginButton).click();
        return this ;

    }

}
