package tests.widgetstests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.basetest.BaseTests;

public class WidgetTests extends BaseTests {
     @BeforeMethod
     public void beforeMethods(){
         getDatePickerPage().clickWidgets();
     }
    @Test
    public void verifyThatSliderGivesYouExpectedValue(){
        getSliderPage().clickSlider();
        getSliderPage().moveSlider();
        Assert.assertEquals(getSliderPage().sliderValueAmount(),"70");
    }

    @Test
    public void verifyThatUserCanSelectDate(){
        getDatePickerPage().clickDatePicker();
        getDatePickerPage().clickSelectDate();
        getDatePickerPage().clickSelectedDate();
        getDatePickerPage().clickDateAndTime();
        getDatePickerPage().clickSelectedNewDate();
        getDatePickerPage().clickSelectedTime();
        Assert.assertEquals(getDatePickerPage().isSelectedDateVisible(), "06/18/2022");
        Assert.assertEquals(getDatePickerPage().isSelectedNewDateVisible(), "June 16, 2022 3:00 PM");
    }

    @Test
    public void verifyThatProgressBarReturnsExpectedValue(){
        getProgressBarPage().clickProgressBar();
        getProgressBarPage().clickProgressBarStart();
        Assert.assertTrue(getProgressBarPage().isProgressValue100());
    }

}
