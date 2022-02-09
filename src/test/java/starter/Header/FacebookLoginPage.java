package starter.Header;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.facebook.com")
public class FacebookLoginPage extends PageObject {
    @FindBy(id="email")
    WebElement fieldEmail;
    public void inputEmail(){
        fieldEmail.sendKeys("sitorusyessica@yahoo.co.id");
    }

    @FindBy(how= How.NAME, using="login")
    WebElement loginButton;


    @FindBy(id="pass")
    WebElement fieldPassword;
    public void inputPassword(){
        fieldPassword.sendKeys("password");
    }

    //@FindBy
    //WebElement loginButton = $(By.cssSelector("button[name='login']"));
    public void clickLogin(){
        loginButton.click();
    }

    @FindBy
    WebElement registerButton = $(By.xpath("//*[@id='u_0_2_Bg']"));
    public void clickRegistwe(){
        registerButton.click();
    }

    @FindBy
    WebElement lupaSandi = $(By.xpath("//*[@id='u_0_e_6V']/div[3]/a"));
    public void lupaSandi(){
        lupaSandi.click();
    }
}
