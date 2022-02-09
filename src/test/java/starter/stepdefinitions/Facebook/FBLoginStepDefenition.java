package starter.stepdefinitions.Facebook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Header.FacebookLoginPage;
import starter.Step.LoginPageStep;

public class FBLoginStepDefenition {
    @Steps
    FacebookLoginPage facebookLoginPage;

    @Given("I open Facebook login page")
    public void openFacebookLogin (){
        facebookLoginPage.open();

    }

    @When("I input email and password")
    public void inputEmailandPassword(){
        facebookLoginPage.inputEmail();
        facebookLoginPage.inputPassword();

    }

    @When("I click button login")
    public void clickButtonLogin(){
        facebookLoginPage.clickLogin();

    }

    @Then("I can see my news feed")
    public void seeMyNewsFeed(){

    }


}
