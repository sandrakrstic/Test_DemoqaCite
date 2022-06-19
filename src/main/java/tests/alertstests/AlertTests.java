package tests.alertstests;

import tests.basetest.BaseTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {

    @BeforeMethod
    public void beforeAllMethods(){
        getAlertsFunctionalityPage().clickAlertsAndFrames();
    }
    @Test
    public void verifyThatUserCanClickFirstClickMeBtn(){
        getAlertsFunctionalityPage().clickAlerts();
        getAlertsFunctionalityPage().clickFirstClick();
        Assert.assertTrue(alertsFunctionalityPage().isAlertPresent());
    }
     @Test
    public void verifyThatUserCanClickSecondClickMeBtn() {
         getAlertsFunctionalityPage().clickAlerts();
         getAlertsFunctionalityPage().clickSecondClick();
         Assert.assertTrue(alertsFunctionalityPage().isAlertPresent());
     }

     @Test
     public void verifyThatUserCanClickThirdClickMeBtn() {
         getAlertsFunctionalityPage().clickAlerts();
         getAlertsFunctionalityPage().clickThirdClick();
         getAlertsFunctionalityPage().isAlertPresent();
         getAlertsFunctionalityPage().closeAlert();
         Assert.assertTrue(getAlertsFunctionalityPage().isConfirmMessagePresent());
     }

     @Test
     public void verifyThatUserCanClickFourthClickMeBtn(){
         getAlertsFunctionalityPage().clickAlerts();
         getAlertsFunctionalityPage().clickForthClick();
         getAlertsFunctionalityPage().isAlertPresent();
         getAlertsFunctionalityPage().enterNameInPromptBox();
         getAlertsFunctionalityPage().closeAlert();
         Assert.assertTrue(getAlertsFunctionalityPage().isPromptResultPresent());
     }
     @Test
    public void verifyThatUserCanClickSmallModalBtn(){
         getModalPage().clickModalDialog();
         getModalPage().clickSmallModal();
         Assert.assertEquals( getModalPage().getSmallModalTitle(), "Small modal");
     }

     @Test
    public void verifyThatUserCanClickLargeModalBtn(){
         getModalPage().clickModalDialog();
         getModalPage().clickLargeModal();
         Assert.assertEquals( getModalPage().getLargeModalTitle(), "Large Modal");
     }
}

