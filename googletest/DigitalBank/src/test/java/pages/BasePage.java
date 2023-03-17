package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    WebDriver driver = Driver.getDriver();
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="submit")
    public WebElement signInButton;




    public void clickSignIn(){
        signInButton.click();
    }


    public void verifyPage() {
    }
}
