package com.self_study.Pages;

import com.self_study.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Order {
    public Order(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//p[contains(text(), 'Live')]")
    public WebElement chat;

    @FindBy(xpath = "(//a[contains(@class,'hero-right')])[1]")
    public WebElement pricing;

    @FindBy(xpath = "//a[@class='btn btn-hero btns btn-light-blue']")
    public WebElement demo;

    @FindBy(xpath = "(//span[contains(text(),'Buy Now')])[1]")
    public WebElement buy1;

    @FindBy(xpath = "//body/header/div[@class='main-nav-holder']/div[@class='container']/nav[@id='main-menu']/ul[@class='nav reset']/li")
    public List<WebElement> featuresMenu;

    @FindBy(xpath = "//li[3]//div[1]/ul/li/a")
    public List<WebElement> featuresDropdown;
}
