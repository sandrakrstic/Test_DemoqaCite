package pages.widgetpages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.homepage.BasePage;
import lombok.Getter;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
    public class ProgressBarPage extends BasePage {
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5");
    private By progressBar = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[5]");
    private By progressBarValue= By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div");
    private By startStopBTn= By.id("startStopButton");

    public ProgressBarPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickProgressBar() {
        WebElement pb = getDriver().findElement(progressBar);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", pb);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pb.click();
    }
    public void clickProgressBarStart() {
        getDriver().findElement(startStopBTn).click();
    }

    /**
     *Method that verifies that progress bar value is 100
     */
    public boolean  isProgressValue100(){
      WebElement element = getDriver().findElement(progressBarValue);
      getDriverWait().until(ExpectedConditions.attributeContains(element, "aria-valuenow", "100"));
      return true;
  }
}