package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Stepdefs {

    private WebDriver driver;
    private ShowBanner showBanner;
    private static final String PATH_TO_CHROMEDRIVER = "\\src\\test\\java\\resources\\hellocucumber\\chromedriver.exe";

    @Given("open main page")
    public void open_main_page() {
        showBanner.openMainPage();
     //   throw new cucumber.api.PendingException();
    }

    @When("find dress button")
    public void find_dress_button() {
        showBanner.clickDress();
    //    throw new cucumber.api.PendingException();
    }

    @Then("find banner")
    public void find_banner() {
        showBanner.findBanner();
    //    throw new cucumber.api.PendingException();
    }
}
