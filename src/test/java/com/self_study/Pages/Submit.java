package com.self_study.Pages;

import com.self_study.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit extends BasePage{

    public Submit(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[@id='wispformPlugin-buttonPopup']//span[@class='hero-slogan']")
    public WebElement submitRequirement;
}
