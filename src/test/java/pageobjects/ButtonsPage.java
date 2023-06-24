package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends  AbstractPageObject {//*[@id="dynamicClickMessage"]
    private final By buttonClickMeButton = By.xpath("(//button[@class='btn btn-primary'])[3]");
    private final By message = By.cssSelector("#dynamicClickMessage");

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

        public ButtonsPage clickClickMeButton() {
         getElement(buttonClickMeButton).click();
         return this;
        }

        public String getMessage() {


            String alertText = getElement(message, 5).getText();
            System.out.println("Текст повідомлення: " + alertText);
           return alertText;

        }
    }

