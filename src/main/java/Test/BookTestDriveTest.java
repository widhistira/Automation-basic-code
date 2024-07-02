package Test;

import Page.BookPage;
import Page.OpenPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookTestDriveTest extends BaseTest {

    @BeforeMethod
    public void openweb() throws InterruptedException {
        OpenPage openPage = new OpenPage(BaseTest.driver, BaseTest.explicitWait);

    }

    @Test(testName = "Tester basic code ")
    public void BookADrive() throws InterruptedException {
        BookPage bookPage = new BookPage(BaseTest.driver,BaseTest.explicitWait);
        Page.ScrollPage scrollPage = new Page.ScrollPage(driver,explicitWait);
    }

}

