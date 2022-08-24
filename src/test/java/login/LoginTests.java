package login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;

import static org.testng.Assert.assertEquals;
import base.TestBase;
import pages.LoginPage;


import static org.testng.Assert.assertEquals;

public class LoginTests extends TestBase{

    @Test
    public void testSuccessfullogin () {

       /* loginPage.setEmailField("Admin");
        loginPage.setPasswordField("admin123");*/

        DashBoardPage dashboardpage =  loginPage.clickLoginButton();
        Assert.assertEquals(dashboardpage.getActiveLink(),"PIM");
        Assert.assertEquals(dashboardpage.getVisitedLink(),"Employee List");
    }


}
