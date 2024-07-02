package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookPage extends BasePage {
    public BookPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    //Input xpath code pom builder
//    @FindBy(xpath = "")
//    WebElement input;
//
//    public void input(String firstName) {
//        doSetText(input, firstName);
//    }

}

