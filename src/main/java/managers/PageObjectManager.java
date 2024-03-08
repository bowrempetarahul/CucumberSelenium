package managers;

import CommonMethods.GenericMethods;
import org.openqa.selenium.WebDriver;
import pageobjects.LogoutPage;
import pageobjects.SignInPage;

public class PageObjectManager {

    private SignInPage signInPage;
    private WebDriver driver;
    private LogoutPage logoutPage;
    private GenericMethods genericMethods;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;
    }

    public SignInPage getSingPage() {
        return (signInPage == null) ? signInPage = new SignInPage(driver) : signInPage;
    }

    public LogoutPage getLogoutPage() {return (logoutPage == null) ? logoutPage= new LogoutPage(driver) : logoutPage;}

    public GenericMethods getGenericMethods(){return (genericMethods==null) ? genericMethods = new GenericMethods():genericMethods;}

}
