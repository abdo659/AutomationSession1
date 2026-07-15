package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class dropDownPage {


    private WebDriver driver; // global field

    public dropDownPage (WebDriver driver) {
        this.driver = driver;

    }


    private By dropDown = By .id("dropdown") ;

    // use method to select option

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);


    }


    public List<String> getDropdownList(){
       List<WebElement>optionsInDropDown = findDropDownElement().getAllSelectedOptions();
       List<String> optionText = new ArrayList<>();
       for (WebElement option : optionsInDropDown ){
           optionText.add(option.getText());

       }
       return optionText;
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }







}

