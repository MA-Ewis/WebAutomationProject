package Steps;

import Pages.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class LoginSteps {
    loginpage login=new loginpage();



    @Given("USER CLICK ON SIGN UP LOGIN BUTTON")
    public void USER_CLICK_ON_SIGN_UP_LOGIN_BUTTON() throws InterruptedException {
login.SIGN_UP_LOGIN_BUTTON().click();
    }

@When("USER ENTER EMAIL {string}")
    public void USER_ENTER_EMAIL(String email) throws InterruptedException {
    login.ENTER_EMAIL().sendKeys(email);
    }
@And("USER ENTER PASSWORD {string}")
    public void USER_ENTER_PASSWORD(String pass) throws InterruptedException {
    login.ENTER_PASSWORD().sendKeys(pass);
    }
@Then("USER CLICK ON LOGIN BUTTON")
    public void USER_CLICK_ON_LOGIN_BUTTON() throws InterruptedException {
    login.LOGIN_BUTTON().click();
    }




}
