package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeavePage extends PageBase{

    @FindBy(className = "active")
    WebElement activeLink;
    @FindBy (className = "--visited")
    WebElement visitedLink;
    @FindBy (linkText = "Assign Leave")
    WebElement leaveListLink;
    @FindAll({
            @FindBy (xpath =" (//div[@class = 'oxd-input-group oxd-input-field-bottom-space'][@data-v-2fe357a6 = ''])")
    })
    private List inputFields;

    @FindBy (xpath = "(//input[@placeholder = \"Type for hints...\"])")
    WebElement employeeName;
    @FindBy (xpath = "(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div)")
    WebElement leavelist;
    public String getActiveLink(){
        return getLinkText(activeLink);
    }
    public String getVisitedLink(){
        return getLinkText(visitedLink);
    }
    public void clickOnLeaveListLink(){
        click_on(leaveListLink);
    }
    public void gettextytext(int i){
        getListHeaderText(inputFields,i);
    }
    public void enterEmployeeName(String string){
        type(employeeName,string);
    }
    public List getLeaveTypeList(){
        return create_select(leavelist).getOptions();
    }
    public LeavePage(WebDriver driver) {
        super(driver);
    }
}
