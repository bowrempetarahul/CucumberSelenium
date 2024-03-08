package pageobjects;

import CommonMethods.GenericMethods;
import cucumber.TestContext;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement OpenMenu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement Logout;

    public LogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogOut() {
        OpenMenu.click();
        Logout.click();
    }

}
