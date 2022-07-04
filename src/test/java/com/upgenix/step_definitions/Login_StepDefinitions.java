package com.upgenix.step_definitions;
import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the Upgenix login page")
    public void user_is_on_the_upgenix_login_page() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }
    @When("{string} enters valid {string} and valid {string}")
    public void enters_valid_and_valid(String string, String string2, String string3) {
        loginPage.userName.sendKeys("posmanager10@info.com");
        loginPage.password.sendKeys("posmanager");

    }

    @When("user clicks on the {string} button on the login page")
    public void user_clicks_on_the_button_on_the_login_page(String string) {

        loginPage.LoginBtn.click();
    }

    @Then("user should see the title is {string}")
    public void user_should_see_the_title_is(String string) {

        String expectedTitle = "#Inbox - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
    }

    @When("{string} enters {string} and {string}")
    public void enters_and(String string, String string2, String string3) {
        loginPage.userName.sendKeys("posmanager100@info.com");
        loginPage.password.sendKeys("knsfcksamfkaem");
    }
    @Then("user should see {string} notice message")
    public void user_should_see_notice_message(String string) {

        String expectedResult3 = "Wrong login/password";
        String actualResult3 = loginPage.errorMessage.getText();

        Assert.assertEquals("Wrong login/password",expectedResult3,actualResult3);




    }
    @When("{string} enters valid {string} and empty {string}")
    public void enters_valid_and_empty(String string, String string2, String string3) {
        loginPage.userName.sendKeys("posmanager100@info.com");
        loginPage.password.sendKeys("");
    }
    @Then("user should see {string}")
    public void user_should_see(String string) {

        Assert.assertTrue(loginPage.fillTheFieldBtn.isDisplayed());

    }
    @Then("user should click the {string} link")
    public void user_should_click_the_link(String string) {

        loginPage.resetPasswordBtn.click();

    }
    @Then("user sould be able to land reset p")
    public void user_sould_be_able_to_land_reset_p() {

        String expectedTitle2 ="https://qa.upgenix.net/web/reset_password?";
        String actualTitle2 = Driver.getDriver().getTitle();


    }

    @Given(": Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.")
    public void verify_if_the_enter_key_of_the_keyboard_is_working_correctly_on_the_login_page() {

    }
    @When(": Users can log in with valid credentials")
    public void users_can_log_in_with_valid_credentials() {
        loginPage.userName.sendKeys("salesmanager@info.com");
        loginPage.password.sendKeys("salesmanager");

    }

}
