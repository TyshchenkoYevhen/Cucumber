package hellocucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShowBanner {
    private static final String MAIN_PAGE_URL = "http://automationpractice.com";
    private WebDriver driver;

    private By dressButton = By.xpath("(//a[contains(text(),'Dresses')])[5]");
    private By chooseCasual = By.xpath("//a[contains(text(),'Casual Dresses')])[3]"); //
    private By banner = By.xpath("//div[@class='content_scene_cat_bg']");

    public ShowBanner (WebDriver driver) {
        this.driver = driver;
    }

    public ShowBanner openMainPage (){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }
    public ShowBanner clickDress (){
        this.driver.findElement(dressButton).click();
        return this;
    }

    public ShowBanner findBanner () {
        this.driver.findElement(banner).isDisplayed();
        return this;
    }
}
