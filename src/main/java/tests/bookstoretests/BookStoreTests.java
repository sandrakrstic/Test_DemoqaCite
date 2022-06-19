package tests.bookstoretests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.basetest.BaseTests;

public class BookStoreTests extends BaseTests {
    @BeforeMethod
      public void clickBookStoreApplication()  {
        getLoginPage().clickBookStoreApplication();
    }

    @Test  (priority = 1)
    public void verifyThatUserCanLogIn(){
         getLoginPage().clickLogin();
        getLoginPage().LoginInputData("sk","Marko Milos 1!");
        getLoginPage().clickLoginBtn();
        Assert.assertTrue(getProfilePage().isLogOutVisible());
    }
    @Test
    public void verifyThatUserCanLogOut(){
        getBookStorePage().clickBookStore();
        getBookStorePage().clickLogOut();
        Assert.assertTrue(getLoginPage().isLogInBtnVisible());
    }
    @Test
    public void verifyThatUserCanSearchBook(){
        getBookStorePage().clickBookStore();
        getBookStorePage().clickInputSearchField();
        getBookStorePage().enterBookName("Git");
        Assert.assertTrue(getBookStorePage().isGitPocketGuideVisible());
    }

    @Test
    public void verifyThatUserCanSelectBook(){
        getBookStorePage().clickBookStore();
        getBookStorePage().clickGitPocketGuideBook();
        Assert.assertEquals(getBookStorePage().getTitleOfBook(),"Git Pocket Guide");
    }
}
