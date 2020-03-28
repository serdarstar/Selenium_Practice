package com.self_study.Tests;

import com.self_study.Pages.TestBase;
import com.self_study.utilities.Driver;
import com.self_study.utilities.ExcelUtil;
import org.junit.Ignore;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class LoginTest extends TestBase {
    WebDriver driver= Driver.get();
//    Demo demo=new Demo();
    String [][] dataGlobal=new String[4][1];
    WebDriverWait wait=new WebDriverWait (driver,5);


    @Test
    public void whatsapp() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(demo.whatsapp));
        demo.whatsapp.click();






    }



    @Ignore
    @Test
        public void List() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(demo.submit_Requirement));
        demo.submit_Requirement.click();
        submit.submitRequirement.click();
        driver.switchTo().frame(demo.iframe);
        wait.until(ExpectedConditions.visibilityOf(demo.letsGoButton));
        demo.letsGoButton.click();
        demo.sendEmail.sendKeys("aaaa@gmail.com", Keys.ENTER);







//        List<WebElement> products=demo.product;
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//
//
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(500);
//            //scrolling down
//            jse.executeScript("window.scrollBy(0,500)");
//
//        }

//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(500);
//            //scrolling up
//            jse.executeScript("window.scrollBy(0,-250)");
//
//        }



//        Actions actions=new Actions(driver);
//
//        actions.moveToElement(demo.productOne).pause(3000).click(products.get(4)).pause(3000).build().perform();



//        actions.moveToElement(demo.product1).clickAndHold().pause(3000).moveToElement(products.get(3)).pause(3000).click().build().perform();
        Thread.sleep(5000);



//        System.out.println("products.size() = " + products.size());
//        products.get(2).click();
//        List<String> list=new ArrayList<>();
//
//        for (int i = 0; i < products.size(); i++) {
////            System.out.println(products.get(i).getAttribute("innerHTML"));
//            String[] name=products.get(i).getAttribute("innerHTML").split("\">");
////            System.out.println("name[0].toString() = " + name[1].toString());
//            String [] b= name[1].split("<");
//            System.out.println(b[0].toString());
//            list.add(b[0].toString());
//
//
//        }
//
//        System.out.println("list.toString() = " + list.toString());


    }


    @DataProvider
    public Object[][] listData() throws IOException {
        ExcelUtil data = new ExcelUtil("src/test/resources/Book1.xlsx","Sheet2");

        String[][] dataArray = data.getDataArrayWithoutFirstRow();

        return dataArray;
    }


//    @Test(dataProvider="listData")
   @Test (dataProvider = "listData")
    public void data(String ListExcel){
        System.out.println(ListExcel);
       for (int i = 0; i < 1; i++) {
//           String[] strings = dataGlobal[i];
           dataGlobal[i][0]=ListExcel;
           System.out.println(dataGlobal[i][0]);
           Assert.assertEquals(ListExcel,dataGlobal[i][0]);
       }

//        Assert.assertEquals(ListExcel,"Back");


    }




    @Ignore
    @Test
    public void test1() throws InterruptedException {

        driver.get(demo.url());
        Thread.sleep(3000);
//        demo.hosting.click();
        demo.username.click();

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);
        //Set is just like arraylist but without duplicate values
        Set<String> windowHandles = driver.getWindowHandles();
        //how many different handles it is keeping
        System.out.println(windowHandles.size());
        for (String handle : windowHandles) {
            //checking handle is not equal to current page
            if(!currentWindowHandle.equals(handle)){
                System.out.println(handle);
                //switching to new window
                driver.switchTo().window(handle);
            }

        }


        driver.quit();

    }

    @Ignore
    @Test
    public void features() throws InterruptedException {
        driver.get(demo.url());
        driver.manage().window().maximize();
        demo.features.click();
        demo.navigateToModule("Flights","Cars");
        Thread.sleep(4000);
//        driver.navigate().back();
//        demo.image.click();
//
//
//
//        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//        String currentHandle=driver.getWindowHandle();
//        Set<String> windowHandles=driver.getWindowHandles();
//        System.out.println("windowHandles.size() = " + windowHandles.size());
//        for (String windowHandle : windowHandles) {
//            System.out.println("windowHandle = " + windowHandle);
//
//        }
//
//        for (String windowHandle : windowHandles) {
//            if(!currentHandle.equals(windowHandle)){
//                driver.switchTo().window(windowHandle);
//            }
//
//        }
//
//
//        Order order=new Order();
//
////        List<WebElement> features=order.featuresDropdown;
////        for (int i = 0; i < features.size(); i++) {
////            System.out.println("features.get(i).getText() = " + features.get(i).getText());
////        }
//
//////        Thread.sleep(3000);
//        WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Hotels Module')]"));
//        System.out.println("a.getText() = " + a.getAttribute("text"));
//
//        List<WebElement> features=order.featuresDropdown;
////        List<WebElement> features=driver.findElements(By.xpath("//body/header/div[@class='main-nav-holder']/div[@class='container']/nav[@id='main-menu']/ul[@class='nav reset']/li"));
//        for (WebElement feature : features) {
//            System.out.println("feature.getText() = " + feature.getAttribute("text"));
//
//        }



        List<WebElement> products=demo.product;
        System.out.println("products.size() = " + products.size());

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getAttribute("innerHTML"));
            String[] name=products.get(i).getAttribute("innerHTML").split("\">");
            System.out.println("name[0].toString() = " + name[1].toString());


            String [] b= name[1].split("<");
            System.out.println("b[0].toString() = " + b[0].toString());
        }

//        for (WebElement product : products) {
//            System.out.println("product.getAttribute(\"text\") = " + product.getAttribute("innerHTML"));
//            String[] name=product.getAttribute("innerHTML").split("\">");
//
//            String [] name2=name[]
//
//            for (int i = 0; i < name.length; i++) {
//               String [] b= name[i].split("<");
//                System.out.println("b = " + b[0]);
//
//            }
//
//        }

//        for (int i = 0; i < products.size(); i++) {
//            System.out.println("products.get(i).getAttribute(\"href\") = " + products.get(i).getAttribute("text"));
//        }


//
//        features.get(5).click();
//



//        WebDriverWait wait=new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOf(order.buy1));
//        order.buy1.click();
//        order.demo.click();
//        order.pricing.click();
        Thread.sleep(3000);
//        order.chat.click();






        driver.quit();

    }




    @AfterClass
    public void tearDown(){
        driver.quit();

    }
//    @Ignore
//    @BeforeMethod
//    public void setUpMethod(){
//
//        System.out.println("BEFORE METHOD");
//        System.out.println("OPENING THE BROWSER");
//    }

}
