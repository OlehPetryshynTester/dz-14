package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPageObject{
    protected WebDriver driver;
    private final By buttonButtons = By.xpath("//*[@id=\"item-4\"]");
    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }
    public ButtonsPage clickButtonsTab() {
      getElement(buttonButtons).click();
      return new ButtonsPage(driver);
    }

}
