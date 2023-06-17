package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.HomePage;

public class ButtonClickTest extends BaseTest {


    @Test
    public void openButtonsPage() {

            ButtonsPage buttonsPage = new HomePage(driver).clickButtonsTab();
            buttonsPage.clickClickMeButton();
            String messageText = buttonsPage.getMessage().toString();

            Assert.assertEquals(messageText, "You have done a dynamic click");


        }


        // Відкрити сторінку


        // Створити екземпляр класу HomePage

        // Натиснути на кнопку "Click Me"

        // Очікування для отримання тексту повідомлення

        // Отримати текст повідомлення та вивести його у консоль

    }

