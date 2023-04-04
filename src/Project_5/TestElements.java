package Project_5;

import Utility.BaseDriverParameters;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestElements {
    public  TestElements(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


    @FindBy(css = "[class='buttons']>button")  //stale element hatası verdi değiştirdim
    public WebElement login;

    @FindBy(xpath = "(//i[@class='right fas fa-angle-left '])[4]")
    public WebElement customers;


    @FindBy(xpath = "(//a[@href='/Admin'])[3]/..//following-sibling::li")
    public List<WebElement> sekmeler;

    @FindBy(css = "[class='nav nav-treeview']")
    public List<WebElement> sekmeler2;

    //*[text()='Customers']

    @FindBy(xpath= "(//a[@href='/Admin/Customer/List'])[1]")
    public WebElement customers1;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement addNew;

    @FindBy(css = "#Email")
    public WebElement email;

    @FindBy(css = "[id='Gender_Male']")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='DateOfBirth']")
    public WebElement dateOfBirth;

    @FindBy(css = "[id='IsTaxExempt']")  // değiştirdim
    public WebElement exempyt;


    @FindBy(css= "[name='save']")
    public WebElement save;


    @FindBy(css = "[class^='alert alert-success']")
    public WebElement success1;

    @FindBy(css = "[id='SearchEmail']")
    public WebElement searchEmail;

    @FindBy(css = "[name='SearchEmail']")
    public WebElement search;

    @FindBy(xpath = "//*[@class='odd']//td[2]")
    public WebElement customerConfirm;

    @FindBy (css = "[class='  button-column']>a")//name="SearchFirstName"  // id="SearchFirstName"  //id="SearchLastName"
    public WebElement edit;


    @FindBy(css = "[class='  text-center']")    //[class='  text-center']  //(//div[@class='dataTables_scrollBody'])//tbody/tr
    public WebElement registryExist;

    @FindBy(css = "[id='Email']")
    public WebElement editEmail;

    @FindBy(css = "[name='save']")
    public WebElement editSave;

    @FindBy(css = "[class^='alert alert-success']")
    public WebElement updateSuccess;

    @FindBy(css = "[id='SearchFirstName']")
    public  WebElement searchFirstName;

    @FindBy(css = "[id='SearchLastName']")
    public WebElement searchLastName;

    @FindBy(css = "[id='search-customers']")
    public WebElement searchCustomers;

    @FindBy(css = "[id='customer-delete']")
    public WebElement delete;

    @FindBy(css = "[class='alert alert-success alert-dismissable'] ")
    public WebElement deleteConfirm;

    @FindBy(css = "[class^='form-control admin-search-box']")
    public WebElement searchBox;

    @FindBy(css = "[class='tt-highlight']")
    public WebElement shipments;

    @FindBy(css = "#AdminComment")
    public WebElement adminComment;


    @FindBy(xpath = "(//*[text()='Test store 2'])[1]")
    public WebElement newsletter;

    @FindBy(xpath = "(//*[@class='k-multiselect-wrap k-floatwrap'])[2]")
    public WebElement customerRoles;

    @FindBy(css = "#VendorId")
    public WebElement managerOfVendor;

    @FindBy(xpath = "//*[text()='ismail@gmaiil.com']")
    public WebElement mail;

    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement editt;

    //[class='alert alert-success alert-dismissable']
    @FindBy(css = "[class='alert alert-success alert-dismissable']")
    public WebElement succesMesage;

    @FindBy(name = "save-continue")
    public WebElement saveContine;


    @FindBy(css = " [class='btn btn-danger float-right']")
    public WebElement delete2;


    @FindBy(css = "[dir='auto']")
    public WebElement searchTest;
}










































