package StepDefinations;



import org.junit.runner.RunWith;

import PageObjectModel.loginPageObject;
import Resources.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations extends baseClass{
	 @Given("^Intialize the web driver$")
	    public void intialize_the_web_driver() throws Throwable {
		// driver=new ChromeDriver();
				 intialization();
	    }

	    @When("^user navaigates to website \"([^\"]*)\"$")
	    public void user_navaigates_to_website_something(String strArg1) throws Throwable {
	    	 driver.get(strArg1);
		    	//LaunchUrl();
	    }

	    @And("^enter (.+) and (.+) and click on login button$")
	    public void enter_and_and_click_on_login_button(String username, String password) throws Throwable {
	    	 loginPageObject LPO = new loginPageObject(driver);
			   LPO.EnterUsername().sendKeys(username);;
			   LPO.EnterPassword().sendKeys(password);;
			   LPO.ClickLoginButton().click();
	    }
	    
	    @Then("^user should be able to login sucessfully$")
	    public void user_should_be_able_to_login_sucessfully() throws Throwable {
	    	 System.out.println("hello");
	    }

}
