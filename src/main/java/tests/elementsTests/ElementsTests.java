package tests.elementsTests;
import tests.basetest.BaseTests;
import lombok.Data;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Data
public class ElementsTests extends BaseTests {

    @BeforeMethod
    public void beforeAllMethods(){
        getTextBoxPage().clickElements();
    }

    @Test
    public void verifyThatTextBoxEnteredDataAreAsExpected(){
         getTextBoxPage().clickTextBoxOption();
         getTextBoxPage().enterTextBoxForm("Sandra Krstic", "sandrakrstic8@gmail.com","Cara Dusana 111",
                "Cara Dusana 111");
         getTextBoxPage().clickSubmitBtn();
         Assert.assertTrue(getTextBoxPage().isConfirmationFormPresent());
         Assert.assertEquals(getTextBoxPage().getSubmitName().getText(), "Name:Sandra Krstic");
         Assert.assertEquals(getTextBoxPage().getSubmitEmail().getText(), "Email:sandrakrstic8@gmail.com");
         Assert.assertEquals(getTextBoxPage().getSubmitCurrentAddress().getText(), "Current Address :Cara Dusana 111");
         Assert.assertEquals(getTextBoxPage().getSubmitPermanentAddress().getText(), "Permananet Address :Cara Dusana 111");
    }

    @Test
    public void verifyThatUserCanCheckRadioYes(){
        getRadioButtonPage1().clickRadio();
        getRadioButtonPage1().clickYes();
        Assert.assertTrue(getRadioButtonPage1().isConfirmationMessageVisible());
        Assert.assertFalse(getRadioButtonPage1().isImpressiveRadioUnchecked());
    }

    @Test
    public void verifyThatUserCanCheckRadioImpressive(){
       getRadioButtonPage1().clickRadio();
       getRadioButtonPage1().clickImpressive();
       Assert.assertTrue(getRadioButtonPage1().isImpressiveMessageVisible());
       Assert.assertFalse(getRadioButtonPage1().isYesRadioUnchecked());
    }

    @Test
    public void verifyNoRadioIsEnabled(){
       getRadioButtonPage1().clickRadio();
       Assert.assertTrue(getRadioButtonPage1().isNoRadioEnabled());
   }
}
