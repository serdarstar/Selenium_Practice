package com.self_study;

import com.self_study.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver= Driver.get();
        driver.get("https://www.amazon.co.uk/");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.amazon.co.uk/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element1=driver.findElement(By.xpath("(//input[@id=\"twotabsearchtextbox\"])[1]"));
        element1.sendKeys("car");
        WebElement element=driver.findElement(By.xpath("(//*[@type=\"submit\"])[1]"));
        element.click();
//        WebElement element1=driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]"));
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
//        element1.sendKeys("G522BL", Keys.ENTER);

       driver.close();



    }
}
