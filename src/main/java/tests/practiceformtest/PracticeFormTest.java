package tests.practiceformtest;
import tests.basetest.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;

public class PracticeFormTest extends BaseTests {

    @Test
    public void checkPracticeFormInput() {
        getPracticeFormPage().clickForm();
        getPracticeFormPage().clickPracticeForm();
        getPracticeFormPage().studentRegistration("Sandra", "Krstic", "krsticsandra8@gmail.com", "0627582581",
                "04 Jul 1985", new File("data/8.jpg"),
                "Cara Dusana 11");
        getPracticeFormPage().clickSubmit();
        Assert.assertTrue(getPracticeFormPage().isSubmitMessageVisible());
    }
}
