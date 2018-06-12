package gradle.cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    

    @When("I login")
    public void i_login() {
        // Write code here that turns the phrase above into concrete actions
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
    
}
