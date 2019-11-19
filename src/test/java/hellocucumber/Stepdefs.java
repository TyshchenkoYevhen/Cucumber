package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stepdefs  {

    private WebDriver driver;
    private ShowBanner showBanner;
    private static final String PATH_TO_CHROMEDRIVER = "D:\\GitHubJava\\Cucumber\\hellocucumber\\src\\test\\resources\\chromedriver.exe";

    @Given("open main page")
    public void open_main_page() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        showBanner = new ShowBanner(this.driver);
        showBanner.openMainPage();

       //driver.get(config.getProperty("baseurl"));
      // throw new cucumber.api.PendingException();
    }

    @When("find dress button")
    public void find_dress_button() {
        showBanner = new ShowBanner(driver);
        showBanner.clickDress();

      //  throw new cucumber.api.PendingException();
    }

    @Then("find banner")
    public void find_banner() {
        showBanner.findBanner();
       // throw new cucumber.api.PendingException();
    }
}
