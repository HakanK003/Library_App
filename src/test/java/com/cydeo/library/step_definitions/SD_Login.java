package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class SD_Login {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @When("user enters librarian username {string}")
    public void user_enters_librarian_username(String username) {

        loginPage.usernameInputBox.sendKeys(username);

    }

    @When("user enters librarian password {string}")
    public void user_enters_librarian_password(String password) {

        loginPage.passwordInputBox.sendKeys(password);

    }

    @When("user click Sign in button")
    public void user_click_button() {

        BrowserUtils.highlight(loginPage.signInButton);

        loginPage.signInButton.click();

    }

    @Then("user should see the dashboard icon")
    public void user_should_see_the_dashboard() {

//        System.out.println(Driver.getDriver().getCurrentUrl());
//        System.out.println(Driver.getDriver().getTitle());
//        System.out.println(homePage.dashboardIcon.getText());
//        System.out.println("-----------------------");
//        System.out.println(homePage.dashboardIcon.getAttribute("textContent"));


        try {
            basePage.dashboardIcon.isDisplayed();
        } catch (NoSuchElementException e) {
            Assert.fail("Dashboard Link is Not presented");
//            System.out.println("Failed");
        }

        BrowserUtils.highlight(basePage.dashboardIcon);

        Assert.assertEquals("Dashboard", basePage.dashboardIcon.getText());

    }

    @When("user enters student username {string}")
    public void user_enters_student_username(String username) {

        loginPage.usernameInputBox.sendKeys(username);

    }
    @When("user enters student password {string}")
    public void user_enters_student_password(String password) {

        loginPage.passwordInputBox.sendKeys(password);

    }


}
