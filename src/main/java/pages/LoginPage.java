package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends PageBase{

    @FindBy(xpath = "(//input[@class = \"oxd-input oxd-input--active\" and @name = \"username\"])")
    WebElement userNameInput;
    @FindBy(xpath = "//input[@class = 'oxd-input oxd-input--active'][@name = 'password']")
    WebElement passwordInput;
    @FindBy(xpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button'][@type = 'submit']")
    WebElement loginButton;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmailField(String text){type(userNameInput,text);}
    public void setPasswordField(String text){type(passwordInput,text);}

    public DashBoardPage clickLoginButton(){
        click_on(loginButton);
        return new DashBoardPage(driver);
    }


}
