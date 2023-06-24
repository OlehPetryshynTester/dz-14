package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.AbstractPageObject;
import pageobjects.HomePage;
import pageobjects.WebTablesPage;

public class BaseTest {
    protected WebDriver driver;



    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
        driver.quit();
    }
}
