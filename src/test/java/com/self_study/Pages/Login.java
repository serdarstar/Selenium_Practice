package com.self_study.Pages;

import com.self_study.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[5]")
    public WebElement capthca;



}
