package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import pages.PageBase;

public class TestBase {
    WebDriver driver;

    protected LoginPage loginPage;
    protected PageBase pageBase;
    @BeforeTest
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        pageBase = new PageBase(driver);
        loginPage = new LoginPage(driver);
    }
    @BeforeMethod
    public void login(){
        loginPage.setEmailField("Admin");
        loginPage.setPasswordField("admin123");
    }
  /*  @AfterTest
    public void teardown(){
        driver.quit();
    }*/


}
