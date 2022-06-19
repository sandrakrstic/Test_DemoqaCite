package pages.widgetpages;

import pages.homepage.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

@Getter
public class DatePickerPage extends BasePage {
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5");
    private By datePicker = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]");
    private By selectDate = By.id("datePickerMonthYearInput");
    private By eighteenSix = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]");
    private By dateAndTime = By.id("dateAndTimePickerInput");
    private By selectedNewDate = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[5]");
    private By selectedTime = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[61]");

        public DatePickerPage(WebDriver driver, WebDriverWait driverWait) {super(driver, driverWait);
    }
    public void clickWidgets(){
        getDriverWait().withTimeout(Duration.ofSeconds(15));
            getDriver().findElement(widgets).click();
    }

    public void clickDatePicker(){
        getDriver().findElement(datePicker).click();
    }
    public void clickSelectDate(){
            getDriver().findElement(selectDate).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickSelectedDate(){
        getDriver().findElement(eighteenSix).click();
    }
    public void clickDateAndTime(){
        getDriver().findElement(dateAndTime).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickSelectedNewDate(){
        getDriver().findElement(selectedNewDate).click();
    }
    public void clickSelectedTime(){
        getDriver().findElement(selectedTime).click();
    }
    public String isSelectedDateVisible(){
        return getDriver().findElement(selectDate).getAttribute("value");
    }
    public String isSelectedNewDateVisible(){
        return getDriver().findElement(dateAndTime).getAttribute("value");
    }

}
