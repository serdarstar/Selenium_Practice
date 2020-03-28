package com.self_study.Pages;

import com.self_study.utilities.Driver;

import com.sun.xml.bind.v2.WellKnownNamespace;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
//import sun.jvm.hotspot.debugger.Page;

public class Demo extends BasePage {
    public Demo(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[8]/a")
    public WebElement username;

    @FindBy(xpath = "//span[contains(text(),'Hosting')]")
    public WebElement hosting;

    @FindBy(xpath = "//span[contains(text(),'Features')]")
    public WebElement features;

    @FindBy(xpath = "//div[@class='wow fadeInLeft ad collapse in hidden-xs animated']//a[1]//img[1]")
    public WebElement image;

    @FindBy(xpath = "//li[4]//div[1]//ul[1]/li")
    public List<WebElement> product;

    @FindBy(xpath = "//span[contains(text(),'Product')]")
    public WebElement productOne;


    @FindBy(xpath = "//div[@id='wh-widget-send-button']")
    public WebElement whatsapp;

    @FindBy(xpath = "//a[@class='btn btn-hero btn-success hero-right']")
    public WebElement submit_Requirement;

    @FindBy(xpath = "//iframe[@class='wispformPlugin-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//div[contains(text(), 'Let')]")
    public WebElement letsGoButton;

    @FindBy(xpath = "(//input[@class='UI_ShortText-InputBox'])[1]")
    public WebElement sendEmail;





    public  String url(){
        String url="https://phptravels.com/demo/";
        return url;

    }
}
