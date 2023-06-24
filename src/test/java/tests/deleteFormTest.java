package tests;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.WebTablesPage;
@Test
public class deleteFormTest extends BaseTest{

    public  void  deleteForm(){

    new HomePage(driver).clickWebTables().clickDeleteButton();
}
}
