package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage extends AbstractPageObject{


    private final By addButton = By.cssSelector("#addNewRecordButton");
    private final By editButton = By.cssSelector("#edit-record-1");
    private final By deleteButton = By.cssSelector("#delete-record-1");


    public WebTablesPage(WebDriver driver) {
        super(driver);
    }




    public RegistrationFormPage clickAddButton() {
        getElement(addButton).click();
        return  new RegistrationFormPage(driver);

    }

    public RegistrationFormPage clickEditButton() {
        getElement(editButton).click();
        return  new RegistrationFormPage(driver);
    }

    public void clickDeleteButton() {
        getElement(deleteButton).click();
    }

    public boolean isVerifyElement(String recordText) {

        try {
            driver.findElement(By.xpath("//div[@role='gridcell'][2][contains(text(),'" + recordText + "')]"));
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}

