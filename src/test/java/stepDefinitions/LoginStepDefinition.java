package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import org.testng.Assert;
import pageobjects.LogoutPage;
import pageobjects.SignInPage;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {

    SignInPage signInPage;
    TestContext testContext;
    LogoutPage logoutPage;

    public LoginStepDefinition(TestContext context) {
        testContext = context;
        signInPage = testContext.getPageObjectManager().getSingPage();
        logoutPage = testContext.getPageObjectManager().getLogoutPage();
    }

    @Given("I Navigate to Swag Labs")
    public void i_login_to_orange_hrm() {
        System.out.println("Login Page");
    }

    @When("I provide credentials")
    public void i_provide_credentials() {
        signInPage.Loginwithcredentials(FileReaderManager.getInstance().getConfigReader().properties.getProperty("uname"), FileReaderManager.getInstance().getConfigReader().properties.getProperty("Password"));
    }

    @Then("Swag Labs home page should visible")
    public void orange_hrm_home_page_should_visible() {
        testContext.scenarioContext.setContext("Homepage", signInPage.getHomepageName());
        Assert.assertEquals(testContext.scenarioContext.getContext("Homepage"), "Swag Labs", "Home page is not found");
    }

    @Then("I Do Logout")
    public void iDoLogout() {
        logoutPage.doLogOut();
    }

    @When("I provide credentials with using datatable of cucumber")
    public void iProvideCredentialsWithUsingDatatableOfCucumber(DataTable usercredentials) {
        for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
            signInPage.Loginwithcredentials(data.get("username"),data.get("password"));
        }
    }


    @When("I enter Username as {string} and Password as {string}")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) {
        signInPage.Loginwithcredentials(username,password);
    }

    @When("I enter Username and Password using datatable")
    public void iEnterUsernameAndPasswordUsingDatatable(DataTable dataTable) {

        List<List<String>> credentials = dataTable.asLists(String.class);
        for (List<String> data : credentials)
        {
            System.out.println(data);
        }
    }
}



