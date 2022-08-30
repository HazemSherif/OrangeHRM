package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Type;
import java.util.List;

public class LeavePage extends PageBase{

    @FindBy(className = "active")
    WebElement activeLink;
    @FindBy (className = "--visited")
    WebElement visitedLink;
    @FindBy (linkText = "Assign Leave")
    WebElement assignLeaveLink;

    @FindBy (xpath = "(//input[@placeholder = \"Type for hints...\"])")
    WebElement employeeName;
    @FindBy(xpath = "(//*[text ()= 'John  Smith'])")
    WebElement employeeNameOption;
    @FindBy (xpath = "(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div)")
    WebElement leaveList;
    @FindBy (xpath = "(//i[@class = 'oxd-icon bi-caret-down-fill oxd-select-text--arrow'])")
    WebElement listButton;
    @FindBy(xpath = "(//div[@class = 'oxd-date-input'])[1]//input")
    WebElement fromDateInput;
    @FindBy(xpath = "((//div[@class = 'oxd-date-input'])[2])//input")
    WebElement toDateInput;
    @FindBy(xpath = "(//i[@class ='oxd-icon bi-calendar oxd-date-input-icon'])")
    WebElement openCalendarButton;
    @FindBy(xpath = "(//li[@class ='oxd-calendar-selector-month'])")
    WebElement monthSelectorButton;
    // Not Ideal
    @FindBy(xpath = "(//*[text() = 'May'])")
    WebElement monthSelectorOption;
    @FindBy(xpath = "(//li[@class ='oxd-calendar-selector-year'])")
    WebElement yearSelector;
    // Not Ideal
    @FindBy(xpath = "(//div[@class ='oxd-calendar-dates-grid' & text() = '17'])")
    WebElement fifteenAugDateOption;
    @FindBy(xpath = "(//div[@class ='oxd-calendar-dates-grid'](//div[@class = 'oxd-calendar-date-wrapper'])[10])")
    WebElement fifteenAugDate;

    @FindBy (xpath = "(//span[text()='CAN - Bereavement'])")
    WebElement leaveTypeOption1;
    @FindBy (xpath = "((//i[@class = 'oxd-icon bi-calendar oxd-date-input-icon'])[1])")
    WebElement fromDateButton;
    @FindBy (xpath = "(//div[@class = 'oxd-date-input-calender'])")
    WebElement calenderDiv;
    @FindBy (xpath = "((//i[@class = 'oxd-icon bi-calendar oxd-date-input-icon'])[2])")
    WebElement toDateButton;
    @FindBy (xpath = "((//i[@class = 'oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2])")
    WebElement partialDaysSelector;
    @FindBy (xpath = "(//span[text()='All Days'])")
    WebElement partialDaysOption1;
    @FindBy (xpath = "((//i[@class = 'oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3])")
    WebElement durationButton;
    @FindBy (xpath = "(//span[text()='Specify Time'])")
    WebElement duration;
    @FindBy (xpath = "((//div//i[@class = 'oxd-icon bi-clock oxd-time-input--clock'])[1])")
    WebElement fromButton;
    @FindBy (xpath = "((//div//i[@class = 'oxd-icon bi-clock oxd-time-input--clock'])[2])")
    WebElement toButton;
    @FindBy (xpath = "(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[3]/div/div[2]/div/div[2]/div[1]/i[1])")
    WebElement increaseHour;
    @FindBy (xpath = "(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[3]/div/div[2]/div/div[2]/div[1]/i[2])")
    WebElement decreaseHour;
    @FindBy (xpath = "(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[3]/div/div[2]/div/div[2]/div[3]/i[1])")
    WebElement increaseMinute;
    @FindBy (xpath = "(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[3]/div/div[2]/div/div[2]/div[3]/i[2])")
    WebElement decreaseMinute;
    @FindBy (xpath = "(//*[@class=\"oxd-time-period-label\"])[2]")
    WebElement selectAMOption;
    @FindBy (xpath = "(//*[@class=\"oxd-time-period-label\"])[1]")
    WebElement selectPMOption;
    @FindBy (xpath = "(//div//textarea[@class = 'oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])")
    WebElement commentSectionInputField;
    @FindBy(xpath = "(//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin'])")
    WebElement okayButton;
    @FindBy(xpath ="//button[@type = 'submit']")
    WebElement assignButton;


    public LeavePage(WebDriver driver) {
        super(driver);
    }

    public void selectFromdate() throws InterruptedException {
        click_on(fromButton);
        click_on(increaseHour);
        click_on(increaseMinute);
       // click_on(selectAMOption);
       // Thread.sleep(60000);
        click_on(selectPMOption);
    }
    public String getActiveLink(){
        return getLinkText(activeLink);
    }
    public String getVisitedLink(){
        return getLinkText(visitedLink);
    }
    public void clickOnAssignLeaveLink(){
        click_on(assignLeaveLink);
    }

    public void enterEmployeeName(String string,String fromdate,String todate) throws InterruptedException {

        type(employeeName,string);
       // Thread.sleep(10000);
        click_on(employeeNameOption);
        click_on(openCalendarButton);
        click_on(monthSelectorButton);
        click_on(monthSelectorOption);
        click_on(yearSelector);
       // click_on(fifteenAugDateOption);
        type(toDateInput,todate);
        type(fromDateInput,fromdate);
    }

    public void clickOnLeaveTypeDropDown(){
        click_on(listButton);
    }
    public void clickOnLeaveTypeOption1(){
        click_on(leaveTypeOption1);
    }
    public void pickLeaveTypeOption(){
        clickOnLeaveTypeDropDown();
        clickOnLeaveTypeOption1();
    }


    public void clickOnPartailDaysList(){
        click_on(partialDaysSelector);
    }
    public void clickOnAllDaysOption(){
        click_on(partialDaysOption1);
    }
    public void pickPartialDaysOption(){
      clickOnPartailDaysList();
      clickOnAllDaysOption();
    }


    public void durationOption(){
        click_on(durationButton);
        click_on(duration);
    }
    public void clickOnFromDateButton(){
        click_on(fromDateButton);
    }
    public void clickOnToDateButton(){
        click_on(toDateButton);
    }
    public void clickOnTheCalender(){
        click_on(calenderDiv);
    }
    public void typeComment(String text){
        type(commentSectionInputField,text);
    }
    public void clickOnAssignButton(){
        click_on(assignButton);
    }
    public void clickOnConfirmationButton(){
        click_on(okayButton);
    }

    /* public void gettextytext(int i){
      getListHeaderText(inputFields,i);
  }*/
    public List getLeaveTypeList(){
        return create_select(leaveList).getOptions();
    }

}
