package tests;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.WebTablesPage;



public class RegistrationFormTest extends BaseTest {
    private static final String FIRSTNAME = "Lola";
    private static final String LASTNAME = "Pola";
    private static final String EMAIL = "lola@mail.com";
    private static final String AGE = "63";
    private static final String SALARY = "800";
    private static final String DEPARTMENT = "Department";



    @Test
    public void testAddForm(){
           new HomePage(driver).clickWebTables()
                 .clickAddButton()
                 .registrationForm(FIRSTNAME,LASTNAME,EMAIL,AGE,SALARY,DEPARTMENT);
           boolean isRecordAdded = new WebTablesPage(driver).isVerifyElement(LASTNAME);
           if (isRecordAdded){
               System.out.println("This record is added");
           }
           else{
               System.out.println("This record is not added");
           }
    }


}
