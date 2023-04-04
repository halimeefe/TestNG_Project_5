package Project_5;

import Utility.BaseDriverParameters;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass extends BaseDriverParameters {


    TestElements el;

    @Test
    void Case1() {
        el = new TestElements(driver);
        driver.get(" https://admin-demo.nopcommerce.com/login?");

        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("arguments[0].click();", el.login);
        Assert.assertTrue(driver.getCurrentUrl().contains("admin"));

    }


    @Test
    void Case2() {

        el = new TestElements(driver);

        for (int i = 0; i < el.sekmeler.size(); i++) {
            if (el.sekmeler.get(i) == null) {// tıklanmıyorsa null verir..
                Assert.fail();
            }
            el.sekmeler.get(i).click();
        }
        for (WebElement list : el.sekmeler2) {
            if (list == null) {
                Assert.fail();
            }
        }

    }
    @Test
    void Case3() {
        el = new TestElements(driver);


        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click();", el.customers);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", el.customers1);


        el.addNew.click();

        el.email.sendKeys("Group7_@gmail.com");

        Actions aksiyon = new Actions(driver);
        Tools.Bekle(2);
        aksiyon.moveToElement(el.email).sendKeys(Keys.TAB).sendKeys("1234566")
                .sendKeys(Keys.TAB).sendKeys("Group_7")
                .sendKeys(Keys.TAB).sendKeys("TestNG5").build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(el.gender));
        el.gender.click();

        el.dateOfBirth.sendKeys("1/1/2003");

        aksiyon.sendKeys(Keys.TAB).sendKeys("Techno Study").build().perform();

        el.exempyt.click();

        Tools.Bekle(3);

       Actions actions=new Actions(driver);

       actions.moveToElement(el.save).click().build().perform();
       Tools.Bekle(3);

        System.out.println(el.success1.getText());

        Assert.assertTrue(el.success1.getText().toLowerCase().contains("added successfully"));

    }
    @Test
    void Case4() {
        el = new TestElements(driver);
        Tools.Bekle(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", el.customers1);
        Tools.Bekle(3);

        el.searchEmail.sendKeys("Group7_@gmail.com");

        Actions actions = new Actions(driver);
        actions.moveToElement(el.searchEmail).sendKeys(Keys.TAB)
                .sendKeys("Group_7").sendKeys(Keys.TAB)
                .sendKeys("TestNG5").build().perform();
        el.search.click();
        Tools.Bekle(3);

        System.out.println(el.registryExist.getText());
        Assert.assertTrue(el.registryExist.getText().toLowerCase().contains("Group7_@gmail.com"));

        Tools.Bekle(3);
        el.edit.click();
        Tools.Bekle(3);

        el.editEmail.clear();
        Tools.Bekle(3);
        el.editEmail.sendKeys("Batch3_@gmail.com");

        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("arguments[0].click();", el.editSave);

        System.out.println(el.updateSuccess.getText());

        Assert.assertTrue(el.updateSuccess.getText().toLowerCase().contains("updated successfully."));


    }
    @Test
    void Case5(){
     el=new TestElements(driver);
     el.customers.click();
     el.searchEmail.sendKeys("Batch3_@gmail.com");
     el.searchFirstName.sendKeys("Group7");
     el.searchLastName.sendKeys("TestNG5");
     el.searchCustomers.click();
     Tools.Bekle(3);
     el.edit.click();
     el.delete.click();
        System.out.println(el.deleteConfirm.getText());
        Assert.assertTrue(el.deleteConfirm.getText().toLowerCase().contains("deleted successfully"));
    }

    @Test
    void Case6(){
        el.searchBox.sendKeys("shipments");

        Actions actions=new Actions(driver);
        actions.moveToElement(el.shipments).click().build().perform();
        Tools.Bekle(3);
        System.out.println(driver.getCurrentUrl()); //   shipment url  https://admin-demo.nopcommerce.com/Admin/Order/ShipmentList
        wait.until(ExpectedConditions.urlToBe("Shipment"));
        Assert.assertTrue(driver.getCurrentUrl().contains("Shipment"));

    }
}




















