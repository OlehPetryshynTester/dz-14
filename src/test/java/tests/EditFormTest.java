package tests;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.WebTablesPage;

@Test
public class EditFormTest extends BaseTest{

    public void editTest(){
        new HomePage(driver).clickWebTables()
                .clickEditButton()
                .editRegistrationForm("First","Last","weq@mail.com", "43","1200","test");

        boolean isRecordAdded = new WebTablesPage(driver).isVerifyElement("Last");
        if (isRecordAdded){
            System.out.println("This record is added");
        }
        else{
            System.out.println("This record is not added");
        }
    }
}
