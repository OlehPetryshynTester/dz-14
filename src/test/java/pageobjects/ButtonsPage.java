package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends  AbstractPageObject {//*[@id="dynamicClickMessage"]
    private final By buttonClickMeButton = By.xpath("(//button[@class='btn btn-primary'])[3]");
    private final By message = By.xpath("//*[@id=\"dynamicClickMessage\"");

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

        public void clickClickMeButton() {
         getElement(buttonClickMeButton).click();
        }

        public HomePage getMessage(){


            String alertText = getElement(message, 5).getText();
               System.out.println("Текст повідомлення: " + alertText);
               return new HomePage(driver);

        }
    }

