package pages.alertspage;
import pages.homepage.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
@Getter
public class ModalPage extends BasePage {

    private By alertsAndFrames = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5");
    private By modalDialogs = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]/span");
    private By smallModal = By.id("showSmallModal");
    private By largeModal = By.id("showLargeModal");
    private By smallModalTitle = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/button[1]");
    private By smallModalClose = By.id("closeSmallModal");
    private By largeModalTitle = By.id("example-modal-sizes-title-lg");
    private By largeModalClose = By.id("closeLargeModal");

    public ModalPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickModalDialog(){
           getDriver().findElement(modalDialogs).click();
    }
    public void clickSmallModal(){
           getDriver().findElement(smallModal).click();
    }
    public void clickLargeModal(){
           getDriver().findElement(largeModal).click();
    }

    public String getSmallModalTitle(){
    getDriverWait().until(ExpectedConditions.presenceOfElementLocated(smallModalTitle));
         return   getDriver().findElement(smallModalTitle).getText();
    }

    public String getLargeModalTitle(){
           getDriverWait().until(ExpectedConditions.presenceOfElementLocated(largeModalTitle));
         return  getDriver().findElement(largeModalTitle).getText();
    }
}
