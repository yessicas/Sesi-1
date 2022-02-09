package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Header.FacebookLoginPage;

public class LoginPageStep {
    FacebookLoginPage facebookLoginPage;

    @Step
    public void openFacebook(){

        facebookLoginPage.open();
    }

    @Step
    public void inputEmailPassword(){
        facebookLoginPage.inputEmail();
        facebookLoginPage.inputPassword();
    }

    @Step
    public void clickButtonLogin(){
        facebookLoginPage.clickLogin();
    }

    @Step
    public void seeMyFedd(){

    }

}
