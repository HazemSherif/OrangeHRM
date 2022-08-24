package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends PageBase{

    @FindBy (linkText = "Leave")
    WebElement pimLink;
    @FindBy (className = "active")
    WebElement activeLink;
    @FindBy (linkText = "Employee List")
    WebElement employeeListLink;
    @FindBy (className = "--visited")
    WebElement visitedLink;


    public DashBoardPage(WebDriver driver) {
        super(driver);
    }

    public String getActiveLink(){
        return getLinkText(activeLink);
    }
    public String getVisitedLink(){
        return getLinkText(visitedLink);
    }

    public LeavePage clickLeavePageLink(){
        click_on(pimLink);
        return new LeavePage(driver);
    }
}
