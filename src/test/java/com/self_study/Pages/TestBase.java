package com.self_study.Pages;

import com.self_study.utilities.Driver;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver driver=Driver.get();
    public Demo demo=new Demo();
    public Submit submit=new Submit();

    @BeforeMethod
    public void setup(){
        driver.get(demo.url());
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        Driver.get().quit();

    }
}
