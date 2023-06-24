package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPageObject{

    private final By buttonButtons = By.xpath("//*[@id='item-4']");
    private final By buttonWebTablesButton = By.xpath("//*[@id='item-3']");


    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }
    public ButtonsPage clickButtonsTab() {
        scrollToElement(getElement((buttonButtons))).click();
      return new ButtonsPage(driver);
    }

    public WebTablesPage clickWebTables() {
        scrollToElement(getElement((buttonWebTablesButton))).click();
        return new WebTablesPage(driver);
    }



    }
