package pages.bookstorepages;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homepage.BasePage;
@Getter
public class BookStorePage extends BasePage {
    private By bookStoreApplication = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[1]");
    private By bookStore = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]");
    private By inputSearchField = By.id("searchBox");
    private By logOutBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/button");
    private By gitPocketGuideBook = By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a");
    private By titleOfBook=By.xpath("//*[@id=\"title-wrapper\"]/div[2]");
    private By pageTitle=By.xpath("//*[@id=\"app\"]/div/div/div[1]");

    public BookStorePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public String getTitleOfBook(){
        return getDriver().findElement(titleOfBook).getText();
    }
    public void clickBookStore() {
        getDriver().findElement(bookStore).click();
    }

    public WebElement getInputSearchField() {
        return getDriver().findElement(inputSearchField);
    }
    public void clickInputSearchField() {
        getInputSearchField().click();
    }
    public void enterBookName(String bookName) {
        getDriver().findElement(inputSearchField).sendKeys(bookName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickGitPocketGuideBook(){
        getDriver().findElement(gitPocketGuideBook).click();
    }

    public boolean isGitPocketGuideVisible(){
        return getDriver().findElement(gitPocketGuideBook).isDisplayed();
    }

    public void clickLogOut(){
        getDriver().findElement(logOutBtn).click();
    }
}
