package leave;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LeavePage;

public class LeavePageTests extends TestBase {

    @Test
    public void TestWeAreAtTheLeavePage (){

        DashBoardPage dashboardpage =  loginPage.clickLoginButton();
        LeavePage leavepage = dashboardpage.clickLeavePageLink();
        Assert.assertEquals(dashboardpage.getActiveLink(),"Leave");
        Assert.assertEquals(dashboardpage.getVisitedLink(),"Leave List");
    }

    @Test
    public void TestAssignLeaveWorksProperly (){

        DashBoardPage dashboardpage =  loginPage.clickLoginButton();
        LeavePage leavepage = dashboardpage.clickLeavePageLink();
        leavepage.clickOnLeaveListLink();
        Assert.assertEquals(leavepage.getActiveLink(),"Leave");
        Assert.assertEquals(leavepage.getVisitedLink(),"Assign Leave");
        leavepage.enterEmployeeName("Charlie  Carter");
        leavepage.getLeaveTypeList().get(1);

        //leavepage.gettextytext(0);

    }
}
