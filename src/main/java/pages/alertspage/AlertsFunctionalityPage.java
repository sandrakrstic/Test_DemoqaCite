package pages.alertspage;
import pages.homepage.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

@Getter
public class AlertsFunctionalityPage extends BasePage {

       private By alertsAndFrames= By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5");
       private By  alerts =By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");
       private By firstClick = By.id("alertButton");
       private By secondClick = By.id("timerAlertButton");
       private By thirdClick = By.id("confirmButton");
       private By forthClick = By.id("promtButton");
       private By confirmResult = By.id("confirmResult");
       private By promptResult = By.id("promptResult");

       public AlertsFunctionalityPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);}

       public void clickAlertsAndFrames(){
            getDriverWait().withTimeout(Duration.ofSeconds(15));
            getDriver().findElement(alertsAndFrames).click();
       }
       public void clickAlerts(){
           getDriverWait().until(ExpectedConditions.presenceOfElementLocated(alerts));
           getDriver().findElement(alerts).click();
       }
       public void clickFirstClick(){
           getDriver().findElement(firstClick).click();
       }
       public void clickSecondClick(){
           getDriver().findElement(secondClick).click();
       }
       public void clickThirdClick(){
           getDriver().findElement(thirdClick).click();
       }
       public void clickForthClick(){
           getDriver().findElement(forthClick).click();
       }
       public boolean isAlertPresent(){
           if(getDriverWait().until(ExpectedConditions.alertIsPresent())==null)
               return false;
           return true;
       }
       public void closeAlert(){
        getDriver().switchTo().alert().accept();
    }

       public boolean isConfirmMessagePresent(){
           return getDriver().findElement(confirmResult).isDisplayed();
    }
       public void enterNameInPromptBox(){
        getDriver().switchTo().alert().sendKeys("Sandra");
    }
       public boolean isPromptResultPresent(){
           return getDriver().findElement(promptResult).isDisplayed();
    }

}
