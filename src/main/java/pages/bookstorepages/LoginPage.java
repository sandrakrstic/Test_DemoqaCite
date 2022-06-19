package pages.bookstorepages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.homepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

     public class LoginPage extends BasePage {
     private By bookStoreApplication=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5") ;
     private By login=By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]");
     private By userName = By.xpath("//*[@id=\"userName\"]");
     private By password = By.xpath("//*[@id=\"password\"]");
     private By loginBtn = By.id("login");

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickBookStoreApplication(){
        WebElement bsa = getDriver().findElement(bookStoreApplication);
        scrollTo(bsa);
        bsa.click();
    }

    public void clickLogin(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement loginElem = getDriver().findElement(login);
        scrollTo(loginElem);
        loginElem.click();
    }

    public void clickLoginBtn(){
        WebElement loginElem = getDriver().findElement(loginBtn);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(loginElem).click().perform();
    }

    private void scrollTo(WebElement we){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", we);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isLogInBtnVisible(){
        return getLoginBtn().isDisplayed();
    }

    public WebElement getUserName(){
       return getDriver().findElement(userName);
    }
    public WebElement getPassword(){
        return getDriver().findElement(password);
    }
    public WebElement getLoginBtn(){
        return getDriver().findElement(loginBtn);
    }
    public void LoginInputData(String username, String password){
        getUserName().sendKeys(username);
        getPassword().sendKeys(password);
        }
    }
