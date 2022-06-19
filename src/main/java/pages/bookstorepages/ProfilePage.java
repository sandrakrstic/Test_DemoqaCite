package pages.bookstorepages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homepage.BasePage;
@Getter
public class ProfilePage extends BasePage {
    private By bookStoreApplication=By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[3]") ;
    private By profile=By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]");
    private By logOut=By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[3]/button");
    private By inputSearch = By.id("searchBox");
    private By goToBookStoreBtn=By.id("gotoStore");
    private By deleteAccount=By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button");
    private By deleteAllBooks=By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]/button");

    public ProfilePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public boolean isLogOutVisible(){
      return   getDriver().findElement(logOut).isDisplayed();
    }
}
