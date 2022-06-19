package pages.practiceformpage;

import pages.homepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class PracticeFormPage extends BasePage {

    private By form = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div");
    private By practiceForm = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
   private By genderFemale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label");
    private By mobile = By.id("userNumber");
    private By dateOfBirth = By.id("dateOfBirthInput");
    private By subjects = By.xpath("//*[@id=\"subjectsInput\"]");
    private By hobbies = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label");
    private By picture = By.id("uploadPicture");
    private By currentAddress = By.id("currentAddress");
    private By selectState = By.xpath("//*[@id=\"react-select-3-input\"]");
    private By selectCity = By.xpath("//*[@id=\"react-select-4-input\"]");
    private By submitBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[11]/div/button");
    private By submittingMessage = By.id("example-modal-sizes-title-lg");
    private By thatDate = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]");

    public PracticeFormPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getForm(){
        return getDriver().findElement(form);
    }

    public void clickForm(){
        getForm().click();
    }
    public WebElement getPracticeForm(){
        return getDriver().findElement(practiceForm);
    }
    public void clickPracticeForm(){
        getPracticeForm().click();
    }
    public WebElement getFirstName(){
        return getDriver().findElement(firstName);
    }
    public WebElement getLastName(){
        return getDriver().findElement(lastName);
    }
    public WebElement getEmail(){
        return getDriver().findElement(email);
    }
    public WebElement getGenderFemale(){
        return getDriver().findElement(genderFemale);
    }
    public WebElement getThatDate(){
        return getDriver().findElement(thatDate);
    }


    public WebElement getMobile(){
        return getDriver().findElement(mobile);
    }
    public WebElement getDateOfBirth(){
        return getDriver().findElement(dateOfBirth);
    }
    public WebElement getSubjects(){
       return getDriver().findElement(subjects);
    }


    public WebElement getHobbies(){
        return getDriver().findElement(hobbies);
    }
    public File getPicture(){
       return new File("data/8.jpg");
    }
    public WebElement getChooseFile(){
        return getDriver().findElement(picture);
    }

    public void chooseImage(File picture){
        getChooseFile().sendKeys(getPicture().getAbsolutePath());
     getDriverWait().withTimeout(Duration.ofSeconds(30));
    }

    public WebElement getSubmitMessage(){
        return getDriver().findElement(submittingMessage);
    }

    public WebElement getCurrentAddress(){
        return getDriver().findElement(currentAddress);
    }
   public WebElement getState() {
        return getDriver().findElement(selectState);
   }

   public WebElement getCity(){
        return getDriver().findElement(selectCity);
   }

   public void clickDate(){
        getDateOfBirth().click();
   }
   public void clickThatDate(){
        getThatDate().click();
   }

  public void clickSubjects(){
        getSubjects().click();
  }

   public void clickGenderFemale(){
        getGenderFemale().click();
   }

   public boolean isSubmitMessageVisible(){
        return getSubmitMessage().isDisplayed();
   }


  public void clickGetHobbies() {
        getHobbies().click();
  }

 public void clickSubmit(){
       getDriver().findElement(submitBtn).click();
        new Action() {
            @Override
            public void perform() {

            }
        }.perform();
    }



  public void studentRegistration(String firstName, String lastName, String email, String mobile, String dateOfBirth,
                                File picture,String currentAddress) {
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
        getEmail().sendKeys(email);
        clickGenderFemale();
        getMobile().sendKeys(mobile);
        clickDate();
        clickThatDate();
        clickSubjects();
        getSubjects().sendKeys("English");
        getSubjects().sendKeys(Keys.RETURN);
        clickGetHobbies();
        chooseImage(picture);
        getCurrentAddress().sendKeys(currentAddress);
        getState().sendKeys("NCR");
        getState().sendKeys(Keys.RETURN);
        getCity().sendKeys("Gurgaon");
        getCity().sendKeys(Keys.RETURN);

  }

}
