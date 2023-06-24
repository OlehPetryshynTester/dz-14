package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormPage extends AbstractPageObject{



    private final By firstNameField = By.cssSelector("#firstName");
    private final By lastNameField = By.cssSelector("#lastName");
    private final By emailField = By.cssSelector("#userEmail");
    private final By ageField = By.cssSelector("#age");
    private final By salaryField = By.cssSelector("#salary");
    private final By departmentField = By.cssSelector("#department");
    private final By submitButton = By.cssSelector("#submit");

    public RegistrationFormPage(WebDriver driver) {
        super(driver);
    }



    public WebTablesPage registrationForm(String firstName, String lastName, String email, String age, String salary, String department){
        getElement(firstNameField).sendKeys(firstName);
        getElement(lastNameField).sendKeys(lastName);
        getElement(emailField).sendKeys(email);
        getElement(ageField).sendKeys(age);
        getElement(salaryField).sendKeys(salary);
        getElement(departmentField).sendKeys(department);
        getElement(submitButton).click();
        return new WebTablesPage(driver);


    }
    public WebTablesPage editRegistrationForm(String firstName, String lastName, String email, String age, String salary, String department){
        getElement(firstNameField).clear();
        getElement(firstNameField).sendKeys(firstName);
        getElement(lastNameField).clear();
        getElement(lastNameField).sendKeys(lastName);
        getElement(emailField).clear();
        getElement(emailField).sendKeys(email);
        getElement(ageField).clear();
        getElement(ageField).sendKeys(age);
        getElement(salaryField).clear();
        getElement(salaryField).sendKeys(salary);
        getElement(departmentField).clear();
        getElement(departmentField).sendKeys(department);
        getElement(submitButton).click();
        return new WebTablesPage(driver);


    }





}
