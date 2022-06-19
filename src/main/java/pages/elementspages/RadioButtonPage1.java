package pages.elementspages;

import pages.homepage.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
@Getter
public class RadioButtonPage1 extends BasePage {

    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]");
    private By radioButton =By.xpath("//*[@id=\"item-2\"]/span");
    private By yes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By confirmationMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
    private By impressive = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By impressiveMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
    private By no = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label");
    public RadioButtonPage1(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickRadio(){
        getDriver().findElement(radioButton).click();
    }
    public void clickYes(){
        getDriver().findElement(yes).click();
    }
    public void clickImpressive() {
        getDriver().findElement(impressive).click();
    }
    public boolean isConfirmationMessageVisible(){
        return getDriver().findElement(confirmationMessage).isDisplayed();
    }
    public boolean isImpressiveMessageVisible(){
        return  getDriver().findElement(impressiveMessage).isDisplayed();
    }
    public boolean isImpressiveRadioUnchecked(){
        return getDriver().findElement(impressive).isSelected();
   }
    public boolean isYesRadioUnchecked(){
        return getDriver().findElement(yes).isSelected();
   }
    public boolean isNoRadioEnabled(){
        return getDriver().findElement(no).isEnabled();
  }
}


