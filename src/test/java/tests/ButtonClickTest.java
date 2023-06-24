package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.HomePage;
import pageobjects.WebTablesPage;

public class ButtonClickTest extends BaseTest {


    @Test
    public void openButtonsPage() {

             new HomePage(driver).clickButtonsTab()
                     .clickClickMeButton();
             Assert.assertEquals(new  HomePage(driver).clickButtonsTab().clickClickMeButton().getMessage(), "You have done a dynamic click");


        }


        // Відкрити сторінку


        // Створити екземпляр класу HomePage

        // Натиснути на кнопку "Click Me"

        // Очікування для отримання тексту повідомлення


        // Отримати текст повідомлення та вивести його у консоль

    }

