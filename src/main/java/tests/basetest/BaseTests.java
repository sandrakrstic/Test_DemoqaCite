package tests.basetest;
import pages.alertspage.AlertsFunctionalityPage;
import pages.alertspage.ModalPage;
import pages.bookstorepages.BookStorePage;
import pages.bookstorepages.LoginPage;
import pages.bookstorepages.ProfilePage;
import pages.elementspages.RadioButtonPage1;
import pages.homepage.BasePage;
import pages.elementspages.TextBoxPage;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.practiceformpage.PracticeFormPage;
import pages.widgetpages.DatePickerPage;
import pages.widgetpages.ProgressBarPage;
import pages.widgetpages.SliderPage;
import java.time.Duration;

@Data
public class BaseTests {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private BasePage basePage;
    private TextBoxPage textBoxPage;
    private PracticeFormPage practiceFormPage;
    private RadioButtonPage1 radioButtonPage1;
    private AlertsFunctionalityPage alertsFunctionalityPage;
    private ModalPage modalPage;
    private DatePickerPage datePickerPage;
    private ProgressBarPage progressBarPage;
    private SliderPage sliderPage;
    private LoginPage loginPage;
    private ProfilePage profilePage;
    private BookStorePage bookStorePage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandra\\kurs_qa\\hromdriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        this.basePage = new BasePage(driver, driverWait);
        this.textBoxPage = new TextBoxPage(driver, driverWait);
        this.practiceFormPage = new PracticeFormPage(driver, driverWait);
        this.radioButtonPage1 = new RadioButtonPage1(driver, driverWait);
        this.alertsFunctionalityPage = new AlertsFunctionalityPage(driver,driverWait);
        this.modalPage = new ModalPage(driver,driverWait);
        this.datePickerPage=new DatePickerPage(driver,driverWait);
        this.progressBarPage=new ProgressBarPage(driver,driverWait);
        this.sliderPage=new SliderPage(driver,driverWait);
        this.loginPage=new LoginPage(driver,driverWait);
        this.profilePage=new ProfilePage(driver,driverWait);
        this.bookStorePage=new BookStorePage( driver,driverWait);
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
    public BasePage getBasePage(){
        return basePage;
    }
    public TextBoxPage getTextBoxPage(){
        return textBoxPage;
    }
    public PracticeFormPage getPracticeFormPage(){
        return practiceFormPage;
    }

    public ModalPage getModalPage() {
        return modalPage;
    }

    public RadioButtonPage1 getRadioButtonPage1(){
        return radioButtonPage1;

    }

    public DatePickerPage getDatePickerPage() {
        return datePickerPage;
    }

    public ProgressBarPage getProgressBarPage() {
        return progressBarPage;
    }

    public SliderPage getSliderPage() {
        return sliderPage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public ProfilePage getProfilePage() {
        return profilePage;
    }

    public BookStorePage getBookStorePage() {
        return bookStorePage;
    }

    public  AlertsFunctionalityPage alertsFunctionalityPage(){
        return alertsFunctionalityPage;
        }
    }


