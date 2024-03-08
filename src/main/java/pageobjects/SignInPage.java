package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver driver;
    @FindBy(name = "user-name")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[text()='Swag Labs']")
    private WebElement home_page;

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void Loginwithcredentials(String user_name, String pass_word) {
        username.sendKeys(user_name);
        password.sendKeys(pass_word);
        loginButton.click();
    }

    public String getHomepageName() {
        return home_page.getText();
    }

}
