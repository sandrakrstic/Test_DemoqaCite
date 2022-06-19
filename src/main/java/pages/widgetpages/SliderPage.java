package pages.widgetpages;
import lombok.Getter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homepage.BasePage;

@Getter
public class SliderPage extends BasePage {
    private By  widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5");
     private By slider=By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[4]");
     private By sliderMove=By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input");
     private By sliderValue=By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/form/div/div[2]/input");

    public SliderPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    /**
     *Method that moves slider
     */
    public void clickSlider(){
        getDriver().findElement(slider).click();
    }
    public WebElement getSliderMove(){
        return getDriver().findElement(sliderMove);
    }
    public void moveSlider(){
        int x=20;
        int with = getSliderMove().getSize().getWidth();
        Actions action=new Actions(getDriver());
        action.moveToElement(getSliderMove(), ((with*x)/100), 0).click();
        action.build().perform();
    }

    /**
     *Method that returns value of slider movement
     */
    public String sliderValueAmount(){
        return getDriver().findElement(sliderValue).getAttribute("value");
    }

}
