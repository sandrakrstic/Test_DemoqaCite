package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homepage.BasePage;

public class TextBoxPage extends BasePage {


    private By elements = By.className("card-body");
    private By textBox = By.id("item-0");


    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.xpath("//*[@id=\"submit\"]");
    private By submitName = By.xpath("//*[@id=\"name\"]");
    private By submitEmail = By.xpath("//*[@id=\"email\"]");
    private By submitCurrentAddress = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]");
    private By submitPermanentAddress = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[4]");
    private By confirmationForm = By.xpath("//*[@id=\"output\"]/div");


    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public WebElement getElements(){
        return getDriver().findElement(elements);
    }
    public WebElement getFullName(){
        return getDriver().findElement(fullName);
   }
    public WebElement getEmail(){
        return getDriver().findElement(email);
   }
    public WebElement getCurrentAddress() {
        return getDriver().findElement(currentAddress);
    }

    public WebElement getPermanentAddress() {
        return getDriver().findElement(permanentAddress);
    }
    public WebElement getSubmitBtn() {
        return getDriver().findElement(submitBtn);
    }

    public WebElement getConfirmationForm(){
        return getDriver().findElement(confirmationForm);
    }
    public WebElement getSubmitName() {
        return getDriver().findElement(submitName);
    }

    public WebElement getSubmitEmail() {
        return getDriver().findElement(submitEmail);
    }
    public WebElement getSubmitCurrentAddress() {
        return getDriver().findElement(submitCurrentAddress);
    }

    public WebElement getSubmitPermanentAddress() {
        return getDriver().findElement(submitPermanentAddress);
    }

    public void clickElements(){
        getElements().click();
    }

    public WebElement getTextBoxOption(){
        return getDriver().findElement(textBox);
    }

    public void clickTextBoxOption(){
        getTextBoxOption().click();
    }

    public boolean isConfirmationFormPresent(){
       return getConfirmationForm().isDisplayed();
    }

    public void enterFullName(String fullName){
        getFullName().sendKeys(fullName);
    }
    public void enterEmail(String email){
        getEmail().sendKeys(email);
    }
    public void enterCurrentAddress(String currentAddress){
        getCurrentAddress().sendKeys(currentAddress);
    }
    public void enterPermanentAddress(String permanentAddress){
        getPermanentAddress().sendKeys(permanentAddress);
    }
    public void clickSubmitBtn(){
                getSubmitBtn().click();
    }

    public void enterTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress){
        enterFullName(fullName);
        enterEmail(email);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);
    }
}
