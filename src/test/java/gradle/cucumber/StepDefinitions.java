package gradle.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class StepDefinitions {
    
	WebDriver driver;

    @Before
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Given("I open wikipedia")
    public void i_open_wikipedia() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
    }
    @When("I search {string}")
    public void i_search(String text) {
        // Write code here that turns the phrase above into concrete actions
        WebElement barreRecherche = driver.findElement(By.id("searchInput"));
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);
    }

    @Then("I should see {string} in the title")
    public void i_should_see_in_the_title(String expresult) {
        // Write code here that turns the phrase above into concrete actions
       String result = driver.findElement(By.id("firstHeading")).getText();
       Assert.assertEquals(result, expresult);
    }
    @After
    public void afterTest()
    {
        driver.quit();
    }
}
