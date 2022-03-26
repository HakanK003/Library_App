package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardIcon ;

    @FindBy(css = "a[href='#users']")
    public WebElement usersTab;

    @FindBy(css = "a[href='#books']")
    public WebElement booksTab;

    @FindBy(css = "a[class='nav-link dropdown-toggle']")
    public WebElement profileTab;


}
