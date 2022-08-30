package leave;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LeavePage;

public class LeavePageTests extends TestBase {



    @Test
    public void TestAssignLeaveWorksProperly () throws InterruptedException {

        DashBoardPage dashboardpage =  loginPage.clickLoginButton();
        LeavePage leavepage = dashboardpage.clickLeavePageLink();
        leavepage.clickOnAssignLeaveLink();
        Assert.assertEquals(leavepage.getActiveLink(),"Leave");
        Assert.assertEquals(leavepage.getVisitedLink(),"Assign Leave");
        leavepage.enterEmployeeName("jo","2023-08-26","2023-08-30");

        leavepage.pickLeaveTypeOption();
        leavepage.pickPartialDaysOption();
        leavepage.durationOption();
        leavepage.selectFromdate();

        leavepage.typeComment("hazem was here");
        leavepage.clickOnAssignButton();
        leavepage.clickOnConfirmationButton();


    }
}
