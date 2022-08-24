package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageBase {
    WebDriver driver;
    public static final long WAIT = 15;
    public PageBase(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;}
    public void waitForElementVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void click_on(WebElement element){
        waitForElementVisibility(element);
        element.click();}
    public void type(WebElement element,String text){
        waitForElementVisibility(element);
        element.sendKeys(text);}

    public String getLinkText(WebElement element){
       return element.getText();
    }
    public void getListHeaderText(List<WebElement> list,int i) {
        WebElement element = list.get(i);
        System.out.println(list.size());}

    public String getFieldText(WebElement element){ return element.getText();}
    public Boolean displayed (WebElement element){ return element.isDisplayed();}
    public void clear_field(WebElement element){element.clear();}

    public Select create_select(WebElement element){
        Select dropdown = new Select(element);
        return dropdown;
    }
    public String get_attribute(WebElement element,String text){
        return element.getAttribute(text);
    }

    public void implicitWait(int i){
        driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }

    List find_list(By by){ return driver.findElements(by);}
}
