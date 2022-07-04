package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy (xpath = "//*[@id=\"login\"]")
   public WebElement userName;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")
    public WebElement LoginBtn;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]/a")
    public WebElement resetPasswordBtn;

    @FindBy (xpath = "//*[@id=\"wrapwrap\"]/main/div/form/p")
    public WebElement errorMessage;

    @FindBy (xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]")
    public WebElement fillTheFieldBtn;







//1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
//
//2-"Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials
//
//3- "Please fill out this field" message should be displayed if the password or username is empty
//
//4-User land on the ‘reset password’ page after clicking on the "Reset password" link
//
//5-User should see the password in bullet signs by default
//
//6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.

}
